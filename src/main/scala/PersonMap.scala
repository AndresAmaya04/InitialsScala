 class PersonMap [T, R] (name : String, dni: Int, nacionalidad:String = "Colombiana", divisa: String = "Euro") {
  override def toString: String = s"$name, $dni, $nacionalidad, $divisa"

  val nationality = nacionalidad

  def extractNacionalidad : String = {
    nacionalidad
  }
}


