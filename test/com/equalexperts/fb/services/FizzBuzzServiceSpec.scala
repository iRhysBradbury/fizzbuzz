package com.equalexperts.fb.services

import org.scalatestplus.play.{OneAppPerTest, PlaySpec}

class FizzBuzzServiceSpec extends PlaySpec with OneAppPerTest {

  "FizzBuzzService" should {
    "be injectable" in {
      app.injector.instanceOf[FizzBuzzService]
      assert(true)
    }
  }
}
