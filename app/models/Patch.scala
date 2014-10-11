package models

import sun.util.calendar.CalendarDate

case class Patch(
  action: Enumeration,
  advocates: Int,
  critics: Int,
  subject: String,
  predicate: String,
  rdfobject: String,
  graph: String,
  lastTime: CalendarDate
)

object Patch {

}