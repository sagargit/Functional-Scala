
def fac(x: Int): Int ={
  def acc(a: Int, x: Int):Int={
    if(x==0) a
    else acc(a*x,x-1)

  }
  acc(1,x)
}
fac(5)


