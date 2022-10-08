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

sealed class EnglishObjYear(val route: String){
    object Obj2012: EnglishObjYear(route = "eng_study_obj2012_screen")
    object Obj2013: EnglishObjYear(route = "eng_study_obj2013_screen")
    object Obj2014: EnglishObjYear(route = "eng_study_obj2014_screen")
    object Obj2015: EnglishObjYear(route = "eng_study_obj2015_screen")
    object Obj2016: EnglishObjYear(route = "eng_study_obj2016_screen")
    object Obj2017: EnglishObjYear(route = "eng_study_obj2017_screen")
    object Obj2018: EnglishObjYear(route = "eng_study_obj2018_screen")
    object Obj2019: EnglishObjYear(route = "eng_study_obj2019_screen")
    object Obj2020: EnglishObjYear(route = "eng_study_obj2020_screen")
    object Obj2021: EnglishObjYear(route = "eng_study_obj2021_screen")
    object Obj2022: EnglishObjYear(route = "eng_study_obj2022_screen")


}
sealed class EnglishTheoryYear(val route: String){
    object Theory2012: EnglishTheoryYear(route = "eng_test_theory2012_screen")
    object Theory2013: EnglishTheoryYear(route = "eng_test_theory2013_screen")
    object Theory2014: EnglishTheoryYear(route = "eng_test_theory2014_screen")
    object Theory2015: EnglishTheoryYear(route = "eng_test_theory2015_screen")
    object Theory2016: EnglishTheoryYear(route = "eng_test_theory2016_screen")
    object Theory2017: EnglishTheoryYear(route = "eng_test_theory2017_screen")
    object Theory2018: EnglishTheoryYear(route = "eng_test_theory2018_screen")
    object Theory2019: EnglishTheoryYear(route = "eng_test_theory2019_screen")
    object Theory2020: EnglishTheoryYear(route = "eng_test_theory2020_screen")
    object Theory2021: EnglishTheoryYear(route = "eng_test_theory2021_screen")
    object Theory2022: EnglishTheoryYear(route = "eng_test_theory2022_screen")

}

sealed class MathObjYear(val route: String){
    object Obj2012: MathObjYear(route = "math_study_obj2012_screen")
    object Obj2013: MathObjYear(route = "math_study_obj2013_screen")
    object Obj2014: MathObjYear(route = "math_study_obj2014_screen")
    object Obj2015: MathObjYear(route = "math_study_obj2015_screen")
    object Obj2016: MathObjYear(route = "math_study_obj2016_screen")
    object Obj2017: MathObjYear(route = "math_study_obj2017_screen")
    object Obj2018: MathObjYear(route = "math_study_obj2018_screen")
    object Obj2019: MathObjYear(route = "math_study_obj2019_screen")
    object Obj2020: MathObjYear(route = "math_study_obj2020_screen")
    object Obj2021: MathObjYear(route = "math_study_obj2021_screen")
    object Obj2022: MathObjYear(route = "math_study_obj2022_screen")


}
sealed class MathTheoryYear(val route: String){

    object Theory2012: MathTheoryYear(route = "math_test_theory2012_screen")
    object Theory2013: MathTheoryYear(route = "math_test_theory2013_screen")
    object Theory2014: MathTheoryYear(route = "math_test_theory2014_screen")
    object Theory2015: MathTheoryYear(route = "math_test_theory2015_screen")
    object Theory2016: MathTheoryYear(route = "math_test_theory2016_screen")
    object Theory2017: MathTheoryYear(route = "math_test_theory2017_screen")
    object Theory2018: MathTheoryYear(route = "math_test_theory2018_screen")
    object Theory2019: MathTheoryYear(route = "math_test_theory2019_screen")
    object Theory2020: MathTheoryYear(route = "math_test_theory2020_screen")
    object Theory2021: MathTheoryYear(route = "math_test_theory2021_screen")
    object Theory2022: MathTheoryYear(route = "math_test_theory2022_screen")

}

