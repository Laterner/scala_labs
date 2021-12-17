package lab_4
import Typeclasses.{ testReversableString, testSmashInt, testSmashDouble, testSmashString}
object MainObject {
  def main(args: Array[String]): Unit = {
    println("<-----Compositions----->")
    println(testReversableString("Bib is bib but is never bib!"))
    println(testSmashInt(7, 7))
    println(testSmashDouble(7.0, 7.0))
    println(testSmashString("ab", "cd"))
  }
}
