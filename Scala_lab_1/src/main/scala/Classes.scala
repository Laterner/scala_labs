
import scala.util.Try

/* This task has no tests. It is an exercise for you to write different class structures.
 *
 * a) Создать класс Animal, который имеет следующие поля:
 *      - name: String (название)
 *      - species: String (вид)
 *      - food: String
 *
 *    Синтаксис: class MyClass(val publicField: Int, privateField: String) {
 *              // остальные поля и методы
 *            }
 */

/*
  class Animal (val publicField: Int, privateField: String){
  private var name: String = ""
  private var species: String = ""
  private var food: String = ""
}
* */

/* b) Создайте объект-компаньон для класса Animal и добавьте следующие сущности как поля:
 *      - cat, mammal, meat
 *      - parrot, bird, vegetables
 *      - goldfish, fish, plants
 *
 *    Синтаксис: object MyClass {
 *              // статические поля и методы
 *            }
 */


object Cat {
  private var name: String = "cat"
  private var species: String = "mammal"
  private var food: String = "meat"
}
object Parrot {
  private var name: String = "parrot"
  private var species: String = "bird"
  private var food: String = "vegetables"
}
object GoldenFish {
  private var name: String = "golden fish"
  private var species: String = "fish"
  private var food: String = "plants"
}


/*
* c) Добавьте следующие метод в Animals:
*      def eats(food: String): Boolean
*
*     который проверяет ест ли животное определенную пищу
*
* d) Переопределите ваш класс Animal как трейт и создайте объекты класса-образца для Mammals, Birds и Fishs.
*    Вам все еще нужно поле `species`?
*/

trait Animal {
  var name: String
  var food: String
}

/*
* e) Добавьте следующие функции в объект-компаньон Animal:
*      def knownAnimal(name: String): Boolean  // true если это имя одного из трех животных из (b)
*      def apply(name: String): Option[Animal] // возвращает одно из трех животных в соответствии с именем (Some) или ничего (None), см. ниже
*/

object Animal {
  def knownAnimal(name: String, animalName: Animal): Boolean = (animalName.name == name)
  def apply(list:List[Animal], name: String, animalName: Animal): Option[Animal] =
    {
      Try(list.head).toOption
    }
}

/*
 * f) Создайте трейт Food со следующими классами-образцами:
 *      - Meat
 *      - Vegetables
 *      - Plants
 *   и добавьте это в определение Animal. Так же добавьте объект-компаньон с методом apply():
 *      def apply(food: String): Option[Food]
 */

trait Food
case object Meat extends Food
case object Vegetables extends Food
case object Plants extends Food
