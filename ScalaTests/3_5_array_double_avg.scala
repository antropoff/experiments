def calcAvg(a : Array[Double]) : Double = {
  var res : Double = 0
  if (a.length > 0) res = a.sum / a.length
  res
}

val arr = Array(0.1, 0.2, 0.3)
println(arr.mkString("<", ", ", ">"))
val avg = calcAvg(arr)
println(avg)