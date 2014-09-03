
object fun{

  val f= new Function1[Int,Int]{ //[Int,Int] means that it takes int
    // and return int
    def apply(x:Int)=x*x

  }
  f.apply(5)

}