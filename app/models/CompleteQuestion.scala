package models

/**
  * Created by pritikavig on 5/5/17.
  */
case class CompleteQuestion( questionId: Int,
                             questionText: String,
                             answers: List[Answer] )
