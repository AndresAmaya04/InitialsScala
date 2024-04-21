case class Municipio(nHabitante: Int, nombre:String, tamanoKm:Int) extends Greeter {

  def greet: String = s"Hola desde $nombre, mi poblacion es $nHabitante y tengo $tamanoKm km2"

  override def byeer(municipio: Municipio)(insulto: String): Int = {
    if (municipio.nHabitante< 500){
      1
    }else if (municipio.nHabitante> 900 && insulto.nonEmpty){
      2
    }else{
      69
    }
  }

  override def greet(mun: String): String = s"Hola desde $nombre"
}




