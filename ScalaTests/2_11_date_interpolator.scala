import java.time.LocalDate

object ScalaTest extends App {
  implicit class DateInterpolator(val sc : StringContext) extends AnyVal {
    def date(args : Any*) : LocalDate = {
      println(s"sc = ${sc}")
      println(s"args = ${args}")
      if (args.length == 3) {
        //here should be more checks, including parsing sc parts to fill year|mon|day not from args
        val strings = sc.parts.iterator
        val year : Int = args(0).toString.toInt
        val mon : Int = args(1).toString.toInt
        val day : Int = args(2).toString.toInt  
        val dt = LocalDate.of(year, mon, day)
        dt
      } else {
        println(s"args.length = ${args.length}")
        throw new Exception("AAAA!!!")
      }
    }
  }

  val year : Int = 2018
  val mon : Int = 3
  val day : Int = 6

  val dt : LocalDate = date"$year-$mon-$day"
//  println(date"$year-$mon-$day")
  println(dt)
  println(dt.getYear)
}

