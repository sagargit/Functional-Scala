trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]

}

class Cons( val head: T , val tail: List[T]) extends List[T]{

  def isEmpty = false

}

class Nil extends List[T]{

  def isEmpty = true
  def head:Nothing = throw new NoSuchElementException("NIl.head")
  def tail:Nothing = throw new NoSuchElementException("NIl.tail")
}