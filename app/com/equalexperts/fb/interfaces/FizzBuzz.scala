package com.equalexperts.fb.interfaces

/**
  * This trait describes the FizzBuzz behaviour.
  */
trait FizzBuzz {

  /**
    * Terms to for output.
    */
  object Terms {
    val Lucky = "lucky"
    val Fizzbuzz = "fizzbuzz"
    val Buzz = "buzz"
    val Fizz = "fizz"
    val Integer = "integer"
    val Delimiter = " "
  }

  /**
    * This implicit class `extends` Int type to allow
    * `isMultipleOf` functions on `Int` type.
    *
    * @param i the integer comparable
    */
  implicit class IntExtension(i: Int) {

    /**
      * Returns `true` if the number is a multiple of `m`.
      * Returns `false` if the number is not a multiple of `m`.
      *
      * @param m the multiple in question
      * @return
      */
    def isMultipleOf(m: Int): Boolean = {
      i % m == 0
    }

    /**
      * Returns `true` if the number has a `c` in it.
      * Returns `false` if the number does not have a `c` in it.
      *
      * @param c the number in question
      * @return
      */
    def contains(c: Int): Boolean = {
      i.toString.contains(c.toString)
    }
  }

  /**
    * This method contains the logic for the FizzBuzz `sequence`.
    *
    * @param start the start of the range
    * @param end the end of the range
    * @return a `String` which is representative of the FizzBuzz sequence
    */
  def fizzBuzzSequence(start: Int, end: Int): String = {
    {
      start.to(end).map { i =>
        if(i.contains(3)) {
          Terms.Lucky
        } else if(i.isMultipleOf(15)) {
          Terms.Fizzbuzz
        } else if(i.isMultipleOf(5)) {
          Terms.Buzz
        } else if(i.isMultipleOf(3)) {
          Terms.Fizz
        } else {
          i.toString
        }
      }
    }.mkString(Terms.Delimiter)
  }

  /**
    * Produces a report on a `String` about how many FizzBuzz terms are used.
    *
    * @param fizzBuzzStr the FizzBuzz string
    * @return the original
    */
  def fizzBuzzReport(fizzBuzzStr: String): String = {
    val terms = fizzBuzzStr.split(Terms.Delimiter)

    val fizzCount = terms.count(_ == Terms.Fizz)
    val buzzCount = terms.count(_ == Terms.Buzz)
    val fizzbuzzCount = terms.count(_ == Terms.Fizzbuzz)
    val luckyCount = terms.count(_ == Terms.Lucky)
    val intCount = terms.size - fizzCount - buzzCount - fizzbuzzCount - luckyCount
    s"${Terms.Fizz}: $fizzCount " +
    s"${Terms.Buzz}: $buzzCount " +
    s"${Terms.Fizzbuzz}: $fizzbuzzCount " +
    s"${Terms.Lucky}: $luckyCount " +
    s"${Terms.Integer}: $intCount"
  }

  /**
    * This method contains the logic for the FizzBuzz `sequence` and FizzBuzz report.
    *
    * @param start start of the FizzBuzz `sequence`
    * @param end end of the FizzBuzz `sequence`
    * @return
    */
  def fizzBuzz(start: Int, end: Int): String = {
    val str = fizzBuzzSequence(
      start = start,
      end = end
    )
    val report = fizzBuzzReport(str)
    s"$str $report"
  }
}
