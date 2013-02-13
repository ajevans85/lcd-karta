package bbc.test

import org.specs2.mutable.SpecificationWithJUnit
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner


@RunWith(classOf[JUnitRunner])
class TennisSpec extends SpecificationWithJUnit{

  "Integer addition" should {
    "1 +  2 equals 3" in {
      1+2 must beEqualTo(3)
    }

    "2 + 2 equals 4" in {
      2+2 must beEqualTo(4)
    }
  }

}
