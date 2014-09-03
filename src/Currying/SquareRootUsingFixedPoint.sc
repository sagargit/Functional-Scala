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


  def sqrt(x: Double):Double={
    fixedPoint(y=>(y+x/y)/2)(1.0)
  }
  sqrt(2)

}
