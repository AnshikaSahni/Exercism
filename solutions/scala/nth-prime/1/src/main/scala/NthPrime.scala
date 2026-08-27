object NthPrime {
  def prime(num:Int):Option[Int] = {
  
      if(num == 0) return None 
      else {
        var count = 0
        var currentNum = 1
        while(count < num )
        {
          currentNum+=1
          var isPrime = true
          for (i <- 2 to math.sqrt(currentNum).toInt) {
           if (currentNum % i == 0) {
             isPrime = false
           }
}
          if(isPrime)  count+=1
        }
        Some(currentNum)
      }
            
    }
  }
