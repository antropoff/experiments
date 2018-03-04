import java.time.LocalDate

implicit class DateInterpolator(val sc : StringContext) extends AnyVal {
  def date(args : Any*) : LocalDate = {
    print(s"${args(0)}")
    LocalDate.of(2018,1,31)
  }
}

println(date"2018-03-04")