object Twofer {
  def twofer(name:String = ""): String = {
    val noName = "One for you, one for me."
    val WithName = s"One for $name, one for me."
    if(name.isEmpty()) noName
    else WithName
    
    }
}
