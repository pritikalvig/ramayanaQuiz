package models
import scala.collection.mutable.HashMap

/**
  * Created by pritikavig on 5/5/17.
  */
case class QuestionDataStore() {

  private val QuestionDataStore: HashMap[Int,CompleteQuestion] = HashMap[Int,CompleteQuestion]()


  def lookUpQuestion(questionId: Int): CompleteQuestion = {
    QuestionDataStore(questionId)
  }

  def buildMap(): Boolean = {

    val baseurl = "https://ramayanaquiz.herokuapp.com/q/"
    val resulturl = "https://ramayanaquiz.herokuapp.com/result/"

    // Question 1
    val q1Text = "You wake up in the morning and are almost late for class! You decide to wear…"
    val nextL = "2"
    val q1a1 = Answer(answerText = "T-shirt and jeans! Whatever is the fastest, it's your job to be in class.",
      baseurl+nextL)
    val q1a2 = Answer("My ~Girl Power~ T-Shirt. It's important to make a statement.",
      baseurl +nextL)
    val q1a3 = Answer("My new Beta brand skirt. Gotta indulge every once in awhile!",
      baseurl+nextL)
    val answers1 = List(q1a1, q1a2, q1a3)
    val q1 = CompleteQuestion( questionId = 1, questionText = q1Text, answers = answers1 )


    QuestionDataStore += ((1, q1))

    // Question 2
    val q2Text = "Oh no! You have a Pop Quiz in your first class. "
    val q2a1 = Answer(answerText = "No sweat. I study regularly so I'm totally prepared",
      nextLink = baseurl+"3")
    val q2a2 = Answer("Uh oh. I was busy helping a friend with a problem yesterday, " +
      "so I only had a little time to study", baseurl+"3")
    val q2a3 = Answer("Oh well. I have lots of other athletic talents and I was busy " +
      "helping the team win the soccer game yesterday.", baseurl+"3")
    val answers2 = List(q2a1, q2a2, q2a3)
    val q2 = CompleteQuestion( questionId = 2, q2Text, answers = answers2)

    QuestionDataStore += ((2, q2))

    val q3Text = "Time to fill out your roommate preference sheet for next year! " +
      "You would describe your sleeping habits as ..."
    val q3a1 = Answer("Early to bed and early to rise. You are traditional and a creature of habit.",
    baseurl+"4")
    val q3a2 = Answer("Unpredictable! You are always willing to help a friend and sometimes" +
      " you are up late assisting your pals.", baseurl+"4")
    val q3a3 = Answer("You don't fill out the form. You already know that you are rooming with your brother!",
    baseurl+"4")
    val q3 = CompleteQuestion(3, q3Text, List(q3a1, q3a2, q3a3))

    QuestionDataStore +=((3,q3))

    val q4Text = "Philosophy Class! True or False: You think people are Good or Bad but not both."
    val q4a1 = Answer("True! To be truly Good you must be righteous in every act.",
    baseurl + "5")
    val q4a2 = Answer("False. The world cannot be divided into two categories and each action must be " +
      "judged individually",
    baseurl+ "6")
    val q4 = CompleteQuestion(4, q4Text, List(q4a1, q4a2))

    QuestionDataStore += ((4, q4))

    // 5: ramas, hanuman, sita, lakshman
    val q5Text = "Oh no! You overbooked yourself for this evening. You chose to…"
    val q5a1 = Answer("Volunteer at the food pantry. It is your duty and it won't" +
      " open without you there", baseurl + 7)
    val q5a2 = Answer("Attend your sister's piano recital. She really needs the support.",
      baseurl + 8)
    val q5a3 = Answer("Head to soccer practice, you are athletic and really help your team",
    baseurl + 8 )
    val q5 = CompleteQuestion(5, q5Text, List(q5a1, q5a2, q5a3))
    QuestionDataStore += ((5, q5))


    // 6: Kumbhakarna, Vali, Sugriva, Ravana
    val q6Text = "You are very stressed about your upcoming test. You decide to.."
    val q6a1 = Answer("Meditate. Relaxing your mind and focussing always calms you down",
    baseurl + 11)
    val q6a2 = Answer("Go out for a run! You need to get some pent up energy out. ",
    baseurl + 12)
    val q6a3 = Answer("Nothing, you are very confident you will succeed.",
    baseurl + 12)
    val q6 = CompleteQuestion(6, q6Text, List(q6a1, q6a2, q6a3))
    QuestionDataStore += ((6, q6))


    // 7: Ramas, Lakshman

    val q7Text = "You are outside hanging out with your siblings and decide to play a game. You…"
    val q7a1 = Answer("Quietly let your younger siblings win. It's nice to see them happy,",
    baseurl+ 9)
    val q7a2 = Answer("Let your older siblings decide on the game and" +
      " teach it to you.",
    baseurl +10)
    val q7 = CompleteQuestion(7, q7Text, List(q7a1, q7a2))
    QuestionDataStore += ((7, q7))

    // 8: Sita, Hanuman

    val q8Text = "You are headed to your extracurricular club for some volunteer service. It is.."
    val q8a1 = Answer("Planned Parenthood. You are passionate about women's rights.",
    resulturl + "1")
    val q8a2 = Answer("Dartmouth's Humanitarian Engineering Club. " +
      "You are creative and a good problem solver.",
    resulturl + "5")
    val q8 = CompleteQuestion(8, q8Text, List(q8a1, q8a2))

    QuestionDataStore += ((8, q8))

    // 9: Ramas
    val q9Text = "Which of the following statements most describes your role model:"
    val q9a1 = Answer("It's my favorite athlete! He is incredibly talented at his craft, " +
      "and I look past any bad press, as it is hard to tell the true story and I know everyone is not " +
      "perfect",
    resulturl + "3")
    val q9a2 = Answer("Beyonce, duh. She is perfect in every way and can do absolutely no wrong.",
    resulturl + "2")
    val q9 = CompleteQuestion(9, q9Text, List(q9a1, q9a2))

    QuestionDataStore += ((9, q9))

    // 10: Lakshman
    val q10Text = "You go home to do your chores. You.. "
    val q10a1 = Answer("Tidy up the house and make a meal. It will be nice when your family comes home",
    resulturl+"1")
    val q10a2 = Answer("Help your brother chop the wood. Technically it is his chore, but you are happy " +
      "to help him get the work done more quickly.",
    resulturl + "6")
    val q10a3 = Answer("Help your mom find her lost earring! You have sharp vision and an uncanny " +
      "ability to fit into small spaces. ",
    resulturl + "5")
    val q10 = CompleteQuestion(10, q10Text, List(q10a1, q10a2))

    QuestionDataStore += ((10, q10))

    // 11: Kumbhakarna, Sugriva, Ravan
    val q11Text = "Time to vote in the town election. You pick:  "

    val q11a1 = Answer("The candidate with the closest match to your spiritual beliefs, who you " +
      "think will do the right thing.",
      baseurl + "13")
    val q11a2 = Answer("Oops! You forgot to vote. You just returned from a long trip and were busy " +
      "enjoying the pleasures of your home",
      resulturl + "9")
    val q11 = CompleteQuestion(11, q11Text, List(q11a1, q11a2))
    QuestionDataStore += ((11, q11))

    // 12: Vali, Sugriva, Ravana
    val q12Text = "Time to declare your major! You choose:"
    val q12a1 = Answer("Economics! You want to learn all about economic structures so you can close " +
      "the income gap.",
      resulturl+"7")
    val q12a2 = Answer("Government. You were born to be a leader and want to do a good job. ",
    resulturl + "8")
    val q12a3 = Answer("Whatever my best friend is doing! It is important to have allies in a war, uh I mean school",
    resulturl +"9")
    val q12 = CompleteQuestion(12, q12Text, List(q12a1, q12a2, q12a3))

    QuestionDataStore += ((12, q12))

    // 13: Kumbhakarna and Ravana
    val q13Text = "Which of the following statements do you identify with:"
    val q13a1 = Answer("I would side with my family, even if I knew they were wrong.",
      resulturl + "4")
    val q13a2 = Answer("It is important to stand up for the oppressed, " +
      "even if you oppose your family.",
      resulturl + "7")
    val q13a3 = Answer("Uh.. neither of those?",
      baseurl + "12")
    val q13 = CompleteQuestion(13, q13Text, List(q13a1, q13a2, q13a3))
    QuestionDataStore += ((13, q13))

    true

  }

}
