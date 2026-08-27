import scala.collection.mutable.Stack
object MatchingBrackets {
  def isPaired(brackets: String): Boolean = {
    val stack = Stack.empty[Char]
     for(i <- brackets){
       if(i == '{' || i == '(' || i == '[' ) stack.push(i)         
       if (i == '}' && (stack.isEmpty|| stack.pop != '{'))  return false
       if (i == ')' && (stack.isEmpty|| stack.pop != '(' ))  return false
       if (i == ']' && (stack.isEmpty|| stack.pop != '['))  return false
      }
    stack.isEmpty   
    }   
  }

 