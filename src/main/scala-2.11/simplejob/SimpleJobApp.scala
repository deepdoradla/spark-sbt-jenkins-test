package simplejob

/**
  * Created by deepdoradla on 24/06/2017.
  */
object SimpleJobApp extends App{

  override def main(args: Array[String]) {
    //val sc = new SparkContext
    //val sqlContext = new SQLContext(sc)

    println("I am executing")

    val numA = 1
    val numB = 2

    println("Value of A is: " + numA + " Value of B is: " + numB)

  }

  def getA() : Int = {

    val valueA = 2

    return valueA
  }

}
