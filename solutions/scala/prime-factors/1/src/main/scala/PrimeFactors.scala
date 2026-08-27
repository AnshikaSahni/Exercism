object PrimeFactors {

  def factors(num:Long) ={
      getPrimeFactors(num)    
  }

  def getPrimeFactors(num:Long) ={
    def getPrimeFactors(nums:Long , divisor:Long, acc:List[Long]):List[Long] = {

       nums match {
         case 1  => return acc 
         case n if(n%divisor == 0) => getPrimeFactors(n/divisor,divisor, acc:+divisor)
         case n if(n%divisor != 0) => getPrimeFactors(n,divisor+1, acc)      
       }
      
    }
    getPrimeFactors(num,2L,List.empty[Long])
  }
  

}