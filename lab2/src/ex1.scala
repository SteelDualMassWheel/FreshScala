object ex1 {
  def main(args: Array[String]): Int ={
    if( !(args.length  == 2 && args(0).length == 1 && args(1).length == 1 ) ){
      println("Please provide two arguments")
      return -1
    }
    if( !( args(0)(0).isLetter && args(1)(0).isLetter ) ){
      println("Please provide only letters")
      return -2
    }
    val startLetter = if(args(0)(0).isUpper) args(0)(0).toLower else args(0)(0)
    val endLetter = if(args(1)(0).isUpper) args(1)(0).toLower else args(1)(0)

    val trueStartLetter = if( startLetter > endLetter) endLetter else startLetter
    val trueEndLetter = if( endLetter < startLetter) startLetter else endLetter

    (trueStartLetter to trueEndLetter) foreach(x => println( x ))
    0
  }
}
