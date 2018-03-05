def swapPairs(a : Array[Int]) {
  for (i <- a.indices if i % 2 == 1) {
    val tmp = a(i)
    a(i) = a(i - 1)
    a(i - 1) = tmp
  }
}

val src = Array(1, 2, 3, 4, 5)
println(src.mkString(", "))
swapPairs(src)
println(src.mkString(", "))