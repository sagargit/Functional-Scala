
import ClassesAndObjects._
object nothingObj {
   def nthng[T](n: Int, list : List[T]): T={
     if(n==0) list.head
     else nthng(n-1,list.tail)
   }

  val list = new Cons[Int]()(1, new Cons(2,new Cons(3,new Nil[Nothing])))
  nthng(2,list)

}

