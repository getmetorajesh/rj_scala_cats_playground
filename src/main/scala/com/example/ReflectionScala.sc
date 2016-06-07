package com.example
import scala.reflect.ClassTag
import scala.util.Try

/* example of Runtime Reflection in scala. example by Travis Brown
*/
case class Person(name: String, age: Double)
case class Book(title: String, author: String, year: Int)


object ReflectionScala {
  	println("Welcome to the Scala worksheet")
	ReflectiveRowParser[Person]("Amy,54.2")
	
	
	object ReflectiveRowParser {
	def apply[T: ClassTag](s: String) : Option[T] = Try {
		val ctor = implicitly[ClassTag[T]].runtimeClass.getConstructors.head
		val paramsArray =s.split(",").map(_.trim)
		val paramsWithTypes = paramsArray.zip(ctor.getParameterTypes)
		
		val parameters = paramsWithTypes.map {
      case (param, cls) => cls.getName match {
        case "int" => param.toInt.asInstanceOf[Object]
        case "double" => param.toDouble.asInstanceOf[Object]
        case _ =>
          val paramConstructor = cls.getConstructor(param.getClass)
          paramConstructor.newInstance(param).asInstanceOf[Object]
      }
    }
   
   ctor.newInstance(parameters: _*).asInstanceOf[T]
   
	}.toOption
	}
	
}