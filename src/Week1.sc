def abs(x: Double)= if(x<0) -x else x

def sqrt(x : Double)={
def sqrCalc(guess: Double): Double={
  if(guessIsCloser(guess)){
    guess
  }
  else{
    sqrCalc(reCompute(guess))
  }
}
def guessIsCloser(a: Double):Boolean={
  abs(a*a-x)/x<0.001
}
def reCompute(guess: Double): Double ={
  (guess+x/guess)/2
}
sqrCalc(1.0)

}
sqrt(2e100)
sqrt(1e-6)
sqrt(4)




