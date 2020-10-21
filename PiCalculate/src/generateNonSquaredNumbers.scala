// generate numbers that are not squares of some numbers
// up to a value N = args(1) or 50 if args(1) not given
import scala.math.sqrt
object generateNonSquaredNumbers extends App{
  val N = if(args.isEmpty) 50 else args(0).toInt
  val intSeq =
    for( i <-1 to N  if (sqrt(i) - sqrt(i).toInt ) != 0  ) yield i
  println(intSeq)

}