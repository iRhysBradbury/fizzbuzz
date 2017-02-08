package com.equalexperts.fb.services

import javax.inject.Singleton
import com.equalexperts.fb.interfaces.FizzBuzz

/**
  * A Guice singleton which can be injected.
  * Singleton instance of the FizzBuzz trait.
  */
@Singleton
class FizzBuzzService extends FizzBuzz