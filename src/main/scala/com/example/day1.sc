package com.example
import cats._
import cats.std.all._
import cats.syntax.eq._
import cats.syntax.order._
import cats.syntax.partialOrder._
/*
Eq
Ord - is for types that have an ordering. ord covers all teh standard comparing fn <.<,>= and <=

*/
object day1 {

  /* Eq enables === and =!= syntax by declaring eqv method.
	Instead of the standard ==, Eq enables === and =!= syntax. main diff is === would fail compilation
	if tried to compare Int and String
*/

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //1 === "foo"

  // returns true if x and y are equivalent
  eq(1, "foo")                                    //> res0: Boolean = false
  ne(1, 1)                                        //> res1: Boolean = true

  /* Order enables compare syntac which returns Int: neg, zero or post.
 	
 */
  1 > 2.0                                         //> res2: Boolean(false) = false
  1.0 compare 2.0                                 //> res3: Int = -1
  1.0 max 2.0                                     //> res4: Double = 2.0

  // PartialOrder enables tryCompare syntax which returns Option[Int]

}