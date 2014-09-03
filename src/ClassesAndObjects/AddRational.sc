object rationals{
val x = new Rational(1,2)
val y = new Rational(3,4)
val z = new Rational(5,6)
x.nume
x.deno
x.add(y)
x.sub(y)
x.sub(y).sub(z)
}

class Rational(a: Int, b: Int){
  def nume = a
  def deno = b
  def add(that: Rational)=
  new Rational( nume* that.deno+deno*that.nume,deno*that.deno)

  def neg():Rational= {
    new Rational(-nume,deno)
  }

  def sub(that: Rational):Rational={
    add(that.neg)
  }
  override def toString() = nume + "/" + deno
}