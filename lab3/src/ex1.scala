object ex1 extends App {
  def plus(a: Int, b:Int) = a+b
  def minus(a: Int, b: Int) = a-b
  def multi(a: Int, b: Int) = a*b
  def div(a: Int, b: Int) = a/b
  val myMap: Map[Char, (Int, Int) => Int ] = Map( '+' -> plus, '-' -> minus, '*' -> multi,'/' -> div )
  def solveEquation(s: String): Int ={
    val arrayString = s.split(' ')
    val a =  arrayString(0).toInt
    val char = arrayString(1)(0)
    val b = arrayString(2).toInt
    myMap(char)(a,b)
    }
  val equation = "2 + 2"
  println(s"Answer:${solveEquation(equation) }")
  val equation1 = "2 - 2"
  println(s"Answer:${solveEquation(equation1) }")
  val equation2 = "2 * 2"
  println(s"Answer:${solveEquation(equation2) }")
  val equation3 = "2 / 2"
  println(s"Answer:${solveEquation(equation3) }")

}