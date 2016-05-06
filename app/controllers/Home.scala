package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class Home @Inject() extends Controller {

  def index = Action {
    Ok(views.html.index("M . O . M . E . E"))
  }

}
