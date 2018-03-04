def product(s : String) : Long = {
  var res : Long = 1
  for (c <- s) {
    res *= c
  }
  res
}


println("begin")
println(s"res = ${product("Hello")}")
println("end")