sealed class AccountTheoryYear(val route: String){
    object Theory2012: AccountTheoryYear(route = "account_test_theory2012_screen")
    object Theory2013: AccountTheoryYear(route = "account_test_theory2013_screen")
    object Theory2014: AccountTheoryYear(route = "account_test_theory2014_screen")
    object Theory2015: AccountTheoryYear(route = "account_test_theory2015_screen")
    object Theory2016: AccountTheoryYear(route = "account_test_theory2016_screen")
    object Theory2017: AccountTheoryYear(route = "account_test_theory2017_screen")
    object Theory2018: AccountTheoryYear(route = "account_test_theory2018_screen")
    object Theory2019: AccountTheoryYear(route = "account_test_theory2019_screen")
    object Theory2020: AccountTheoryYear(route = "account_test_theory2020_screen")
    object Theory2021: AccountTheoryYear(route = "account_test_theory2021_screen")
    object Theory2022: AccountTheoryYear(route = "account_test_theory2022_screen")

}
sealed class AccountObjYear(val route: String){
    object Obj2012: AccountObjYear(route = "account_study_obj2012_screen")
    object Obj2013: AccountObjYear(route = "account_study_obj2013_screen")
    object Obj2014: AccountObjYear(route = "account_study_obj2014_screen")
    object Obj2015: AccountObjYear(route = "account_study_obj2015_screen")
    object Obj2016: AccountObjYear(route = "account_study_obj2016_screen")
    object Obj2017: AccountObjYear(route = "account_study_obj2017_screen")
    object Obj2018: AccountObjYear(route = "account_study_obj2018_screen")
    object Obj2019: AccountObjYear(route = "account_study_obj2019_screen")
    object Obj2020: AccountObjYear(route = "account_study_obj2020_screen")
    object Obj2021: AccountObjYear(route = "account_study_obj2021_screen")
    object Obj2022: AccountObjYear(route = "account_study_obj2022_screen")


}

sealed class EconomicsTheoryYear(val route: String){
    object Theory2012: EconomicsTheoryYear(route = "economics_theory2012_screen")
    object Theory2013: EconomicsTheoryYear(route = "economics_theory2013_screen")
    object Theory2014: EconomicsTheoryYear(route = "economics_theory2014_screen")
    object Theory2015: EconomicsTheoryYear(route = "economics_theory2015_screen")
    object Theory2016: EconomicsTheoryYear(route = "economics_theory2016_screen")
    object Theory2017: EconomicsTheoryYear(route = "economics_theory2017_screen")
    object Theory2018: EconomicsTheoryYear(route = "economics_theory2018_screen")
    object Theory2019: EconomicsTheoryYear(route = "economics_theory2019_screen")
    object Theory2020: EconomicsTheoryYear(route = "economics_theory2020_screen")
    object Theory2021: EconomicsTheoryYear(route = "economics_theory2021_screen")
    object Theory2022: EconomicsTheoryYear(route = "economics_theory2022_screen")

}
sealed class EconomicsObjYear(val route: String){
    object Obj2012: EconomicsObjYear(route = "account_obj2012_screen")
    object Obj2013: EconomicsObjYear(route = "account_obj2013_screen")
    object Obj2014: EconomicsObjYear(route = "account_obj2014_screen")
    object Obj2015: EconomicsObjYear(route = "account_obj2015_screen")
    object Obj2016: EconomicsObjYear(route = "account_obj2016_screen")
    object Obj2017: EconomicsObjYear(route = "account_obj2017_screen")
    object Obj2018: EconomicsObjYear(route = "account_obj2018_screen")
    object Obj2019: EconomicsObjYear(route = "account_obj2019_screen")
    object Obj2020: EconomicsObjYear(route = "account_obj2020_screen")
    object Obj2021: EconomicsObjYear(route = "account_obj2021_screen")
    object Obj2022: EconomicsObjYear(route = "account_obj2022_screen")


}


