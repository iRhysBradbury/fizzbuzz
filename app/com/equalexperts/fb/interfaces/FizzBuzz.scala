package com.equalexperts.fb.interfaces

/**
  * This trait describes the FizzBuzz behaviour
  */
trait FizzBuzz {

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
  }

  /**
    * This method contains the logic for the fizz buzz `sequence`.
    *
    * @param start the start of the range
    * @param end the end of the range
    * @return a `String` which is representative of the fizzbuzz sequence
    */
  def fizzBuzz(start: Int, end: Int): String = {
    {
      start.to(end).map { i =>
        if(i.isMultipleOf(15)) {
          "fizzbuzz"
        } else if(i.isMultipleOf(5)) {
          "buzz"
        } else if(i.isMultipleOf(3)) {
          "fizz"
        } else {
          i.toString
        }
      }
    }.mkString(" ")
  }
}
