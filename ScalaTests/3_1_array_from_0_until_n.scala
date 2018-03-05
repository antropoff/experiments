def createArray(n : Int) : Array[Int] = {
  val res = for (i <- 0 until n) yield i
  res.toArray
}

println(createArray(7).mkString(", "))