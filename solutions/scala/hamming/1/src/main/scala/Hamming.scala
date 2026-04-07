object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {
      if(dnaStrandOne.length != dnaStrandTwo.length) None 
      else {
         val result: Int = dnaStrandOne.zipWithIndex.filter{ case(value,index) =>  (dnaStrandTwo(index) != value)}.length
         Some(result)
      }         
  }
}
