object MunicipioManager {

  def generateMunType(nHabnitantes: Int): Int = {
    if(nHabnitantes<500){
      3
    }else if(nHabnitantes>500 && nHabnitantes<2000){
      2
    }else{
      1
    }
  }
}
