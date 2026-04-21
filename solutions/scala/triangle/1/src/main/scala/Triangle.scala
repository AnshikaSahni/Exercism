case class Triangle(a:Double,b:Double,c:Double) { 


  def equilateral:Boolean = {
    isValidTriangle && ((a==b) && (b==c) && (c==a)) 
   
    
  }
  def isosceles:Boolean = {
    isValidTriangle && ((a==b) || (b==c) || (c==a)) 

    
  }
  def scalene:Boolean = {
    isValidTriangle && ((a!=b) && (b!=c) && (c!=a)) 
    
  }
  def isValidTriangle:Boolean = {
    (a != 0 &&  b != 0 && c != 0)  && ((a + b >= c) && (b + c >= a) && (a + c >= b))
  
  }
}