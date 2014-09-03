
def euclid(a: Int,b: Int):Int ={
  if(b==0) a else euclid(b,a%b)
}

euclid(16,8)
euclid(8,16)
euclid(120,180)
