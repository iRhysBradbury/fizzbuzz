package com.equalexperts.fb.interfaces

import org.scalatest.{FlatSpec, Matchers}
import FizzBuzzTest._

object FizzBuzzTest extends FizzBuzz

class FizzBuzzSpec extends FlatSpec with Matchers {

  it should "produce\n" +
    "the number\n" +
    "‘fizz’ for numbers that are multiples of 3\n" +
    "‘buzz’ for numbers that are multiples of 5\n" +
    "‘fizzbuzz’ for numbers that are multiples of 15" in {
    val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
    val actual = FizzBuzzTest.fizzBuzzSequence(
      start = 1,
      end = 20
    )
    actual shouldBe expected
  }

  it should "produce a fizzbuzz report" in {
    val expected = "fizz: 1 buzz: 1 fizzbuzz: 1 lucky: 1 integer: 1"
    val actual = FizzBuzzTest.fizzBuzzReport("fizz buzz fizzbuzz lucky 2")
    actual shouldBe expected
  }

  it should "produce\n" +
    "a report on count of\n" +
    "fizz\n" +
    "buzz\n" +
    "fizzbuzz\n" +
    "lucky\n" +
    "an integer" in {
    val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"
    val actual = FizzBuzzTest.fizzBuzz(
      start = 1,
      end = 20
    )
    actual shouldBe expected
  }

  it should "produce `true` for 4 `isMultipleOf` 2" in {
    val expected = true
    val actual = 4.isMultipleOf(2)
    actual shouldBe expected
  }

  it should "produce `false` for 5 `isMultipleOf` 2" in {
    val expected = false
    val actual = 5.isMultipleOf(2)
    actual shouldBe expected
  }

  it should "produce `true` for 123 `contains` 3" in {
    val expected = true
    val actual = 123.contains(3)
    actual shouldBe expected
  }

  it should "produce `false` for 122 `contains` 3" in {
    val expected = false
    val actual = 122.contains(3)
    actual shouldBe expected
  }
}
