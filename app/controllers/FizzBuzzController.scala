package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, AnyContent, Controller}
import services.FuzzBuzzService

@Singleton
class FizzBuzzController @Inject()(fizzBuzzService: FuzzBuzzService) extends Controller {

  /**
    * Server route for the fizz buzz sequence.
    *
    * @param start start of the sequence
    * @param end end of the sequence
    * @return a html page which contains the fizz buzz sequence
    */
  def fizzBuzz(start: Int, end: Int): Action[AnyContent] = Action {
      Ok(
      fizzBuzzService.fizzBuzz(
        start = start,
        end = end
      )
    )
  }
}
