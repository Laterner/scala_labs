import Maps.{ User, testGroupUsers, testNumberFrodos, testUnderaged }
import Sequence.{ testLastElement, testZip, testForAll, testPalindrom, testFlatMap }
import Strings.{ testUppercase, testInterpolations, testComputation, testTakeTwo }
import Adts.{ testGetNth, testDouble, testIsEven, testSafeDivide, testGoodOldJava}

object MainObject {
  def main(args: Array[String]): Unit = {
    var mapaUsers = Seq(
      User("Jean", 20),
      User("Andre", 22),
      User("Marinette", 15),
      User("Alibert", 48),
      User("Obama", 52),
      User("Matis", 35)
    )
    var mapaUsers2 = Map(
      "Adam1" -> User("Jean Adam", 20),
      "Adam2" -> User("Andre", 22),
      "Adam3" -> User("AdamMarinette", 15),
      "Adam4" -> User("Ambre", 16),
      "Adam5" -> User("Adam Alibert", 48),
      "Adam6" -> User("Adam Abama", 51)
    )

    println("<-----Maps----->")
    println("testGroupUsers: " + testGroupUsers(mapaUsers))
    println("testNumberFrodos: " + testNumberFrodos(mapaUsers2))
    println("testUnderaged: " + testUnderaged(mapaUsers2))

    println()
    println("<-----Strings----->")
    println("testUppercase: " + testUppercase("hello my name is zuzzie with a z"))
    println("testInterpolations: " + testInterpolations("Jean", 20))
    println("testComputation: " + testComputation(3, 5))
    println("testTakeTwo: " + testTakeTwo("22"))
    println("testTakeTwo: " + testTakeTwo("4444"))

    println()
    println("<-----Sequence----->")
    println(testZip(
      Seq(
        1, 2, 4
    ),
      Seq(
        1, 2, 4
    )
    ))
    println("testForAll: " + testForAll(Seq(1, 0, 3, 4, 6))(x => x < 9))
    println("testForAll: " + testForAll(Seq(1, 0, 3, 4, 9))(x => x < 9))
    println("testLastElement: " + testLastElement(Seq(
      1, 2, 4, 3, 42
    )))
    println("testPalindrom: " + testPalindrom(Seq(
      1, 2, 1
    )))
    println("testPalindrom: " + testPalindrom(Seq(
      1, 2, 18
    )))
    var f = (value: Any) => Seq(Seq(value))
    println("testFlatMap: " + testFlatMap(Seq(1, 9, 1))(f))

    println()
    println("<-----Adts----->")
    println("testGetNth: " + testGetNth(List(1,2,3), 2))
    println("testDouble: " + testDouble(Some(21)))
    println("testIsEven: " + testIsEven(22))
    println("testSafeDivide: " + testSafeDivide(2, 0))
    println("testGoodOldJava: " + testGoodOldJava((str: String) => str.length, "string"))

  }
}
