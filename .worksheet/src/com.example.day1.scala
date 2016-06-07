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
object day1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(506); 

  /* Eq enables === and =!= syntax by declaring eqv method.
	Instead of the standard ==, Eq enables === and =!= syntax. main diff is === would fail compilation
	if tried to compare Int and String
*/

  println("Welcome to the Scala worksheet");$skip(77); val res$0 = 

  //1 === "foo"

  // returns true if x and y are equivalent
  eq(1, "foo");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(11); val res$1 = 
  ne(1, 1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(90); val res$2 = 

  /* Order enables compare syntac which returns Int: neg, zero or post.
 	
 */
  1 > 2.0;System.out.println("""res2: Boolean(false) = """ + $show(res$2));$skip(18); val res$3 = 
  1.0 compare 2.0;System.out.println("""res3: Int = """ + $show(res$3));$skip(14); val res$4 = 
  1.0 max 2.0;System.out.println("""res4: Double = """ + $show(res$4))}

  // PartialOrder enables tryCompare syntax which returns Option[Int]

}
