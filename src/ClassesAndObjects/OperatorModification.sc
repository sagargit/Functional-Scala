object rat {
  val obj =  new Rational(3,5)
  val obj2 = new Rational(6,20)
  //val obj3= new Rational(7,0)
  val obj4 = new Rational(4)


  obj + obj2
  obj < obj2
  obj max obj2


}

class Rational(a: Int, b: Int){
  require(b!=0," denominator can't be zero ")
  private def gcd(a: Int,b: Int):Int= if(b==0) a else gcd(b,a %b)
  def num= a/gcd(a,b)
  def den= b/gcd(a,b)

  def this(a: Int)= this(a,1)

  def +(that: Rational): Rational = {
    new Rational(num * that.den + den * that.num, den* that.den)
  }

  def <(that: Rational)= num * that.den < that.num * den

  def unary_-():Rational= {
    new Rational(-nume,deno)
  }

  def -(that: Rational):Rational={
    this + -that
  }

  def max(that: Rational) = if(this < that ) that else this

  override  def toString()={
    num + "/" + den
  }


}