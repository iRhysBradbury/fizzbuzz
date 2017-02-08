package com.equalexperts.fb.controllers

import org.scalatestplus.play._
import play.api.test.Helpers._
import play.api.test._

/**
  * Tests the FizzBuzzController.
  * This test is validating the request structure to the FizzBuzz MicroService.
  */
class FizzBuzzControllerSpec extends PlaySpec with OneAppPerTest {

  "FizzBuzzController" should {
    "200 Ok for a valid FizzBuzz request" in {
      val expected = OK
      val actual = status(
        route(
          app = app,
          req = FakeRequest(
            method = GET,
            path = com.equalexperts.fb.controllers.routes.FizzBuzzController.fizzBuzz(
              start = 1,
              end = 20
            ).url
          )
        ).get
      )
      actual mustBe expected
    }
  }
}