sealed class CivicEduObjYear(val route: String){
    object Obj2012: CivicEduObjYear(route = "civic_education_obj2012_screen")
    object Obj2013: CivicEduObjYear(route = "civic_education_obj2013_screen")
    object Obj2014: CivicEduObjYear(route = "civic_education_obj2014_screen")
    object Obj2015: CivicEduObjYear(route = "civic_education_obj2015_screen")
    object Obj2016: CivicEduObjYear(route = "civic_education_obj2016_screen")
    object Obj2017: CivicEduObjYear(route = "civic_education_obj2017_screen")
    object Obj2018: CivicEduObjYear(route = "civic_education_obj2018_screen")
    object Obj2019: CivicEduObjYear(route = "civic_education_obj2019_screen")
    object Obj2020: CivicEduObjYear(route = "civic_education_obj2020_screen")
    object Obj2021: CivicEduObjYear(route = "civic_education_obj2021_screen")
    object Obj2022: CivicEduObjYear(route = "civic_education_obj2022_screen")
}
sealed class CivicEduTheoryYear(val route: String){
    object Theory2012: CivicEduTheoryYear(route = "civic_education_theory2012_screen")
    object Theory2013: CivicEduTheoryYear(route = "civic_education_theory2013_screen")
    object Theory2014: CivicEduTheoryYear(route = "civic_education_theory2014_screen")
    object Theory2015: CivicEduTheoryYear(route = "civic_education_theory2015_screen")
    object Theory2016: CivicEduTheoryYear(route = "civic_education_theory2016_screen")
    object Theory2017: CivicEduTheoryYear(route = "civic_education_theory2017_screen")
    object Theory2018: CivicEduTheoryYear(route = "civic_education_theory2018_screen")
    object Theory2019: CivicEduTheoryYear(route = "civic_education_theory2019_screen")
    object Theory2020: CivicEduTheoryYear(route = "civic_education_theory2020_screen")
    object Theory2021: CivicEduTheoryYear(route = "civic_education_theory2021_screen")
    object Theory2022: CivicEduTheoryYear(route = "civic_education_theory2022_screen")
}


sealed class BiologyObjYear(val route: String){
    object Obj2012: BiologyObjYear(route = "biology_obj2012_screen")
    object Obj2013: BiologyObjYear(route = "biology_obj2013_screen")
    object Obj2014: BiologyObjYear(route = "biology_obj2014_screen")
    object Obj2015: BiologyObjYear(route = "biology_obj2015_screen")
    object Obj2016: BiologyObjYear(route = "biology_obj2016_screen")
    object Obj2017: BiologyObjYear(route = "biology_obj2017_screen")
    object Obj2018: BiologyObjYear(route = "biology_obj2018_screen")
    object Obj2019: BiologyObjYear(route = "biology_obj2019_screen")
    object Obj2020: BiologyObjYear(route = "biology_obj2020_screen")
    object Obj2021: BiologyObjYear(route = "biology_obj2021_screen")
    object Obj2022: BiologyObjYear(route = "biology_obj2022_screen")
}
sealed class BiologyTheoryYear(val route: String){
    object Theory2012: BiologyTheoryYear(route = "biology_theory2012_screen")
    object Theory2013: BiologyTheoryYear(route = "biology_theory2013_screen")
    object Theory2014: BiologyTheoryYear(route = "biology_theory2014_screen")
    object Theory2015: BiologyTheoryYear(route = "biology_theory2015_screen")
    object Theory2016: BiologyTheoryYear(route = "biology_theory2016_screen")
    object Theory2017: BiologyTheoryYear(route = "biology_theory2017_screen")
    object Theory2018: BiologyTheoryYear(route = "biology_theory2018_screen")
    object Theory2019: BiologyTheoryYear(route = "biology_theory2019_screen")
    object Theory2020: BiologyTheoryYear(route = "biology_theory2020_screen")
    object Theory2021: BiologyTheoryYear(route = "biology_theory2021_screen")
    object Theory2022: BiologyTheoryYear(route = "biology_theory2022_screen")
}


sealed class CommerceObjYear(val route: String){
    object Obj2012: CommerceObjYear(route = "commerce_obj2012_screen")
    object Obj2013: CommerceObjYear(route = "commerce_obj2013_screen")
    object Obj2014: CommerceObjYear(route = "commerce_obj2014_screen")
    object Obj2015: CommerceObjYear(route = "commerce_obj2015_screen")
    object Obj2016: CommerceObjYear(route = "commerce_obj2016_screen")
    object Obj2017: CommerceObjYear(route = "commerce_obj2017_screen")
    object Obj2018: CommerceObjYear(route = "commerce_obj2018_screen")
    object Obj2019: CommerceObjYear(route = "commerce_obj2019_screen")
    object Obj2020: CommerceObjYear(route = "commerce_obj2020_screen")
    object Obj2021: CommerceObjYear(route = "commerce_obj2021_screen")
    object Obj2022: CommerceObjYear(route = "commerce_obj2022_screen")
}

