
def sumOfIntegers(a: Int,b: Int): Int ={
  if(a>b) 0
  else a+ sumOfIntegers(a+1,b)
  }
sumOfIntegers(1,10)


def cube(a :Int)= a*a*a
def sumOfCubes(a: Int, b: Int): Int ={
  if(a>b) 0
  else cube(a)+ sumOfCubes(a+1,b)
}

sumOfCubes(1,10)


def fact(a: Int):Int={
  if(a==0) 1 else a*fact(a-1)
}
def sumOfFact(a: Int, b: Int):Int={
  if(a>b) 0
  else fact(a) + sumOfFact(a+1,b)
  }

sumOfFact(1,10)

