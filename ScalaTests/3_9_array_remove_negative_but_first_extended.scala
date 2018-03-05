val arr = Array(1, -5, -1, 2, -5, 0, 3)
println(s"arr = ${arr.mkString(", ")}")
val posToRemove = for (i <- arr.indices if arr(i) < 0) yield i
println(s"posToRemove = ${posToRemove.mkString(", ")}")
val bufToRemove = posToRemove.toBuffer
bufToRemove.trimStart(1)
println(s"bufToRemove = $bufToRemove")
val posToCopy = for (i <- arr.indices if arr(i) >= 0 && i > bufToRemove(0)) yield i
println(s"posToCopy = ${posToCopy.mkString(", ")}")
val buf = arr.toBuffer
for (i <- posToCopy.indices) {
  if (i < bufToRemove.length) {
    buf(bufToRemove(i)) = buf(posToCopy(i))
  } else {
    buf(buf.length - bufToRemove.length - 1 + i - bufToRemove.length) = buf(posToCopy(i))
  }
}
//buf.trimEnd(bufToRemove.length)
println(s"buf = $buf")
