

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
   fixedPoint(x=>1+x/2)(1)

}

