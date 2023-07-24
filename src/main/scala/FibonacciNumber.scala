package org.scala.fp

import scala.annotation.tailrec

object FibonacciNumber:

  def fib(n:Int): Int =
    @tailrec
    def go(n:Int, current:Int, next: Int): Int =
      if n <= 0 then current
      else go(n - 1, next, current + next)

    go(n, 0, 1)


  @main def find(): Unit =
    val num = 19
    println("Calculated %dth fibonacci number is %d".format(num, fib(num)))

