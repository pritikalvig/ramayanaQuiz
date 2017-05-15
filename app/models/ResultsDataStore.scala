package models

import scala.collection.mutable.HashMap

/**
  * Created by pritikavig on 5/5/17.
  */
case class ResultsDataStore() {

  private val ResultsDataStore: HashMap[Int, CompleteResult] = HashMap[Int,CompleteResult]()


  def lookUpResult(resultId: Int): CompleteResult = {
    ResultsDataStore(resultId)
  }

  def buildMap(): Boolean = {

    val sita = CompleteResult("Sitayana Sita", "Sita is dedicated to her family. Like Sita, your love is difficult to win, but once " +
      "its won you love forever. In some tellings, Sita transfroms into Kalika and destroys Ravana's brother. You have a fighter in you like Sita, " +
      "and practice patient protest and acts of bravery. You are independent and can survive anything.",
                "http://www.mygodpictures.com/wp-content/uploads/2015/07/Image-Of-Goddess-Sita.jpg")

    val rama = CompleteResult("Bhakti Rama", "Tulsidas' and Kampan's Rama is the incarnation of Vishnu." +
      " Always commited to the right action, he can do no wrong as God. Rama has a strong sense of dharma to his father and" +
      " to his kingly duties." + " Congratulations! You embody this sense of diligence and duty.",
    "http://www.mygodpictures.com/wp-content/uploads/2015/07/Painting-Of-Lord-RamaLord-Lakshmana-And-Goddess-Sita.jpg")

    val kumb = CompleteResult("Kumbhakarna", "Kumbhakarna has a strong sense of justice and tries to convince" +
      " his brother to release Sita. When he could not persuade his brother, he still honored his family dharma and " +
      "defended him. Kumbhakarna is extremely strong and pious. When he sleeps it takes a thousand elephants walking across" +
      " his stomach to wake him. Congratulations! Like Kumbhakarna you are dedicated to your family and have strong values. " +
      "Like Kumbhakarna's deep meditative prayer, you harness your focus to acheive your goals. While you do not seek out fights, " +
      "you are ready to defend your family.", "http://media.indiatimes.in/media/content/2016/Jul/2347666-528_1468497288.jpg")

    val valRama = CompleteResult("Valmiki's Rama", "Ultimately human, Valmiki's Rama fulfills his human dharma during the Treta Yuga. " +
      "While some of his actions may be questionable, Rama does the best a human may possibly do. An incredible king, " +
      "Rama fulfills his dharma to his people. Congratulations! Like Rama, you are a good leader and very brave. While you " +
      "sometimes make mistakes, you strive to do the best you can at every step.",
      "http://www.mygodpictures.com/mgp/01/2759_original.jpg")

    val han = CompleteResult("Hanuman", "Incredibly strong and athletic. Hanuman nimbly adapts to any situation required of him. " +
      "In times of crisis, such as when his tail is set on fire by Ravana, Hanuman quickly reacts with a brave plan. " +
      "Like Hanuman, you posesses ingenuity and incredible loyalty. Hanuman acts as a mediator between Rama and the monkeys and ultimately " +
      "helps Rama win the battle in Lanka. You are skilled at bringing people together. ",
    "http://www.mygodpictures.com/wp-content/uploads/2015/07/Lord-Rama-Giving-Blessing-To-Lord-Hanuman-550x428.jpg")

    val Lakshman = CompleteResult("Punjabi Lakshman", "Lakshman puts family first and fulfills his duties as a brother to the utmost. " +
      "In a North Indian version of the Ramayana, Lakshman possess a power known as Lakshman Rekha by which he can " +
      "draw a protective line on the ground which only himself, Rama, and Sita may cross. Lakshman uses this power to protect Sita when he " +
      "goes to save Rama in the golden deer episode, but Ravana disguises himself as a holyman looking for alms and tricks Sita into crossing " +
      "the line. Lakshman Rekha is now a term to represent modesty of both men and women, and an uncrossable moral line. " +
      "Congratulations! Like Lakshman you are loyal and devoted to family. You are not afraid of a battle to protect the ones you love. ",
      "http://www.mygodpictures.com/wp-content/uploads/2015/07/Photo-Of-Lord-Lakshmana.jpg")

    val evrRavan = CompleteResult("E.V.R.'s Ravana", "In E.V.R.'s interpretation of the Ramayana, Ravana is the true hero. " +
      "He is the king of the subjugated Dravidians and bravely tries to fight against oppression from the North. " +
      "A strict vegetarian, Ravana won't even hurt a helpless animal. Congratulations! Like E.V.R.'s Ravana, you fight injustice that you perceive " +
      "due to class structures. ",
      "http://l7.alamy.com/zooms/69cc437602844935a227717f34ed4f7f/ramyana-hindu-god-ram-slaying-ravan-afjme9.jpg")

    val vali = CompleteResult("Valmiki's Vali", "Valmiki's Vali is a strong warrior who travels deep into the depths of a cave after the " +
      "raksasa Mayavi to protect his kingdom. Brave and strong, Vali has a personal sense of justice and his own monkey moral code. " +
      "A courageous warrior, Vali once humbled Ravana by trapping him in his armpit. Taken by surprise, Vali's killing is an episode for " +
      "moral contemplation in the Ramayana. Congratulations! Like Vali, you are brave and courageous. You might have your own sense of justice " +
      "and feel no duty to abide by the mainstream opinion.",
    "https://savitri-in-uploads.s3.amazonaws.com/uploads/photo/2265/medium_Vali.jpg")

    val sugriva = CompleteResult("Sugriva", "Sugriva and his army bravely help Rama conquer Lanka. While occasionally " +
      "distracted, Sugriva always comes back to his dharma (to help Rama). Congratulations! Like Sugriva you are incredibly brave " +
      "and persistent. You never give up and are loyal to your friends.",
    "https://upload.wikimedia.org/wikipedia/commons/d/da/Brooklyn_Museum_-_Rama_and_Lakshmana_Confer_with_Sugriva_about_the_Search_for_Sita_Page_from_a_Dispersed_Ramayana_Series.jpg")


    ResultsDataStore += ((1, sita))

    ResultsDataStore += ((2,rama))

    ResultsDataStore += ((3, valRama))

    ResultsDataStore += ((4, kumb))

    ResultsDataStore += ((5, han))

    ResultsDataStore += ((6, Lakshman))

    ResultsDataStore += ((7, evrRavan))

    ResultsDataStore += ((8, vali))

    ResultsDataStore += ((9, sugriva))

    true
  }

}
