

def product(f:Int => Int)(a: Int,b: Int):Int= {
    if (a > b) 1
    else f(a) * (product(f)(a + 1, b))
}
product(x => x*x*x)(1,10)

product(x=>x)(1,5)

def factorial(a: Int): Int=product(x=>x)(1,a)

factorial(5)

