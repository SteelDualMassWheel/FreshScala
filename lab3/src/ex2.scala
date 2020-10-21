object ex2 extends App {
  val point = (0,0)
  val point2 = (10,10)
  val point3 = (7,1)
  val pointList = List(point, point2, point3, (-4,-3), (15,20))
  def isInside(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), point: (Int, Int)): Boolean = {
    point._1 >= leftBottomCorner._1 && point._2 >= leftBottomCorner._2 &&
      point._1 <= rightTopCorner._1 && point._2 <= rightTopCorner._2
  }
  @scala.annotation.tailrec
  def rec(leftBottomCorner: (Int, Int), rightTopCorner: (Int, Int), pointList: List[(Int,Int)], count: Int = 0 ): Int = {
    if (pointList.isEmpty) return count

    val newCount = if (isInside(leftBottomCorner, rightTopCorner, pointList.head)) count + 1 else count
    //val newCount = count + (isInside(leftBottomCorner, rightTopCorner, pointList.head)).toInt
    rec(leftBottomCorner, rightTopCorner, pointList.tail, newCount)

  }
  val res = rec(point, point2, pointList)
  println(res)

  val pointList2 = List( (0,0), (1,1), (10,10), (11,0), (0,11) )
  print("List of points: ")
  for( p <- pointList2) print(p + ", ")
  println()
  val res2 = rec(point,point2,pointList2)
  println(s"Number of points inside rectangle is $res2")



}
