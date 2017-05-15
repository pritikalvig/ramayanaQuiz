package controllers
import controllers.Application.Ok
import controllers.QuestionPage.Ok
import controllers.ResultsPage.Ok
import models.ResultsDataStore
import play.api.mvc.{Action, Controller}
import play.api.mvc.Action

/**
  * Created by pritikavig on 5/5/17.
  */
object ResultsPage extends Controller {

  private val d = ResultsDataStore()

  def index(id: Int) = Action {
    d.buildMap()
    val res = d.lookUpResult(id)
    Ok(views.html.result(res))
  }

}
