object rat {
  val obj =  new Rational(3,5)
  val obj2 = new Rational(6,20)
  //val obj3= new Rational(7,0)
  val obj4 = new Rational(4)


  obj.add(obj2)
  obj.less(obj2)
  obj.max(obj2)


}

class Rational(a: Int, b: Int){
  require(b!=0," denominator can't be zero ")
  private def gcd(a: Int,b: Int):Int= if(b==0) a else gcd(b,a %b)
  def num= a
  def den= b

  def this(a: Int)= this(a,1)

  def add(that: Rational): Rational = {
    new Rational(num * that.den + den * that.num, den* that.den)
  }

  def less(that: Rational)= num * that.den < that.num * den

  def max(that: Rational) = if(this.less(that)) that else this

  override  def toString()={
    val g = gcd(a,b)

    num/g + "/" + den/g
  }


}