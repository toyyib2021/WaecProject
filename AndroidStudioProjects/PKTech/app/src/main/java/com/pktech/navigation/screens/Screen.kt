package com.pktech.navigation.screens


sealed class Screen(val route: String){
    object Welcome: Screen(route = "welcome_screen")
    object Result: Screen(route = "result_screen")
    object Splash: Screen(route = "splash")
    object SignIn: Screen(route = "sign_in_screen")
    object SignUp: Screen(route = "sign_up_screen")
    object DashBoard: Screen(route = "dashBoard_screen")

    object StudyTopic: Screen(route = "study_topic_screen /{selectedStudyTopic}") {
        fun selectedStudyTopic(selectedStudyTopic: String): String {
            return "study_topic_screen/$selectedStudyTopic"
        }
    }

    object StudyYear: Screen(route = "study_year_screen/{selectedStudyYear}") {
        fun selectedStudyYear(selectedStudyYear: String): String {
            return "study_year_screen/$selectedStudyYear"
        }
    }

    object TestYear: Screen(route = "test_year_screen/{selectedTestYear}") {
        fun selectedTestYear(selectedTestYear: String): String {
            return "test_year_screen/$selectedTestYear"
        }
    }

    object TestTopic: Screen(route = "test_topic_screen/{selectedTestTopic}") {
        fun selectedTestTopic(selectedTestTopic: String): String {
            return "test_topic_screen/$selectedTestTopic"
        }
    }

    object Literature: Screen(route = "literature_screen")
    object SaveQuestion: Screen(route = "save_question_screen")
    object Activation: Screen(route = "activation_screen")


    object MakePayment: Screen(route = "MakePayment_screen")
    object Paid: Screen(route = "Paid_screen")
    object Update: Screen(route = "update_screen/{selectedOptionId}/{selectedOptionId2}") {
        fun passSelectedOptionId(selectedOptionId: Int,selectedOptionId2: String ): String {
            return "update_screen/$selectedOptionId/$selectedOptionId2"
        }
    }
    object Get: Screen(route = "get_screen/{getName}") {
        fun passName(getName: String): String {
            return "get_screen/$getName"
        }
    }

}

sealed class EnglishStudyYear(val route: String){
    object Obj2012: EnglishStudyYear(route = "eng_study_obj2012_screen")
    object Obj2013: EnglishStudyYear(route = "eng_study_obj2013_screen")
    object Obj2014: EnglishStudyYear(route = "eng_study_obj2014_screen")
    object Obj2015: EnglishStudyYear(route = "eng_study_obj2015_screen")
    object Obj2016: EnglishStudyYear(route = "eng_study_obj2016_screen")
    object Obj2017: EnglishStudyYear(route = "eng_study_obj2017_screen")
    object Obj2018: EnglishStudyYear(route = "eng_study_obj2018_screen")
    object Obj2019: EnglishStudyYear(route = "eng_study_obj2019_screen")
    object Obj2020: EnglishStudyYear(route = "eng_study_obj2020_screen")
    object Obj2021: EnglishStudyYear(route = "eng_study_obj2021_screen")
    object Obj2022: EnglishStudyYear(route = "eng_study_obj2022_screen")

    object Theory2012: EnglishStudyYear(route = "eng_study_theory2012_screen")
    object Theory2013: EnglishStudyYear(route = "eng_study_theory2013_screen")
    object Theory2014: EnglishStudyYear(route = "eng_study_theory2014_screen")
    object Theory2015: EnglishStudyYear(route = "eng_study_theory2015_screen")
    object Theory2016: EnglishStudyYear(route = "eng_study_theory2016_screen")
    object Theory2017: EnglishStudyYear(route = "eng_study_theory2017_screen")
    object Theory2018: EnglishStudyYear(route = "eng_study_theory2018_screen")
    object Theory2019: EnglishStudyYear(route = "eng_study_theory2019_screen")
    object Theory2020: EnglishStudyYear(route = "eng_study_theory2020_screen")
    object Theory2021: EnglishStudyYear(route = "eng_study_theory2021_screen")
    object Theory2022: EnglishStudyYear(route = "eng_study_theory2022_screen")

}
sealed class EnglishTestYear(val route: String){
    object Obj2012: EnglishTestYear(route = "eng_test_obj2012_screen")
    object Obj2013: EnglishTestYear(route = "eng_test_obj2013_screen")
    object Obj2014: EnglishTestYear(route = "eng_test_obj2014_screen")
    object Obj2015: EnglishTestYear(route = "eng_test_obj2015_screen")
    object Obj2016: EnglishTestYear(route = "eng_test_obj2016_screen")
    object Obj2017: EnglishTestYear(route = "eng_test_obj2017_screen")
    object Obj2018: EnglishTestYear(route = "eng_test_obj2018_screen")
    object Obj2019: EnglishTestYear(route = "eng_test_obj2019_screen")
    object Obj2020: EnglishTestYear(route = "eng_test_obj2020_screen")
    object Obj2021: EnglishTestYear(route = "eng_test_obj2021_screen")
    object Obj2022: EnglishTestYear(route = "eng_test_obj2022_screen")

