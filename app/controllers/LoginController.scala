package controllers

import play.api.mvc._
import play.api.libs.json.Json._

/**
 * Login Controller
 * Tests login data and creates an session id on success
 *
 */

object LoginController extends Controller {
  def login() = Action(parse.json) { request =>
    val email = (request.body \ "mail").asOpt[String].getOrElse(
      Ok(toJson(
        Map("status" -> "OK", "id" -> "")
      ))
//      BadRequest(toJson(
//        Map("status" -> "KO", "id" -> "")
//      ))
    )
    val password = (request.body \ "pass").asOpt[String].getOrElse(
      Ok(toJson(
        Map("status" -> "OK", "id" -> "")
      ))
//      BadRequest(toJson(
//        Map("status" -> "KO", "id" -> "")
//      ))
    )

    if (email == "test" && password == "1234") {
      Ok(toJson(
        Map("status" -> "OK", "id" -> "1234")
      ))
    } else {
      Ok(toJson(
        Map("status" -> "OK", "id" -> "")
      ))
    }
  }

  def testLogin(id: String): Boolean = {
    true
  }
}