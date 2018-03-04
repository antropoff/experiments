def spec_pow(x : Int, n : Int) : Double = {
  if (n == 0) 
    1
  else {
    if (n < 0)
      1 / spec_pow(x, -n)
    else {
      if (n % 2 == 1)
        x * spec_pow(x, n - 1)
      else {
        var y : Double = spec_pow(x, n / 2)
        y * y
      }
    }
  }
}

println(s"res = ${spec_pow(2, 5)}")