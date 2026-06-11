object BinarySearch {
  def find(list:List[Int],number:Int):Option[Int] ={
    def find(low:Int,high:Int):Option[Int] = {
      if(low > high) None 
      else {
        val mid = low + (high - low) / 2 
        if(list(mid) == number)  Some(mid)
        else if (list(mid) < number) find(mid+1,high)
        else find(low,mid-1)
      }
    }
    find(0,list.size-1)
}
}