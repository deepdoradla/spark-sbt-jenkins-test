package simplejob

/**
  * Created by deepdoradla on 24/06/2017.
  */

import org.apache.spark._
import org.apache.spark.sql._

object SimpleJobApp {

  def main(args: Array[String]){
    val conf = new SparkConf().setAppName("Test Job Application")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    println("I am executing")
  }

  def getA() : Int = {
    val valueA = 2

    return valueA
  }

}
