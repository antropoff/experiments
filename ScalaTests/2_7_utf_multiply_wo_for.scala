var res : Long = 1

def multiply_char(c : Char) {
  res = res * c
}


println("begin")
"Hello".foreach(multiply_char)
println(s"res = $res")
println("end")