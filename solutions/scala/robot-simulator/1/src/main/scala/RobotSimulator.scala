
enum Bearing {
  case North,South,East,West
}

import Bearing.*  

case class Robot (bearing:Bearing,coordinates:(Int,Int)){
  
  def turnRight:Robot = {
     bearing match {
       case North => copy(East)
       case South => copy(West)
       case East => copy(South)
       case West => copy(North)
       }
   }

  def turnLeft:Robot = {
    bearing match {
       case North => copy(West)
       case South => copy(East)
       case East => copy(North)
       case West => copy(South)
    }
  }

  def advance:Robot = {
    val (x,y) = coordinates
    bearing match {
      case North => copy(coordinates = (x,y+1))
      case East => copy(coordinates = (x+1,y))
      case South => copy(coordinates = (x,y-1))
      case West => copy(coordinates = (x-1,y))
   }
  }

  def simulate(commands:String):Robot = {

commands.foldLeft(this){ (robot,command) => 
  command match {
         case  'R'  => robot.turnRight
         case  'L'  => robot.turnLeft
         case  'A' => robot.advance
         case _ => throw new RuntimeException("correct input not passed")
    }
}
}
  
}



   
