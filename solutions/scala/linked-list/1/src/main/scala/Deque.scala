import scala.collection.mutable.ArrayDeque

object Deque {
  def apply[T](): ArrayDeque[T] = new ArrayDeque[T]()
}

extension [T](deque: ArrayDeque[T]) {
  
  def push(element: T): Unit = {
    deque.prepend(element)
  }
 
  def pop: Option[T] = {
    if (deque.isEmpty) None 
    else Some(deque.removeHead()) 
  }
  def shift: Option[T] = {
    if (deque.isEmpty) None 
    else Some(deque.removeLast()) 
  }

  def unshift(element: T): Unit = {
    deque.append(element) 
  }
}