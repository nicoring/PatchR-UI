package controllers

import play.api.mvc._
import play.api.libs.json.Json._

import models.User

/**
 * Auth Controller
 * Tests login data and creates an session id on success
 */

object Auth extends Controller {

  def check(email: String, password: String) = {
    User.getUser(email, password) != null
  }

  def authenticate = Action(parse.json) { request =>
    val email = (request.body \ "mail").asOpt[String].getOrElse().toString

    val password = (request.body \ "password").asOpt[String].getOrElse().toString

    if (check(email, password)) {
      Ok(toJson(Map("status" -> "OK"))).withSession(Security.username -> email)
    } else {
      BadRequest(toJson(Map("message" -> "wrong password or username")))
    }
  }

  def logout = Action {
    Ok(toJson(Map("message" -> "logged out"))).withNewSession
  }

  def register = Action(parse.json) { request =>
    val email = (request.body \ "mail").asOpt[String].getOrElse().toString

    val password = (request.body \ "password").asOpt[String].getOrElse().toString

    User.create(email, password, "", false)

    Ok(toJson(Map("message" -> "registered")))
  }
}

trait Secured {
  def username(request: RequestHeader) = request.session.get(Security.username)

  def onUnauthorized(request: RequestHeader) = Results.Unauthorized(toJson(Map("message" -> "authorization required")))

  def withAuth(f: => String => Request[AnyContent] => Result) = {
    Security.Authenticated(username, onUnauthorized) { user =>
      Action(request => f(user)(request))
    }
  }
}
