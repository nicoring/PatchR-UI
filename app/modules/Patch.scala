package modules

import sun.util.calendar.CalendarDate

/**
 * Created by nico on 28.06.14.
 */

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