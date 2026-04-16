class Robot {
 
   var name:String  = Robot.getCurrentName
  
  def reset() = {
    name = Robot.getCurrentName
     }
}

object Robot {
  
  var (char1,char2,char3,char4,char5) = ('A','A',0,0,0)
  
  
  def getCurrentName:String = {
      val currentName = s"$char1$char2$char3$char4$char5"
      if(char5 ==9){
        char5 = 0
        if(char4 == 9){
          char4 = 0
          if(char3 == 9){
             char3 = 0
            if(char2 == 'Z'){
              char2 = 'A'
              if(char1 == 'Z'){
                char1 = 'A'
              }
              else char1=(char1+1).toChar
            }
            else char2 = (char2 +1).toChar
          }
          else char3+=1
        }
        else char4+=1
      }
    else char5+=1

    currentName
      
  } 
  
}