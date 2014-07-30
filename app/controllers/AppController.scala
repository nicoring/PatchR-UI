package controllers

import play.api.mvc._


/**
 * Created by nico on 27.07.14.
 */
object AppController extends Controller{
  def index() = Action {
    Ok(views.html.index())
  }
}
