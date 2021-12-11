import Functions.{testCircle, testRectangleCurried, testRectangleUc, currFunc}
import HigherOrder.{testNTimes, plus, multiply, testAnonymousNTimes}
import PatternMatching.{testIntToString, testUpdateFood, testIsMaxAndMoritz, testIsEven, tests}

object MainObject {
  def main(args: Array[String]): Unit = {
    // Function.scala

    println("Functions")
    println("testCircle: " +  testCircle(8))
    println("testRectangleCurried: " +  testRectangleCurried(8, 8))
    println("testRectangleUc: " + testRectangleUc(8, 8))

    // Зачем каррирование
    val rectangle = currFunc(8)
//    println("rectangle: " + rectangle)
    println("rectangle: " + rectangle(6))


    println("\nHigherOrder")
    println("testNTimes: " + testNTimes(plus, 2, 3, 2))
    println("testNTimes: " + testNTimes(multiply, 2, 3, 2))
    println("testAnonymousNTimes: " + testAnonymousNTimes(3, 2, 5))


    println("\nPatternMatching")
    println("testIntToString: " + testIntToString(1))
    println("testIntToString: " + testIntToString(3))
    println("testIntToString: " + testIntToString(10))

    println("testIsMaxAndMoritz: " + testIsMaxAndMoritz("Max"))
    println("testIsMaxAndMoritz: " + testIsMaxAndMoritz("moritz"))
    println("testIsMaxAndMoritz: " + testIsMaxAndMoritz("Maximus"))

    println("testIsEven: " + testIsEven(1))
    println("testIsEven: " + testIsEven(8))

    tests()


    println("\nClasses")
  }
}
