package controllers

import play.api._
import play.api.libs.json.Json._
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {

  def getPatch() = Action { //request =>
    //val requestedObject = (request.body \ "object").asOpt[String]
    Ok(toJson(
      Map(
        "patches" -> Seq(
          toJson(
            Map(
            "action" -> toJson("insert"),
            "advocates" -> toJson(5),
            "critics" -> toJson(0),
            "subject" -> toJson("dbp:Oregon"),
            "predicate" -> toJson("dbo:language"),
            "object" -> toJson("dbp:English_language"),
            "graph" -> toJson("http://dbpedia.org/"),
            "lastTime" -> toJson("2012-04-17 11:24:42")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(5),
              "critics" -> toJson(3),
              "subject" -> toJson("dbp:Berlin"),
              "predicate" -> toJson("dbo:capital_of"),
              "object" -> toJson("dbp:Germany"),
              "graph" -> toJson("http://dbpedia.de/"),
              "lastTime" -> toJson("2010-04-17 11:21:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(9),
              "critics" -> toJson(0),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.en/"),
              "lastTime" -> toJson("2011-04-17 11:22:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(3),
              "critics" -> toJson(4),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("delete"),
              "advocates" -> toJson(2),
              "critics" -> toJson(1),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          ),toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(5),
              "critics" -> toJson(0),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2012-04-17 11:24:42")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(5),
              "critics" -> toJson(3),
              "subject" -> toJson("dbp:Berlin"),
              "predicate" -> toJson("dbo:capital_of"),
              "object" -> toJson("dbp:Germany"),
              "graph" -> toJson("http://dbpedia.de/"),
              "lastTime" -> toJson("2010-04-17 11:21:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(9),
              "critics" -> toJson(0),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.en/"),
              "lastTime" -> toJson("2011-04-17 11:22:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(3),
              "critics" -> toJson(4),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("delete"),
              "advocates" -> toJson(2),
              "critics" -> toJson(1),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          ),toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(5),
              "critics" -> toJson(0),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2012-04-17 11:24:42")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(5),
              "critics" -> toJson(3),
              "subject" -> toJson("dbp:Berlin"),
              "predicate" -> toJson("dbo:capital_of"),
              "object" -> toJson("dbp:Germany"),
              "graph" -> toJson("http://dbpedia.de/"),
              "lastTime" -> toJson("2010-04-17 11:21:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(9),
              "critics" -> toJson(0),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.en/"),
              "lastTime" -> toJson("2011-04-17 11:22:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("insert"),
              "advocates" -> toJson(3),
              "critics" -> toJson(4),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          ),
          toJson(
            Map(
              "action" -> toJson("delete"),
              "advocates" -> toJson(2),
              "critics" -> toJson(1),
              "subject" -> toJson("dbp:Oregon"),
              "predicate" -> toJson("dbo:language"),
              "object" -> toJson("dbp:English_language"),
              "graph" -> toJson("http://dbpedia.org/"),
              "lastTime" -> toJson("2011-04-17 11:24:49")
            )
          )
        )
      )
    )
    )
  }

  def getAllPatches() =
    getPatch()

  def updatePatch(rdfObject: String) = TODO

  def insertPatch() = TODO

//  def show(page: String) = Action {
//    page match {
//      case "about" => Ok(views.html.index())
//      case "browsePatches" => Ok(views.html.browsePatches())
//      case "filterPatches" => Ok(views.html.filterPatches())
//      case "ontology" => Ok(views.html.ontology())
//      case _ => NotFound(views.html.error.notFound())
//    }
//  }

  def show(page: String) = Action {
    Redirect(routes.Assets.at("index.html"))
  }

  def assetRedirect(pathPre: String, file: String) = Action {
    val path = pathPre + "/" + file
    Redirect(routes.Assets.at(path))
  }

}