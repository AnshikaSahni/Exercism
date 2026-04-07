object Bob {
   def yell(statement:String):Boolean = {
   ((!statement.filter(char => char.isLetter).isEmpty)) && (statement.toUpperCase == statement) 
  }

  def question(statement:String):Boolean ={
    statement.trim.endsWith("?")
  }

  def silence(statement:String):Boolean ={
    statement.trim.isEmpty
  }
  def response(statement: String): String = {
    statement match { 
      case statement if( question(statement) && yell(statement)) => "Calm down, I know what I'm doing!"
      case statement if( question(statement)) => "Sure."
      case statement if(yell(statement)) => "Whoa, chill out!"
      case statement if(silence(statement)) => "Fine. Be that way!"
      case _ => "Whatever."
        
    }   
  }
}