sealed class CommerceTheoryYear(val route: String){
    object Theory2012: CommerceTheoryYear(route = "commerce_theory2012_screen")
    object Theory2013: CommerceTheoryYear(route = "commerce_theory2013_screen")
    object Theory2014: CommerceTheoryYear(route = "commerce_theory2014_screen")
    object Theory2015: CommerceTheoryYear(route = "commerce_theory2015_screen")
    object Theory2016: CommerceTheoryYear(route = "commerce_theory2016_screen")
    object Theory2017: CommerceTheoryYear(route = "commerce_theory2017_screen")
    object Theory2018: CommerceTheoryYear(route = "commerce_theory2018_screen")
    object Theory2019: CommerceTheoryYear(route = "commerce_theory2019_screen")
    object Theory2020: CommerceTheoryYear(route = "commerce_theory2020_screen")
    object Theory2021: CommerceTheoryYear(route = "commerce_theory2021_screen")
    object Theory2022: CommerceTheoryYear(route = "commerce_theory2022_screen")
}


sealed class PhysicsObjYear(val route: String){
    object Obj2012: PhysicsObjYear(route = "physics_obj2012_screen")
    object Obj2013: PhysicsObjYear(route = "physics_obj2013_screen")
    object Obj2014: PhysicsObjYear(route = "physics_obj2014_screen")
    object Obj2015: PhysicsObjYear(route = "physics_obj2015_screen")
    object Obj2016: PhysicsObjYear(route = "physics_obj2016_screen")
    object Obj2017: PhysicsObjYear(route = "physics_obj2017_screen")
    object Obj2018: PhysicsObjYear(route = "physics_obj2018_screen")
    object Obj2019: PhysicsObjYear(route = "physics_obj2019_screen")
    object Obj2020: PhysicsObjYear(route = "physics_obj2020_screen")
    object Obj2021: PhysicsObjYear(route = "physics_obj2021_screen")
    object Obj2022: PhysicsObjYear(route = "physics_obj2022_screen")
}

sealed class PhysicsTheoryYear(val route: String){
    object Theory2012: PhysicsTheoryYear(route = "physics_theory2012_screen")
    object Theory2013: PhysicsTheoryYear(route = "physics_theory2013_screen")
    object Theory2014: PhysicsTheoryYear(route = "physics_theory2014_screen")
    object Theory2015: PhysicsTheoryYear(route = "physics_theory2015_screen")
    object Theory2016: PhysicsTheoryYear(route = "physics_theory2016_screen")
    object Theory2017: PhysicsTheoryYear(route = "physics_theory2017_screen")
    object Theory2018: PhysicsTheoryYear(route = "physics_theory2018_screen")
    object Theory2019: PhysicsTheoryYear(route = "physics_theory2019_screen")
    object Theory2020: PhysicsTheoryYear(route = "physics_theory2020_screen")
    object Theory2021: PhysicsTheoryYear(route = "physics_theory2021_screen")
    object Theory2022: PhysicsTheoryYear(route = "physics_theory2022_screen")
}

sealed class AgricultureObjYear(val route: String){
    object Obj2012: AgricultureObjYear(route = "Agriculture_obj2012_screen")
    object Obj2013: AgricultureObjYear(route = "Agriculture_obj2013_screen")
    object Obj2014: AgricultureObjYear(route = "Agriculture_obj2014_screen")
    object Obj2015: AgricultureObjYear(route = "Agriculture_obj2015_screen")
    object Obj2016: AgricultureObjYear(route = "Agriculture_obj2016_screen")
    object Obj2017: AgricultureObjYear(route = "Agriculture_obj2017_screen")
    object Obj2018: AgricultureObjYear(route = "Agriculture_obj2018_screen")
    object Obj2019: AgricultureObjYear(route = "Agriculture_obj2019_screen")
    object Obj2020: AgricultureObjYear(route = "Agriculture_obj2020_screen")
    object Obj2021: AgricultureObjYear(route = "Agriculture_obj2021_screen")
    object Obj2022: AgricultureObjYear(route = "Agriculture_obj2022_screen")
}

