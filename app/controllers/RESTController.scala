package controllers

import play.api.libs.json.Json._
import play.api.mvc._

/**
 * Created by nico on 27.07.14.
 */
object RESTController extends Controller {
  def getPatches() = Action {
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

  def updatePatch(rdfObject: String) = TODO

  def insertPatch() = TODO
}
