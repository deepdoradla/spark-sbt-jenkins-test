/**
  * Created by deepdoradla on 24/06/2017.
  */
import org.scalatest._
import simplejob._

class SimpleJobTest extends FunSuite with Matchers{

  test("Number of A's and number of B's"){
    val value = SimpleJobApp.getA()

    value should be(3)
  }
}
