// program is supposed to calculate value of number PI
import scala.util.Random
import scala.math.sqrt
import scala.math.pow
import scala.math.Pi
import scala.math.abs

object PiCalculate extends App {
  val generator = new Random()
  val forLimit = 100000
  val insideN =
    for (i <- 1 to forLimit; point = (generator.nextDouble, generator.nextDouble)
         if isPointIsInsideCircle(point._1, point._2 ) ) yield 1
  val generatedPi = 4.0 * insideN.toList.sum / forLimit.toDouble
  println(s"generated Pi = $generatedPi,\n real Pi = $Pi,\n |generatedPi - Pi| = "
    + abs(generatedPi - Pi) + "\n" )
  def isPointIsInsideCircle(x: Double, y: Double):Boolean = sqrt(pow(x, 2) + pow(y, 2)) < 1
}