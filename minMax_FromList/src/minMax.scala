object minMax extends App{
  val myList = List(9,23,32,1,123,54,57,3,2,34,6,7,4,-1234,213,34,1,12,5,7,87,2,45,6)

  @scala.annotation.tailrec
  def minFromList(myList: List[Int], min: Int = Int.MaxValue): Int = {
    if( myList.isEmpty) return min
    val newMin = if( myList.head < min) myList.head else min
    minFromList(myList.tail,newMin)
  }
  @scala.annotation.tailrec
  def maxFromList(myList: List[Int], max: Int = Int.MinValue): Int = {
    if(myList.isEmpty) return max
    val newMax = if( myList.head > max) myList.head else max
    maxFromList(myList.tail, newMax)
  }
  println( minFromList(myList) )
  print( maxFromList(myList) )

}
