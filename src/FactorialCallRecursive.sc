
def factorial(num: Int): Int={
  def calc(acc: Int, num: Int): Int={
    if(num==0) acc
    else calc(acc*num,num-1)
  }
  calc(1,num)
}
factorial(5)
factorial(10)
//tail recursion in factorial