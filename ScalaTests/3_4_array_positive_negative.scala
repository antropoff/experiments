def positiveThanNegative(a : Array[Int]) : Array[Int] = {
  val posA = for (elem <- a if elem > 0) yield elem 
  val negA = for (elem <- a if elem <= 0) yield elem
  val b = posA.toBuffer
  b ++= negA
  b.toArray
}

val src = Array(0, 2, -1, 1, -3, 0, 7, 9)
println(src.mkString(", "))
val dest = positiveThanNegative(src)
println(dest.mkString(", "))