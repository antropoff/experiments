val arr = Array(1, -5, -1, 2, -5, 0, 3)
println(s"arr = ${arr.mkString(", ")}")
val posToRemove = for (i <- arr.indices if arr(i) < 0) yield i
println(s"posToRemove = ${posToRemove.mkString(", ")}")
val bufToRemove = posToRemove.reverse.toBuffer
bufToRemove.trimEnd(1)
println(s"bufToRemove = $bufToRemove")
val buf = arr.toBuffer
for (i <- bufToRemove) buf.remove(i)
println(s"buf = $buf")
