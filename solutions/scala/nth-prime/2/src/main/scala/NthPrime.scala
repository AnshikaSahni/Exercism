object NthPrime {
  def prime(num:Int):Option[Int] = {
    if(num == 0) None 
    else findPrime(num)
  }

  def findPrime(num:Int):Option[Int] = 
  {
    def findPrime(currentnum:Int, currentIndex:Int, lastPrime:Int):Option[Int]=
    {
      if(currentIndex == num ) return Some(lastPrime)
      else {
        val isPrime = (for {i <- 2 to math.sqrt(currentnum).toInt} yield (currentnum%i==0) )
        if(isPrime.contains(true))findPrime(currentnum+1,currentIndex,lastPrime)
        else findPrime(currentnum+1,currentIndex+1,currentnum)
      }
    }
    findPrime(3,1,2)
  }
}