

/** Напишите решение в виде функции. 
  * 
  * Синтаксис:
  *   val a: Int = ???
  * 
  *   a match {
  *     case 0 => true
  *     case _ => false
  *   }
  */
object PatternMatching {

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissor extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {
    val name: String
    val food: Food
  }

  case class Mammal(name: String, food: Food, weight: Int) extends Animal
  case class Fish(name: String, food: Food)                extends Animal
  case class Bird(name: String, food: Food)                extends Animal



  /* a) Напишите функцию, которая ставит в соответствие числу строку слудеющим образом:
   * Если:
   *     1 => "it is one"
   *     2 => "it is two"
   *     3 => "it is three"
   *     иначе => "what's that"
   */
  def intToString(value: Int): String = value match {
    case  1 => "it is one"
    case  2 => "it is two"
    case  3 => "it is three"
    case  _ => "what's that"
  }

  // примените вашу функцию из пункта (a) здесь, не изменяя сигнатуру
  def testIntToString(value: Int): String = intToString(value)

  /* b) Напишите функцию которая возвращает true если переменная `value` принимает значение:
   *     "max" или "Max
   *     "moritz" или "Moritz"
   */
  def isMaxAndMoritz(value: String): Boolean = value match {
    case  "max" => true
    case  "Max" => true
    case  "moritz" => true
    case  "Moritz" => true
    case  _ => false
  }

  // примените функции из пункта (b) здесь, не изменяя сигнатуру
  def testIsMaxAndMoritz(value: String): Boolean = isMaxAndMoritz(value)

  // c) Напишите функцию проверки является ли `value` четным 
  val IsEven = (value: Int) => {
    if (value % 2 == 1)
      false
    else
      true
  }

  // примените функции из пункта (c) здесь, не изменяя сигнатуру
  def testIsEven(value: Int): Boolean = IsEven(value)


  
  /* d) Напишите функцию, моделирующую игру в Камень ножницы бумага 
   *     1. камень побеждает ножницы
   *     2. ножницы побеждают бумагу
   *     3. бумага побеждает камень
   *    Выиграет ли игрок `a`?
   */

//  case object Rock    extends Hand
//  case object Paper   extends Hand
//  case object Scissor extends Hand

  def isWinsA(a: Hand, b: Hand): Result = {
    if (a == Rock && b == Paper)
      Lose
    else if (a == Rock && b == Scissor)
      Win
    else if (a == Paper && b == Scissor)
      Lose
    else if (a == Paper && b == Rock)
      Win
    else if (a == Scissor && b == Rock)
      Lose
    else if (a == Scissor && b == Paper)
      Win
    else
      Draw
  }

  // примените вашу функцию из пункта (d) здесь, не изменяя сигнатуру
  def testWinsA(a: Hand, b: Hand): Result = isWinsA(a, b)



  // Примечание: используйте определение Animals

  // e) Верните вес (weight: Int) объекта Mammal, иначе верните -1.
  def ExtractMammalWeight(animal: Animal): Int = animal match {
    case Mammal(name, food, weight) => weight
    case _ => -1
  }


  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру
  def testExtractMammalWeight(animal: Animal): Int = ExtractMammalWeight(animal)

  // f) Измените поле еда объектов классов Fishes и Birds на Plants, класс Mammels оставьте неизмененным.

  def updateFood(animal: Animal): Animal = animal match {
    case Fish(name, food)=> Fish(animal.name, Plants)
    case Bird(name, food)=> Bird(animal.name, Plants)
    case _ => animal
  }

  // примените функцию из пункта (f) здесь, не изменяйте сигнатуру
  def testUpdateFood(animal: Animal): Animal = updateFood(animal)

  def tests(): Unit = {
    println(testWinsA(Paper, Rock))
    println(testWinsA(Scissor, Rock))
    println(testExtractMammalWeight(Mammal("Human", Meat, 85)))
    println(testUpdateFood(Bird("Cacadoo", Meat)))
  }
}
