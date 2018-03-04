println("begin")
var res : Long = 1
for (s <- "Hello") {
  res *= s
}
println(s"res = $res")
println("end")