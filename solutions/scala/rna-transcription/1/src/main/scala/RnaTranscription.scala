object RnaTranscription {
  def toRna(input:String):Option[String] = {
   val result =  input.map { 
      case 'G' => 'C'
      case 'C' => 'G'
      case 'T' => 'A'
      case 'A' => 'U'
      case _ => throw RuntimeException("Invalid Input")
    }

    Some(result)
  }
}