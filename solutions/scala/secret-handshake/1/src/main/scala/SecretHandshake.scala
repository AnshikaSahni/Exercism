object SecretHandshake {
  def commands(num:Int):List[String] ={
    val binaryNum = num.toBinaryString 
    binaryNum.reverse.zipWithIndex.foldLeft(List.empty[String]){ case (acc, (num,index)) => 
      if(num == '1') {
      index match  {
        case 0 =>  acc :+ "wink"
        case 1 =>  acc :+"double blink"
        case 2 =>  acc :+"close your eyes"
        case 3=>   acc :+"jump"
        case 4 =>  acc.reverse
        case _=> throw new RuntimeException( "index out of limit")
      }
    } else acc
  }
  }
}