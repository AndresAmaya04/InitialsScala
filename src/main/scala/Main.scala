import java.util

object Main extends App {

  val x: Int = 1
  val y = x + 9

  (num: Int) => println((num*100)/100)

  val ff = () => println(x + y)


  def generarUnnumero (num : Int): Unit = {
  }

  def checkDeclaracionRenta(patriOne:Int, patriTwo:Int)(umbral:Int): Boolean = {
    (patriOne + patriTwo)>umbral
  }

  val declaracion = checkDeclaracionRenta(13000000, 30000000)(47000000)
  if(declaracion){
    println("Declara renta")
  }else{
    println("NO declara")
  }

  println("-----------------")

  println(checkDeclaracionRenta(23000000, 30000000)(47000000))

  def getName: String = System.getProperty("user.name")
  println("Hello, " + getName + "!")

  def generatePercetange(parcialValue: Int, totwalvalue:Int): String = {
    s"${(parcialValue * 100)/totwalvalue}%"  //s interpolator, {} -> para operaciones en el interpolator
  }

  println(generatePercetange(300, 560))
  println(generatePercetange(600, 560))

  val pesca = Municipio(5555, "Pesca", 77777)
  val pelabiaguaPueblo = Municipio(5555, "Pesca", 77777)
  val tunja = Municipio(979679, "Tunja", 565)
  val soga = Municipio(32332, "Soga", 9898)
  val ramiqui = Municipio(22112, "ramiriqui", 4353)
  println(pesca.greet)
  println(tunja.greet)
  println(soga.greet)
  println(ramiqui.greet)

  println(s"${pesca.nombre} es un numicipio categoria ${MunicipioManager.generateMunType(pesca.nHabitante)}")

  println(ramiqui.greet(ramiqui.nombre))
  println(ramiqui.byeer(ramiqui)("JJ"))
  println(ramiqui.byeer(ramiqui)(""))


  val num = Seq(1,2,3,4, "Hola", true)
  val names = ("Ttitma", "martin", 3, true)

  val set = new util.LinkedHashSet[Any]

  val set2 = new scala.collection.mutable.LinkedHashSet[Any]
  set2 += num
  set2.+=("Flak")
  set2 += names
  set2 += main _
  val i: Iterator[Any] = set2.iterator
  while (i.hasNext){
    println(i.next.toString)
  }

  val martin = new PersonMap[String, Int]("Martin", 53535335)
  val martinGringo = new PersonMap[String, Int]("Martin", 535335, "EE.UU")
  val andresGringo = new PersonMap[String, Int]("Andres", 566735, divisa = "Yen")
  val flakKross = new PersonMap[String, Int](nacionalidad = "Aleman", divisa = "Cornoas", dni = 5534, name = "Flak")
  val emilyNipona = new PersonMap[String, Int](name = "Emily", 555, "Japonesa")
  val miguelVeneco = new PersonMap[String, Int](name = "Miguel", dni = 77, nacionalidad = "Venezuela", divisa = "Bolivar")
  println(martin.toString)
  println(martinGringo.toString)
  println(andresGringo.toString)
  println(flakKross.toString)
  println(emilyNipona.toString)
  println(miguelVeneco.toString)
}

