case class NormalFinalClock(hrs: Int, min: Int){

  def +(other:NormalFinalClock) = Clock(hrs+other.hrs, min+other.min)

  def -(other:NormalFinalClock) = Clock(hrs-other.hrs, min-other.min)
}

object Clock {

  def apply(hrs: Int, min: Int): NormalFinalClock = {

    if (hrs >= 0 && min >= 0) {
      val updatedhrs = (hrs+ (min / 60))%24
      val updatedMin = (min % 60)
      NormalFinalClock(updatedhrs, updatedMin)
    }

    else if (hrs < 0 && min >= 0) {
      val updatedhrs = (hrs % 24) + 24
      val updatedMin = (min % 60)
      NormalFinalClock(updatedhrs, updatedMin)
    }

    
    else if (hrs > 0 && min < 0) {
      var updatedhrs = (hrs % 24) + Math.floor(min.toDouble/60).toInt
      if (updatedhrs <0)
        updatedhrs = updatedhrs%24 + 24
      val updatedMin = (min % 60) + 60
      NormalFinalClock(updatedhrs, updatedMin)
    }

    else if (hrs <= 0 && min < 0) {
      var updatedhrs = (hrs % 24) + 24 + Math.floor(min.toDouble/60).toInt
      if (updatedhrs <0)
        updatedhrs = updatedhrs%24 + 24
      val updatedMin = (min % 60) + 60
      NormalFinalClock(updatedhrs, updatedMin)
    }
    else {
      throw new RuntimeException("invalidInput")
    }
  }

  def apply(min:Int):NormalFinalClock =
  {
    apply(0,min)
  }
}