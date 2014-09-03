package ClassesAndObjects

/**
 * Created by admin on 9/2/2014.
 */
trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}

class Cons[T]( val head: T, val tail: List[T]) extends List[T]{

  def isEmpty = false

}

class Nil[T] extends List[T]{

  def isEmpty = true
  def head:Nothing = throw new NoSuchElementException("NIl.head")
  def tail:Nothing = throw new NoSuchElementException("NIl.tail")
}



object List{
  // List(1,2) =  List.apply(1,2)
  def apply[T](x: T,y: T): List[T] = new Cons(x, new Cons(y, new Nil))
  def apply[T](x: T): List[T] = new Cons(x,new Nil)
  def apply()= new Nil

}

