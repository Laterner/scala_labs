import Functions.{testCircle, testRectangleCurried, testRectangleUc, currFunc}
import HigherOrder.{testNTimes, plus, multiply, testAnonymousNTimes}
import PatternMatching.{testIntToString, testIsMaxAndMoritz, testIsEven, tests}

object MainObject {
  def main(args: Array[String]): Unit = {
    // Function.scala

    println("Functions")
    println(testCircle(8))
    println(testRectangleCurried(8, 8))
    println(testRectangleUc(8, 8))

    // Зачем каррирование
    val rectangle = currFunc(8)
//    println(rectangle)
    println(rectangle(6))



    println("\nHigherOrder")
    println(testNTimes(plus, 2, 3, 2))
    println(testNTimes(multiply, 2, 3, 2))
    println(testAnonymousNTimes(3, 2, 5))



    println("\nPatternMatching")
    println(testIntToString(1))
    println(testIntToString(3))
    println(testIntToString(10))

    println(testIsMaxAndMoritz("Max"))
    println(testIsMaxAndMoritz("moritz"))
    println(testIsMaxAndMoritz("Maximus"))

    println(testIsEven(1))
    println(testIsEven(8))

    tests()


    println("\nClasses")
  }
}
