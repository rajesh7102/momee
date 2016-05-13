package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class Instructor @Inject() extends Controller {

  def index = Action {
    Ok(views.html.dashboard("M . O . M . E . E"))
  }
	
  def learning_outcomes = Action {
    Ok(views.html.learning_outcomes("Learning Outcomes"))	
  }
}
