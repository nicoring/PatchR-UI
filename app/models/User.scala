package models

import anorm._
import anorm.SqlParser._

import play.api.db._
import play.api.Play.current

case class User (
  mail: String,
  password: String,
  fullname: String,
  isAdmin: Boolean
)

object User {

  val user = {
    get[String]("email") ~
    get[String]("password") ~
    get[String]("fullname") ~
    get[Boolean]("isAdmin") map {
      case email ~ password ~ fullname ~ isAdmin => User(email, password, fullname, isAdmin)
    }
  }

  def all(): List[User] = DB.withConnection {implicit c =>
    SQL("select * from user").as(user *)
  }

  def getUser(email: String, password: String): User = DB.withConnection {implicit c =>
    val users =
    SQL(
      """
        select distinct *
        from user
        where email = {email}
        and password = {password}
      """
    ).on("email" -> email, "password" -> password).as(user *)

    if(users.length > 0) users(0) else null
  }

  def create(email: String, password: String, fullname: String, isAdmin: Boolean): Unit = {
    DB.withConnection { implicit c =>
      SQL(
        """
          insert into user (email, password, fullname, isAdmin)
          values ({email}, {password}, {fullname}, {isAdmin})
        """
      ).on(
          "email" -> email,
          "password" -> password,
          "fullname" -> fullname,
          "isAdmin" -> isAdmin
        ).executeUpdate()
    }
  }

  def delete(email: String): Unit = {
    DB.withConnection { implicit c =>
      SQL("delete from user where email = {email}").on("email" -> email).executeUpdate()
    }
  }
}
