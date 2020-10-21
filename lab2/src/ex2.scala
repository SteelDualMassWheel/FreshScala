object ex2 {
  def main(args: Array[String]): Unit ={
    val lengthOfFirstSide = 1
    val lengthOfSecondSide = 2
    // goal 1
    // way1
    println("way1")
    val tuple1 = (lengthOfFirstSide, lengthOfSecondSide)
    val tuple2 = (3,6)
    val tuple3 = (8,4)
    val list1 = List(tuple1, tuple2, tuple3)
    list1 foreach(x => println(x))

    // way2
    println("way2")
    val list2 = tuple1::tuple2::tuple3::List()
    list2 foreach( x => println(x))

    // way3
    println("way3")
    val list3 = List(tuple1) ++ List(tuple2) ++ List(tuple3)
    list3 foreach(x => println(x))

    // goal 2
    def returnListOfRectangles(list: List[(Int,Int)], b: Int): List[(Int, Int)] = {
      for( rectangle <- list if (rectangle._1 * rectangle._2 ) > b  ) yield rectangle
    }

    // goal 3
    def printRectangle(tuple: (Int,Int)){
      println(s"($tuple) => area: " + tuple._1 * tuple._2)
    }

    // goal 4
    val luckyNumber = 2
    val largerRectangleList = returnListOfRectangles(list1, luckyNumber)
    largerRectangleList foreach(x => printRectangle(x) )
  }

}
