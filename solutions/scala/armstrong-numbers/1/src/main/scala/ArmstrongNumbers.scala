object ArmstrongNumbers {
  def isArmstrongNumber(num:Int):Boolean ={
    val num_string = num.toString
    val num_size = num_string.length

    val resultArray = num_string.map{ case char => 
      Math.pow(char.asDigit,num_size)
      } 

    resultArray.sum == num
    
     
  }
}