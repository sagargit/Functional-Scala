
def sum(f: Int=>Int, a: Int,b: Int): Int ={
  def calc(a: Int,acc: Int): Int ={
    if(a>b) acc
    else calc(a+1,f(a)+acc)

  }
  calc(a,0)
}

def sumOfCubes(a: Int,b: Int): Int=sum(x=> x*x*x,a,b)

sumOfCubes(1,10)
