import Compositions.{ testCompose, testMapFlatMap, testForComprehension }
import RecursiveFunctions.{ testReverse, testMap, testAppend, testFlatMap }
import RecursiveData.{ testListIntEmpty, testListIntHead }

object MainObject {
  def main(args: Array[String]): Unit = {
    println("<-----Compositions----->")
    println("testCompose: " + testCompose((num: Int) => num + num)((num: Int) => num / 2)(
      (num: Int) => num - 2
    )(5))
    println("testMapFlatMap: " + testMapFlatMap((x: Int) => Some(x))(Some(_))(Some(_))(
      Some(7)
    ))
    println("testForComprehension: " + testForComprehension((x: Int) => Some(x * x))((x: Int) =>
          Some(x * x)
        )((x: Int) => Some(x * x))(Some(2)))

    println()
    println("<-----RecursiveFunctions----->")
    println("testReverse: " + testReverse(Cons(3, Cons(7, Nil()))))
    println("testMap: " + testMap(Cons(3, Cons(7, Nil())), (num: Int) => num * 2))
    println("testAppend: " + testAppend(Cons(3, Cons(7, Nil())), Cons(13, Cons(17, Nil()))))
    println("testFlatMap: " + testFlatMap(
        Cons(10, Cons(11, Nil())),
        (x: Int) => Cons(x * x, Nil())
      )
    )

    println()
    println("<-----RecursiveData----->")
    println("testListIntEmpty: " + testListIntEmpty(Nil()))
    println("testListIntEmpty: " + testListIntEmpty(Cons(10, Cons(10, Nil()))))
    println("testListIntHead: " + testListIntHead(Nil()))

  }
}