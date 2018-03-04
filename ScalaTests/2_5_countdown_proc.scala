def countdown(n : Int) {
  for (i <- n.to(0, -1))
    print(s"$i ")
}

countdown(7)