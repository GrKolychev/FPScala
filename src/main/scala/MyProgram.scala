package org.scala.fp

object MyProgram:
  def abs(n:Int): Int =
    if n < 0 then -n
    else n

  private def formatAbs(x: Int) =
    val msg = "The Absolute value of %d is %d"
    msg.format(x, abs(x))

  @main def printAbs(): Unit =
    println(formatAbs(-42))