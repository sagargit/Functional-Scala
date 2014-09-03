def sum(f: Int=> Int,a: Int,b: Int): Int ={

  if(a>b) 0
  else f(a) +sum(f,a+1,b)
}

def id(a: Int)=a
def cube(a: Int)=a*a*a
def fact(a: Int):Int ={
  if(a==0) 1 else a*fact(a-1)
}

def sumOfIntegers(a: Int,b: Int)=sum(id,a,b)
def sumOfCubes(a: Int,b: Int)=sum(cube,a,b)
def sumOfFact(a: Int,b: Int)=sum(fact,a,b)

sumOfCubes(1,10)
sumOfFact(1,10)
sumOfIntegers(1,10)