sealed class AgricultureTheoryYear(val route: String){
    object Theory2012: AgricultureTheoryYear(route = "Agriculture_theory2012_screen")
    object Theory2013: AgricultureTheoryYear(route = "Agriculture_theory2013_screen")
    object Theory2014: AgricultureTheoryYear(route = "Agriculture_theory2014_screen")
    object Theory2015: AgricultureTheoryYear(route = "Agriculture_theory2015_screen")
    object Theory2016: AgricultureTheoryYear(route = "Agriculture_theory2016_screen")
    object Theory2017: AgricultureTheoryYear(route = "Agriculture_theory2017_screen")
    object Theory2018: AgricultureTheoryYear(route = "Agriculture_theory2018_screen")
    object Theory2019: AgricultureTheoryYear(route = "Agriculture_theory2019_screen")
    object Theory2020: AgricultureTheoryYear(route = "Agriculture_theory2020_screen")
    object Theory2021: AgricultureTheoryYear(route = "Agriculture_theory2021_screen")
    object Theory2022: AgricultureTheoryYear(route = "Agriculture_theory2022_screen")
}

sealed class LiteratureObjYear(val route: String){
    object Obj2012: LiteratureObjYear(route = "literature_obj2012_screen")
    object Obj2013: LiteratureObjYear(route = "literature_obj2013_screen")
    object Obj2014: LiteratureObjYear(route = "literature_obj2014_screen")
    object Obj2015: LiteratureObjYear(route = "literature_obj2015_screen")
    object Obj2016: LiteratureObjYear(route = "literature_obj2016_screen")
    object Obj2017: LiteratureObjYear(route = "literature_obj2017_screen")
    object Obj2018: LiteratureObjYear(route = "literature_obj2018_screen")
    object Obj2019: LiteratureObjYear(route = "literature_obj2019_screen")
    object Obj2020: LiteratureObjYear(route = "literature_obj2020_screen")
    object Obj2021: LiteratureObjYear(route = "literature_obj2021_screen")
    object Obj2022: LiteratureObjYear(route = "literature_obj2022_screen")

}

sealed class LiteratureTheoryYear(val route: String){
    object Theory2012: LiteratureTheoryYear(route = "literature_theory2012_screen")
    object Theory2013: LiteratureTheoryYear(route = "literature_theory2013_screen")
    object Theory2014: LiteratureTheoryYear(route = "literature_theory2014_screen")
    object Theory2015: LiteratureTheoryYear(route = "literature_theory2015_screen")
    object Theory2016: LiteratureTheoryYear(route = "literature_theory2016_screen")
    object Theory2017: LiteratureTheoryYear(route = "literature_theory2017_screen")
    object Theory2018: LiteratureTheoryYear(route = "literature_theory2018_screen")
    object Theory2019: LiteratureTheoryYear(route = "literature_theory2019_screen")
    object Theory2020: LiteratureTheoryYear(route = "literature_theory2020_screen")
    object Theory2021: LiteratureTheoryYear(route = "literature_theory2021_screen")
    object Theory2022: LiteratureTheoryYear(route = "literature_theory2022_screen")

}

sealed class ChemistryObjYear(val route: String){
    object Obj2012: ChemistryObjYear(route = "chemistry_obj2012_screen")
    object Obj2013: ChemistryObjYear(route = "chemistry_obj2013_screen")
    object Obj2014: ChemistryObjYear(route = "chemistry_obj2014_screen")
    object Obj2015: ChemistryObjYear(route = "chemistry_obj2015_screen")
    object Obj2016: ChemistryObjYear(route = "chemistry_obj2016_screen")
    object Obj2017: ChemistryObjYear(route = "chemistry_obj2017_screen")
    object Obj2018: ChemistryObjYear(route = "chemistry_obj2018_screen")
    object Obj2019: ChemistryObjYear(route = "chemistry_obj2019_screen")
    object Obj2020: ChemistryObjYear(route = "chemistry_obj2020_screen")
    object Obj2021: ChemistryObjYear(route = "chemistry_obj2021_screen")
    object Obj2022: ChemistryObjYear(route = "chemistry_obj2022_screen")

}

sealed class ChemistryTheoryYear(val route: String){
    object Theory2012: ChemistryTheoryYear(route = "chemistry_theory2012_screen")
    object Theory2013: ChemistryTheoryYear(route = "chemistry_theory2013_screen")
    object Theory2014: ChemistryTheoryYear(route = "chemistry_theory2014_screen")
    object Theory2015: ChemistryTheoryYear(route = "chemistry_theory2015_screen")
    object Theory2016: ChemistryTheoryYear(route = "chemistry_theory2016_screen")
    object Theory2017: ChemistryTheoryYear(route = "chemistry_theory2017_screen")
    object Theory2018: ChemistryTheoryYear(route = "chemistry_theory2018_screen")
    object Theory2019: ChemistryTheoryYear(route = "chemistry_theory2019_screen")
    object Theory2020: ChemistryTheoryYear(route = "chemistry_theory2020_screen")
    object Theory2021: ChemistryTheoryYear(route = "chemistry_theory2021_screen")
    object Theory2022: ChemistryTheoryYear(route = "chemistry_theory2022_screen")
}


