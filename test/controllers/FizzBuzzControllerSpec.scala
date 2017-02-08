package controllers

import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class FizzBuzzControllerSpec extends PlaySpec with OneAppPerTest {

  "FizzBuzzController" should {

    "return for a contiguous range of integers:" +
    "\nthe number" +
    "\n‘fizz’ for numbers that are multiples of 3" +
    "\n‘buzz’ for numbers that are multiples of 5" +
    "\n‘fizzbuzz’ for numbers that are multiples of 15" +
    "\nfor a range 1 - 20" +
    "\nIf the number contains a three you must output the text ‘lucky’. This overrides any existing behaviour" in {

      val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
      val actual = route(
        app = app,
        req = FakeRequest(
          method = GET,
          path = controllers.routes.FizzBuzzController.fizzBuzz(
            start = 1,
            end = 20
          ).url
        )
      ).get
      status(actual) mustBe OK
      contentAsString(actual) mustBe expected
    }
  }
}
