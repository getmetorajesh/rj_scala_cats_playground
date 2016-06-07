package com.example
import cats._
import cats.std.all._
import cats.syntax.eq._
import cats.syntax.order._
import cats.syntax.partialOrder._

/*
Eq
Ord - is for types that have an ordering. ord covers all teh standard comparing fn <.<,>= and <=
PartialOrder - enables tryCompare syntax which returns Option[Int]
Show - similar to toString on Any except with Any you lose typesafety
*/
object day1 {

  /* Eq enables === and =!= syntax by declaring eqv method.
	Instead of the standard ==, Eq enables === and =!= syntax. main diff is === would fail compilation
	if tried to compare Int and String
*/

  println("Welcome to the Scala worksheet")

  //1 === "foo"

  // returns true if x and y are equivalent
  eq(1, "foo")
  ne(1, 1)

  /* Order enables compare syntac which returns Int: neg, zero or post.
 	
 */
  1 > 2.0
  1.0 compare 2.0
  1.0 max 2.0

  // PartialOrder enables tryCompare syntax which returns Option[Int]
  import cats.syntax.partialOrder._
  1 tryCompare 2
  1.0 tryCompare Double.NaN

  day11.func()
}

object day11 {
  def func() {
    import cats.syntax.show._
    println((new {}).toString())
     println((new {}).show)
    //(new {}).show()
  }
}