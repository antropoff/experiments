def swapPairs(a : Array[Int]) : Array[Int] = {
  val res = for (i <- a.indices) yield {
    if (i % 2 == 0) {
      if (i == a.length - 1) {
        a(i)
      } else {
        a(i + 1)
      }
    } else {
      a(i - 1)
    }
  } 
  res.toArray
}

val src = Array(1, 2, 3, 4, 5)
println(src.mkString(", "))
val dest = swapPairs(src)
println(dest.mkString(", "))