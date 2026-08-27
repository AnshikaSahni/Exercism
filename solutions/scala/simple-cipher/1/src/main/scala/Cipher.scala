import scala.util.Random

case class Cipher(key:String) {
  def encode(msg:String) = {
     val resultant = key.zip(msg).map { case(keyValue,msgValue) => 
       ((((keyValue-'a')+(msgValue-'a'))%26)+97).toChar
     }.mkString
    resultant 
  }

  def decode(enmsg:String):String = {
    val resultant = enmsg.zip(key).map { case(enmsgValue,keyValue) => 
       ((((enmsgValue-'a')-(keyValue-'a'))%26)+97).toChar
     }.mkString
    resultant 
  }
}

object Cipher {
  def apply(optionKey:Option[String]):Cipher = {
    optionKey match {
      case None => Cipher(generateRandomKey)
      case Some(key) if isValidKey(key) => Cipher(key) 
      case _ => throw new IllegalArgumentException(" illegal argument") 
    }
  }

  def generateRandomKey:String = {
    Vector.fill(100)(Random.between(97,123).toChar).mkString  
  }

  def isValidKey(key:String) = {
    key.nonEmpty && key.forall(_.isLower) 
  }
}