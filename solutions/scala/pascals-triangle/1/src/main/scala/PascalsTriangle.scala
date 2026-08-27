object PascalsTriangle {
  def rows(row:Int):List[List[Int]] = {
       if(row < 1 ) List.empty[List[Int]]
       else createTriangle(row)
      
    }
    def createTriangle(row:Int):List[List[Int]] = {
      def createTriangle(currentRow:Int,latestTriangle:List[List[Int]]):List[List[Int]] ={

      if(currentRow > row ) return latestTriangle
      else{
       val newRow = currentRow match {
          case 1 => List(1)
          case 2 => List(1,1)
          case _ => createRow(latestTriangle.last)
        }
        createTriangle(currentRow+1 , latestTriangle++List(newRow))
     }        
      }

      createTriangle(1,List.empty[List[Int]])
         
    }

    def createRow(prevlist:List[Int]):List[Int] ={
     val intermediateList =  for(i <- 0 to (prevlist.length-2) ) yield prevlist(i)+prevlist(i+1)
      List(1) ++ intermediateList ++ List(1)
}


 
  }