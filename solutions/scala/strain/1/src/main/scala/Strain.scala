object Strain {
  def keep[T](list: Iterable[T], predicate: T => Boolean):Iterable[T] = {
    list.filter(predicate)
  }
  def discard[T](list: Iterable[T], predicate: T => Boolean):Iterable[T] = {
    list.filterNot(predicate)
  }
  
}