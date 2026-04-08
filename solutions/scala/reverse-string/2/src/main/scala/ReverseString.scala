object ReverseString {
  def reverse(str: String): String = {
  val output  =  for( i <- str.length-1 to 0 by -1) yield str(i)
   output.mkString("")
  }
}