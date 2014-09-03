
object treeobj{
  val t1= new NonEmpty(4,Empty,Empty)
  t1 incl 7
  t1 contains 4
  t1 contains 1


}

abstract class IntSet {

  def contains(x: Int): Boolean
  def incl(x:Int): IntSet  // return a new tree after including the element
  def union(that: IntSet):IntSet
}

// empty is used only once so we make it singleton using object
// new Empty now becomes Empty only
object Empty extends IntSet{

  def contains(x: Int)= false
  def incl(x: Int)= new NonEmpty(x, Empty, Empty)
  def union(that:IntSet)= that

  override def toString = "."
}

class NonEmpty(elem : Int, left : IntSet, right : IntSet) extends IntSet {

  def contains(x: Int) ={
    if(x<elem) left contains x
    else if(x>elem) right contains x
    else true
  }
  def incl(x: Int): IntSet= {
    if(x<elem) new NonEmpty(elem,left incl x, right)
    else if(x>elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  def union (that:IntSet)= ((left union right) union that) union elem
  override def toString = "{" + left + elem + right + "}"
}
