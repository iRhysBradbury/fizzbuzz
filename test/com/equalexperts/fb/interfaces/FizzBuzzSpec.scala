package com.equalexperts.fb.interfaces

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {

  object FizzBuzzTest extends FizzBuzz

  it should "produce the correct fizz buzz sequence for 1 to 20" in {
    val actual = FizzBuzzTest.fizzBuzz(
      start = 1,
      end = 20
    )
    val expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
    actual shouldBe expected
  }

}
