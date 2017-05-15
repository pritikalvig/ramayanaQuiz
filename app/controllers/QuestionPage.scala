package controllers
import models.Answer
import models.CompleteQuestion
import models.QuestionDataStore
import play.api.mvc.{Action, Controller}

import scala.collection.mutable._

/**
  * Created by pritikavig on 5/5/17.
  */

object QuestionPage extends Controller {

  private val d = QuestionDataStore()

  def index(id: Int) = Action {

    d.buildMap()
    val question = d.lookUpQuestion(id)
    Ok(views.html.question(question))

  }


}