import scala.math.sqrt
object mapPoint extends App{
  class mapPoint(name: String, var longitude: Double, var latitude: Double, var eastWest: Char = 'E',  var southNorth: Char = 'N' ){
    normaliseLengths()
    def display(): Unit ={
      println(s"In $name: $longitude$eastWest, $latitude$southNorth")
    }
    def movePoint(longitudeShift: Double, latitudeShift: Double): Unit = {
      longitude += longitudeShift
      latitude += latitudeShift
      normaliseLengths()
    }
    def normaliseLengths(): Unit ={
      if( longitude < 0 ) {
        eastWest = 'W'
        longitude *= -1
      }
      if( latitude < 0 ) {
        southNorth = 'S'
        latitude *= -1
      }
    }
    def getName(): String = name

  }
  def inTheMiddle(p1: mapPoint, p2: mapPoint, name: String): mapPoint = {
    if ( p1.eastWest == 'W') p1.longitude *= -1
    if ( p2.eastWest == 'W') p2.longitude *= -1
    if ( p1.southNorth == 'S') p1.latitude *= -1
    if ( p2.southNorth == 'S') p2.latitude *= -1
    val p = new mapPoint(name, (p2.longitude + p1.longitude) /2 , (p2.latitude + p1.latitude)/2 )
    p.display()
    p.normaliseLengths()
    p
  }
  def closestFrom(refe: mapPoint, p1: mapPoint, p2: mapPoint): mapPoint ={
    if ( angularDistance(distance(refe,p1)) < angularDistance(distance(refe,p2))) p1 else p2
  }
  def distance(p1: mapPoint, p2: mapPoint) = {
    if( p1.eastWest == 'W') p1.longitude *= -1
    if( p2.eastWest == 'W') p2.longitude *= -1
    if( p1.southNorth == 'S') p1.latitude *= -1
    if( p2.southNorth == 'S') p2.latitude *= -1
    (p2.longitude - p1.longitude, p2.latitude - p1.latitude)
  }
  def angularDistance(d: (Double, Double)) = {
    sqrt(d._1 * d._1 + d._2 * d._2 )
  }
  val p1 = new mapPoint("City", 23.523, +12.2323)
  p1.display()
  val longitude = 19.938333
  val latitude = 50.061389
  val krakow = new mapPoint("Krakow", longitude, latitude)
  krakow.display()
  val nyc = new mapPoint("New York", 74.0059, 40.7127, 'W', 'N')
  nyc.display()
  val sydney = new mapPoint("Sydney",  151.102,-33.454)
  sydney.display()
  val porto = new mapPoint("Porto",41.162142, 8.621953 )
  val portugalCity = porto
  portugalCity.display()
  val longitudeShift = 4.1234
  val latitudeShift = -25.987
  println("after moving")
  portugalCity.movePoint(longitudeShift,latitudeShift)
  portugalCity.display()
  println("after moving")
  portugalCity.movePoint(-90.5710,34.7300)
  portugalCity.display()
  val d = distance(nyc, sydney)
  println("Distance between NYC and Sydney: ")
  println("longitude difference: " + d._1 )
  println("latitude difference: " + d._2)
  println("Distance: " + angularDistance(d))
  val cl = closestFrom(krakow, nyc, sydney)
  println("closer to krakow is " + cl.getName )
  val mp = inTheMiddle(nyc, sydney,"Kenia")
  mp.display()

}
