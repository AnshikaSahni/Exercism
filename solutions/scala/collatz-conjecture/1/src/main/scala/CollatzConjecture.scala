object CollatzConjecture {

  def steps(num:Int):Option[Int] = {
     num match  {
      case num if( num<1 ) => None
      case _ => findSteps(num,0)
    }
  }
  
  def findSteps(num:Int,acc:Int):Option[Int] = {
     num match {
       case 1 => Some(acc) 
       case num if (num%2 == 0) => findSteps(num/2,acc+1)
       case _ => findSteps(((num*3)+1),acc+1)
     }

  }
}