    object Theory2012: EnglishTestYear(route = "eng_test_theory2012_screen")
    object Theory2013: EnglishTestYear(route = "eng_test_theory2013_screen")
    object Theory2014: EnglishTestYear(route = "eng_test_theory2014_screen")
    object Theory2015: EnglishTestYear(route = "eng_test_theory2015_screen")
    object Theory2016: EnglishTestYear(route = "eng_test_theory2016_screen")
    object Theory2017: EnglishTestYear(route = "eng_test_theory2017_screen")
    object Theory2018: EnglishTestYear(route = "eng_test_theory2018_screen")
    object Theory2019: EnglishTestYear(route = "eng_test_theory2019_screen")
    object Theory2020: EnglishTestYear(route = "eng_test_theory2020_screen")
    object Theory2021: EnglishTestYear(route = "eng_test_theory2021_screen")
    object Theory2022: EnglishTestYear(route = "eng_test_theory2022_screen")

}
sealed class MathStudyYear(val route: String){
    object Obj2012: MathStudyYear(route = "math_study_obj2012_screen")
    object Obj2013: MathStudyYear(route = "math_study_obj2013_screen")
    object Obj2014: MathStudyYear(route = "math_study_obj2014_screen")
    object Obj2015: MathStudyYear(route = "math_study_obj2015_screen")
    object Obj2016: MathStudyYear(route = "math_study_obj2016_screen")
    object Obj2017: MathStudyYear(route = "math_study_obj2017_screen")
    object Obj2018: MathStudyYear(route = "math_study_obj2018_screen")
    object Obj2019: MathStudyYear(route = "math_study_obj2019_screen")
    object Obj2020: MathStudyYear(route = "math_study_obj2020_screen")
    object Obj2021: MathStudyYear(route = "math_study_obj2021_screen")
    object Obj2022: MathStudyYear(route = "math_study_obj2022_screen")


    object Theory2012: MathStudyYear(route = "math_study_theory2012_screen")
    object Theory2013: MathStudyYear(route = "math_study_theory2013_screen")
    object Theory2014: MathStudyYear(route = "math_study_theory2014_screen")
    object Theory2015: MathStudyYear(route = "math_study_theory2015_screen")
    object Theory2016: MathStudyYear(route = "math_study_theory2016_screen")
    object Theory2017: MathStudyYear(route = "math_study_theory2017_screen")
    object Theory2018: MathStudyYear(route = "math_study_theory2018_screen")
    object Theory2019: MathStudyYear(route = "math_study_theory2019_screen")
    object Theory2020: MathStudyYear(route = "math_study_theory2020_screen")
    object Theory2021: MathStudyYear(route = "math_study_theory2021_screen")
    object Theory2022: MathStudyYear(route = "math_study_theory2022_screen")

}
sealed class MathTestyYear(val route: String){
    object Obj2012: MathTestyYear(route = "math_test_obj2012_screen")
    object Obj2013: MathTestyYear(route = "math_test_obj2013_screen")
    object Obj2014: MathTestyYear(route = "math_test_obj2014_screen")
    object Obj2015: MathTestyYear(route = "math_test_obj2015_screen")
    object Obj2016: MathTestyYear(route = "math_test_obj2016_screen")
    object Obj2017: MathTestyYear(route = "math_test_obj2017_screen")
    object Obj2018: MathTestyYear(route = "math_test_obj2018_screen")
    object Obj2019: MathTestyYear(route = "math_test_obj2019_screen")
    object Obj2020: MathTestyYear(route = "math_test_obj2020_screen")
    object Obj2021: MathTestyYear(route = "math_test_obj2021_screen")
    object Obj2022: MathTestyYear(route = "math_test_obj2022_screen")


    object Theory2012: MathTestyYear(route = "math_test_theory2012_screen")
    object Theory2013: MathTestyYear(route = "math_test_theory2013_screen")
    object Theory2014: MathTestyYear(route = "math_test_theory2014_screen")
    object Theory2015: MathTestyYear(route = "math_test_theory2015_screen")
    object Theory2016: MathTestyYear(route = "math_test_theory2016_screen")
    object Theory2017: MathTestyYear(route = "math_test_theory2017_screen")
    object Theory2018: MathTestyYear(route = "math_test_theory2018_screen")
    object Theory2019: MathTestyYear(route = "math_test_theory2019_screen")
    object Theory2020: MathTestyYear(route = "math_test_theory2020_screen")
    object Theory2021: MathTestyYear(route = "math_test_theory2021_screen")
    object Theory2022: MathTestyYear(route = "math_test_theory2022_screen")

}



