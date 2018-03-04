def product(s : String) : Long = {
  if (s.length == 1) {
    s.head
  } else {
    s.head * product(s.tail)
  }
}


println("begin")
println(s"res = ${product("Hello")}")
println("end")