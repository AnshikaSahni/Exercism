object SpiralMatrix {
  def spiralMatrix(num:Int):List[List[Int]] ={  
    val spiralMap = createMatrix(num)
    (for(i <- 0 until num) yield 
    {  
      (for(j <- 0 until num) yield spiralMap(i->j)).toList
      
    }).toList
    
} 

  def createMatrix(num:Int):Map[(Int,Int),Int] ={
  
    def createMatrix(counter:Int,
                     row:Int,
                     col:Int,
                     step:String,
                     spiralMap:Map[(Int,Int),Int]):Map[(Int,Int),Int]= { 
      
        if(counter > num*num) return spiralMap 
        else {
          step match {
            case "right" => { 
              if((col == num-1) || spiralMap.get(row,col+1).nonEmpty) {
                createMatrix(counter+1,row+1,col,"down",spiralMap+((row,col)->counter))
              }
              else createMatrix(counter+1,row,col+1,step,spiralMap+((row,col)->counter)) 
            }
            case "down" => { 
              if((row == num-1) || spiralMap.get(row+1,col).nonEmpty) {
                createMatrix(counter+1,row,col-1,"left",spiralMap+((row,col)->counter))
              }
              else createMatrix(counter+1,row+1,col,step,spiralMap+((row,col)->counter))
            }
            case "left" => { 
              if((col == 0) || spiralMap.get(row,col-1).nonEmpty) {
                createMatrix(counter+1,row-1,col,"up",spiralMap+((row,col)->counter))
              }
              else createMatrix(counter+1,row,col-1,step,spiralMap+((row,col)->counter))
            }
            case "up" => { 
              if((row == 0) || spiralMap.get(row-1,col).nonEmpty) {
                createMatrix(counter+1,row,col+1,"right",spiralMap+((row,col)->counter))
              }
              else createMatrix(counter+1,row-1,col,step,spiralMap+((row,col)->counter))
            }
            case _ => throw new RuntimeException("invalid step")
          }
        }  
        
      }
    createMatrix(1,0,0,"right",Map.empty[(Int,Int),Int])
    
  }                                           
  
}
