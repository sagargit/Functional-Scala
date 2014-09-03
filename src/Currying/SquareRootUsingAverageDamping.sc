import math.abs

object practice{

  val tolerance= 0.0001

  def isClose(a: Double,b: Double):Boolean={
    return abs((a-b)/b)/b<tolerance
  }

  def fixedPoint(f:Double=>Double)(initialGuess: Double):Double={

    def iterate(guess : Double):Double=
    {
      val next= f(guess)
      if(isClose(next,guess)) next
      else iterate(next)

    }

    iterate(initialGuess)
  }
  def averageDamp(f:Double=>Double)(x: Double): Double={
    (x+f(x))/2
  }

  def sqrt(x: Double): Double={
    fixedPoint(averageDamp(y=>x/y))(1.0)
  }

  sqrt(2)
}




