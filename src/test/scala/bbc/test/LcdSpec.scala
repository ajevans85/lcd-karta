package bbc.test

import org.specs2.mutable.SpecificationWithJUnit
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LcdSpec extends SpecificationWithJUnit{
  val lcd0 = "._.\n" +
             "|.|\n" +
             "|_|"

  val lcd1 = "...\n" +
             "..|\n" +
             "..|"

  val lcd2 = "._.\n" +
             "._|\n" +
             "|_."

  val lcd3 = "._.\n" +
             "._|\n" +
             "._|"

  val lcd4 = "...\n" +
             "|_|\n" +
             "..|"

  val lcd5 = "._.\n" +
             "|_.\n" +
             "._|"

  val lcd10 = "... ._.\n" +
              "..| |.|\n" +
              "..| |_|"

  val lcd6789 = "._. ._. ._. ._.\n" +
                "|_. ..| |_| |_|\n" +
                "|_| ..| |_| ..|"

  "LCD Panel" should {

    "Should be able to display digit 0" in {
      PanelV2.display(0) must beEqualTo(lcd0)
    }

    "Should be able to display digit 1" in {
      PanelV2.display(1) must beEqualTo(lcd1)
    }

    "Should be able to display digit 2" in {
      PanelV2.display(2) must beEqualTo(lcd2)
    }

    "Should be able to display digit 3" in {
      PanelV2.display(3) must beEqualTo(lcd3)
    }

    "Should be able to display digit 4" in {
      PanelV2.display(4) must beEqualTo(lcd4)
    }

    "Should be able to display digit 5" in {
      PanelV2.display(5) must beEqualTo(lcd5)
    }

    "Should be able to display digit 10" in {
      PanelV2.display(10) must beEqualTo(lcd10)
    }

    "Should be able to display digit 6789" in {
      PanelV2.display(6789) must beEqualTo(lcd6789)
    }

  }


}