sealed class GovernmentObjYear(val route: String){
    object Obj2012: GovernmentObjYear(route = "government_obj2012_screen")
    object Obj2013: GovernmentObjYear(route = "government_obj2013_screen")
    object Obj2014: GovernmentObjYear(route = "government_obj2014_screen")
    object Obj2015: GovernmentObjYear(route = "government_obj2015_screen")
    object Obj2016: GovernmentObjYear(route = "government_obj2016_screen")
    object Obj2017: GovernmentObjYear(route = "government_obj2017_screen")
    object Obj2018: GovernmentObjYear(route = "government_obj2018_screen")
    object Obj2019: GovernmentObjYear(route = "government_obj2019_screen")
    object Obj2020: GovernmentObjYear(route = "government_obj2020_screen")
    object Obj2021: GovernmentObjYear(route = "government_obj2021_screen")
    object Obj2022: GovernmentObjYear(route = "government_obj2022_screen")
}

sealed class GovernmentTheoryYear(val route: String){
    object Theory2012: GovernmentTheoryYear(route = "government_theory2012_screen")
    object Theory2013: GovernmentTheoryYear(route = "government_theory2013_screen")
    object Theory2014: GovernmentTheoryYear(route = "government_theory2014_screen")
    object Theory2015: GovernmentTheoryYear(route = "government_theory2015_screen")
    object Theory2016: GovernmentTheoryYear(route = "government_theory2016_screen")
    object Theory2017: GovernmentTheoryYear(route = "government_theory2017_screen")
    object Theory2018: GovernmentTheoryYear(route = "government_theory2018_screen")
    object Theory2019: GovernmentTheoryYear(route = "government_theory2019_screen")
    object Theory2020: GovernmentTheoryYear(route = "government_theory2020_screen")
    object Theory2021: GovernmentTheoryYear(route = "government_theory2021_screen")
    object Theory2022: GovernmentTheoryYear(route = "government_theory2022_screen")
}


sealed class MarketingObjYear(val route: String){
    object Obj2012: MarketingObjYear(route = "marketing_obj2012_screen")
    object Obj2013: MarketingObjYear(route = "marketing_obj2013_screen")
    object Obj2014: MarketingObjYear(route = "marketing_obj2014_screen")
    object Obj2015: MarketingObjYear(route = "marketing_obj2015_screen")
    object Obj2016: MarketingObjYear(route = "marketing_obj2016_screen")
    object Obj2017: MarketingObjYear(route = "marketing_obj2017_screen")
    object Obj2018: MarketingObjYear(route = "marketing_obj2018_screen")
    object Obj2019: MarketingObjYear(route = "marketing_obj2019_screen")
    object Obj2020: MarketingObjYear(route = "marketing_obj2020_screen")
    object Obj2021: MarketingObjYear(route = "marketing_obj2021_screen")
    object Obj2022: MarketingObjYear(route = "marketing_obj2022_screen")
}

sealed class MarketingTheoryYear(val route: String){
    object Theory2012: MarketingTheoryYear(route = "marketing_theory2012_screen")
    object Theory2013: MarketingTheoryYear(route = "marketing_theory2013_screen")
    object Theory2014: MarketingTheoryYear(route = "marketing_theory2014_screen")
    object Theory2015: MarketingTheoryYear(route = "marketing_theory2015_screen")
    object Theory2016: MarketingTheoryYear(route = "marketing_theory2016_screen")
    object Theory2017: MarketingTheoryYear(route = "marketing_theory2017_screen")
    object Theory2018: MarketingTheoryYear(route = "marketing_theory2018_screen")
    object Theory2019: MarketingTheoryYear(route = "marketing_theory2019_screen")
    object Theory2020: MarketingTheoryYear(route = "marketing_theory2020_screen")
    object Theory2021: MarketingTheoryYear(route = "marketing_theory2021_screen")
    object Theory2022: MarketingTheoryYear(route = "marketing_theory2022_screen")
}
