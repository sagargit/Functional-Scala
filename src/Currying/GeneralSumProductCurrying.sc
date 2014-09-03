
def mapReduce(f:Int=>Int,combine:(Int,Int)=>Int,zero:Int)(a: Int,b: Int):Int=
if(a>b) zero
else combine(f(a),mapReduce(f,combine,zero)(a+1,b))

def product(f:Int=>Int)(a: Int,b: Int): Int={
  mapReduce(f,(x,y)=>x*y,1)(a,b)
}

def sum(f:Int=>Int)(a: Int,b: Int): Int={
  mapReduce(f,(x,y)=>x+y,0)(a,b)
}

product(x=>x*x*x)(1,5)
sum(x=>x*x*x)(1,10)

def fact(num:Int)=product(x=>x)(1,num)
fact(5)



