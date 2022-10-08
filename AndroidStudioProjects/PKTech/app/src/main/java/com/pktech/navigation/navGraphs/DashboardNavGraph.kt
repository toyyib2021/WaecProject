package com.pktech.navigation.navGraphs

import android.content.ContentValues.TAG
import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.pktech.MainActivity
import com.pktech.utill.Constants.HOME_GRAPH_ROUTE
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.activation.GetActivationCode
import com.pktech.presentation.screens.dashboard.Dashboard
import com.pktech.presentation.screens.list.StudyAndTestYearList
import com.pktech.presentation.screens.literatures.Literatures
import com.pktech.presentation.screens.saveQuestion.SaveQuestion
import com.pktech.presentation.screens.subjects.items.TestResult
import com.pktech.ui.OnYearClick


fun NavGraphBuilder.dashboardNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.DashBoard.route,
        route = HOME_GRAPH_ROUTE
    ){
        composable(
            route = Screen.DashBoard.route
        ){
            var backPressedTime: Long = 0
            Dashboard(
                navControllerStudyTopic = { navController.navigate(Screen.StudyTopic.route) },
                navControllerStudyYear = { navController.navigate(Screen.StudyYear.route)},
                navControllerTestTopic = { navController.navigate(Screen.TestTopic.route) },
                navControllerTestYear = { navController.navigate(Screen.TestYear.route)  },
                navControllerOnSaveQuestionClick = { navController.navigate(Screen.SaveQuestion.route) },
                navControllerOnLiteratureClick = { navController.navigate(Screen.Literature.route) },
                backHandler = {
                    if (backPressedTime + 3000 > System.currentTimeMillis()) {
                        val activity: MainActivity = MainActivity()
                        // on below line we are finishing activity.
                        activity.finish()
                        System.exit(0)
                    } else {
                        Log.i(TAG, "dashboardNavGraph: press back button again ")
                    }
                    backPressedTime = System.currentTimeMillis()

                    }
            )
        }

        composable(
            route = Screen.Result.route
        ){
            TestResult(
                backHandler = { navController.navigate(Screen.DashBoard.route){
                    navController.clearBackStack(MathObjYear.Obj2012.route)
                }}
            )
        }

        composable(
            route = Screen.StudyTopic.route
        ){

        }

        composable(
            route = Screen.StudyYear.route,
        ){
            StudyAndTestYearList(
                onBackArrowClick = { navController.popBackStack() },
                onBackHandlerClick = {navController.popBackStack()},
                onEngObjYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EnglishObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EnglishObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(EnglishObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(EnglishObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(EnglishObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(EnglishObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(EnglishObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(EnglishObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(EnglishObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(EnglishObjYear.Obj2022.route)}
                ),
                onMathObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(MathObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(MathObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(MathObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(MathObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(MathObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(MathObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(MathObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(MathObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(MathObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(MathObjYear.Obj2022.route)}
                ),
                onEcoObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EconomicsObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EconomicsObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EconomicsObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(EconomicsObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(EconomicsObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(EconomicsObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(EconomicsObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(EconomicsObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(EconomicsObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(EconomicsObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(EconomicsObjYear.Obj2022.route)}
                ),
                onCivEduObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CivicEduObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(CivicEduObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(CivicEduObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(CivicEduObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(CivicEduObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(CivicEduObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(CivicEduObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(CivicEduObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(CivicEduObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(CivicEduObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(CivicEduObjYear.Obj2022.route)}
                ),
                onBioObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(BiologyObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(BiologyObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(BiologyObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(BiologyObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(BiologyObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(BiologyObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(BiologyObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(BiologyObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(BiologyObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(BiologyObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(BiologyObjYear.Obj2022.route)}
                ),
                onCommObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CommerceObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(CommerceObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(CommerceObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(CommerceObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(CommerceObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(CommerceObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(CommerceObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(CommerceObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(CommerceObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(CommerceObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(CommerceObjYear.Obj2022.route)}
                ),
                onAcctObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AccountObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(AccountObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(AccountObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(AccountObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(AccountObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(AccountObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(AccountObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(AccountObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(AccountObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(AccountObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(AccountObjYear.Obj2022.route)}
                ),
                onPhyObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(PhysicsObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(PhysicsObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(PhysicsObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(PhysicsObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(PhysicsObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(PhysicsObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(PhysicsObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(PhysicsObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(PhysicsObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(PhysicsObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(PhysicsObjYear.Obj2022.route)}
                ),
                onAgricObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AgricultureObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(AgricultureObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(AgricultureObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(AgricultureObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(AgricultureObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(AgricultureObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(AgricultureObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(AgricultureObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(AgricultureObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(AgricultureObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(AgricultureObjYear.Obj2022.route)}
                ),
                onLiteratureObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(LiteratureObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(LiteratureObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(LiteratureObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(LiteratureObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(LiteratureObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(LiteratureObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(LiteratureObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(LiteratureObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(LiteratureObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(LiteratureObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(LiteratureObjYear.Obj2022.route)}
                ),
                onChemistryObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(ChemistryObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(ChemistryObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(ChemistryObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(ChemistryObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(ChemistryObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(ChemistryObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(ChemistryObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(ChemistryObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(ChemistryObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(ChemistryObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(ChemistryObjYear.Obj2022.route)}
                ),
                onGovernmentObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(GovernmentObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(GovernmentObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(GovernmentObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(GovernmentObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(GovernmentObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(GovernmentObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(GovernmentObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(GovernmentObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(GovernmentObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(GovernmentObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(GovernmentObjYear.Obj2022.route)}
                ),
                onMarketingObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MarketingObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(MarketingObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(MarketingObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(MarketingObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(MarketingObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(MarketingObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(MarketingObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(MarketingObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(MarketingObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(MarketingObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(MarketingObjYear.Obj2022.route)}
                ),

                onEngTheoryYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EnglishTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EnglishTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EnglishTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EnglishTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EnglishTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EnglishTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EnglishTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EnglishTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EnglishTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EnglishTheoryYear.Theory2022.route)}
                ),

                onMathTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(MathTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(MathTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(MathTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(MathTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(MathTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(MathTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(MathTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(MathTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(MathTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(MathTheoryYear.Theory2022.route)}
                ),
                onEcoTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EconomicsTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EconomicsTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EconomicsTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EconomicsTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EconomicsTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EconomicsTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EconomicsTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EconomicsTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EconomicsTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EconomicsTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EconomicsTheoryYear.Theory2022.route)}
                ),
                onCivEduTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CivicEduTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(CivicEduTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(CivicEduTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(CivicEduTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(CivicEduTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(CivicEduTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(CivicEduTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(CivicEduTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(CivicEduTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(CivicEduTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(CivicEduTheoryYear.Theory2022.route)}
                ),
                onBioTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(BiologyTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(BiologyTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(BiologyTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(BiologyTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(BiologyTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(BiologyTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(BiologyTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(BiologyTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(BiologyTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(BiologyTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(BiologyTheoryYear.Theory2022.route)}
                ),
                onCommTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CommerceTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(CommerceTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(CommerceTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(CommerceTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(CommerceTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(CommerceTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(CommerceTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(CommerceTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(CommerceTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(CommerceTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(CommerceTheoryYear.Theory2022.route)}
                ),
                onAcctTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AccountTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(AccountTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(AccountTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(AccountTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(AccountTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(AccountTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(AccountTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(AccountTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(AccountTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(AccountTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(AccountTheoryYear.Theory2022.route)}
                ),
                onPhyTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(PhysicsTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(PhysicsTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(PhysicsTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(PhysicsTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(PhysicsTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(PhysicsTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(PhysicsTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(PhysicsTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(PhysicsTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(PhysicsTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(PhysicsTheoryYear.Theory2022.route)}
                ),
                onAgricTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AgricultureTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(AgricultureTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(AgricultureTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(AgricultureTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(AgricultureTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(AgricultureTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(AgricultureTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(AgricultureTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(AgricultureTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(AgricultureTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(AgricultureTheoryYear.Theory2022.route)}
                ),
                onLiteratureTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(LiteratureTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(LiteratureTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(LiteratureTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(LiteratureTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(LiteratureTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(LiteratureTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(LiteratureTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(LiteratureTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(LiteratureTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(LiteratureTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(LiteratureTheoryYear.Theory2022.route)}
                ),
                onChemistryTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(ChemistryTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(ChemistryTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(ChemistryTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(ChemistryTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(ChemistryTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(ChemistryTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(ChemistryTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(ChemistryTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(ChemistryTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(ChemistryTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(ChemistryTheoryYear.Theory2022.route)}
                ),
                onGovernmentTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(GovernmentTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(GovernmentTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(GovernmentTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(GovernmentTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(GovernmentTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(GovernmentTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(GovernmentTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(GovernmentTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(GovernmentTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(GovernmentTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(GovernmentTheoryYear.Theory2022.route)}
                ),
                onMarketingTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MarketingTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(MarketingTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(MarketingTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(MarketingTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(MarketingTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(MarketingTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(MarketingTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(MarketingTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(MarketingTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(MarketingTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(MarketingTheoryYear.Theory2022.route)}
                ),

            )
        }

        composable(
            route = Screen.TestTopic.route
        ){

        }

        composable(
            route = Screen.TestYear.route
        ){
            StudyAndTestYearList(
                onBackArrowClick = { navController.popBackStack() },
                onBackHandlerClick = {navController.popBackStack()},
                onEngObjYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EnglishObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EnglishObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(EnglishObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(EnglishObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(EnglishObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(EnglishObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(EnglishObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(EnglishObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(EnglishObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(EnglishObjYear.Obj2022.route)}
                ),
                onMathObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(MathObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(MathObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(MathObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(MathObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(MathObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(MathObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(MathObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(MathObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(MathObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(MathObjYear.Obj2022.route)}
                ),
                onEcoObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EconomicsObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EconomicsObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EconomicsObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(EconomicsObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(EconomicsObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(EconomicsObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(EconomicsObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(EconomicsObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(EconomicsObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(EconomicsObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(EconomicsObjYear.Obj2022.route)}
                ),
                onCivEduObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CivicEduObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(CivicEduObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(CivicEduObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(CivicEduObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(CivicEduObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(CivicEduObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(CivicEduObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(CivicEduObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(CivicEduObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(CivicEduObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(CivicEduObjYear.Obj2022.route)}
                ),
                onBioObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(BiologyObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(BiologyObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(BiologyObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(BiologyObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(BiologyObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(BiologyObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(BiologyObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(BiologyObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(BiologyObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(BiologyObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(BiologyObjYear.Obj2022.route)}
                ),
                onCommObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CommerceObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(CommerceObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(CommerceObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(CommerceObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(CommerceObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(CommerceObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(CommerceObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(CommerceObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(CommerceObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(CommerceObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(CommerceObjYear.Obj2022.route)}
                ),
                onAcctObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AccountObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(AccountObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(AccountObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(AccountObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(AccountObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(AccountObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(AccountObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(AccountObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(AccountObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(AccountObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(AccountObjYear.Obj2022.route)}
                ),
                onPhyObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(PhysicsObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(PhysicsObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(PhysicsObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(PhysicsObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(PhysicsObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(PhysicsObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(PhysicsObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(PhysicsObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(PhysicsObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(PhysicsObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(PhysicsObjYear.Obj2022.route)}
                ),
                onAgricObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AgricultureObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(AgricultureObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(AgricultureObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(AgricultureObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(AgricultureObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(AgricultureObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(AgricultureObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(AgricultureObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(AgricultureObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(AgricultureObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(AgricultureObjYear.Obj2022.route)}
                ),
                onLiteratureObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(LiteratureObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(LiteratureObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(LiteratureObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(LiteratureObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(LiteratureObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(LiteratureObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(LiteratureObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(LiteratureObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(LiteratureObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(LiteratureObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(LiteratureObjYear.Obj2022.route)}
                ),
                onChemistryObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(ChemistryObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(ChemistryObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(ChemistryObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(ChemistryObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(ChemistryObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(ChemistryObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(ChemistryObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(ChemistryObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(ChemistryObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(ChemistryObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(ChemistryObjYear.Obj2022.route)}
                ),
                onGovernmentObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(GovernmentObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(GovernmentObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(GovernmentObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(GovernmentObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(GovernmentObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(GovernmentObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(GovernmentObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(GovernmentObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(GovernmentObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(GovernmentObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(GovernmentObjYear.Obj2022.route)}
                ),
                onMarketingObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MarketingObjYear.Obj2012.route)},
                    on2013Click = {navController.navigate(MarketingObjYear.Obj2013.route)},
                    on2014Click = {navController.navigate(MarketingObjYear.Obj2014.route)},
                    on2015Click = {navController.navigate(MarketingObjYear.Obj2015.route)},
                    on2016Click = {navController.navigate(MarketingObjYear.Obj2016.route)},
                    on2017Click = {navController.navigate(MarketingObjYear.Obj2017.route)},
                    on2018Click = {navController.navigate(MarketingObjYear.Obj2018.route)},
                    on2019Click = {navController.navigate(MarketingObjYear.Obj2019.route)},
                    on2020Click = {navController.navigate(MarketingObjYear.Obj2020.route)},
                    on2021Click = {navController.navigate(MarketingObjYear.Obj2021.route)},
                    on2022Click = {navController.navigate(MarketingObjYear.Obj2022.route)}
                ),

                onEngTheoryYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EnglishTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EnglishTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EnglishTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EnglishTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EnglishTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EnglishTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EnglishTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EnglishTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EnglishTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EnglishTheoryYear.Theory2022.route)}
                ),

                onMathTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(MathTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(MathTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(MathTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(MathTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(MathTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(MathTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(MathTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(MathTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(MathTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(MathTheoryYear.Theory2022.route)}
                ),
                onEcoTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EconomicsTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EconomicsTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EconomicsTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EconomicsTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EconomicsTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EconomicsTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EconomicsTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EconomicsTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EconomicsTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EconomicsTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EconomicsTheoryYear.Theory2022.route)}
                ),
                onCivEduTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CivicEduTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(CivicEduTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(CivicEduTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(CivicEduTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(CivicEduTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(CivicEduTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(CivicEduTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(CivicEduTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(CivicEduTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(CivicEduTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(CivicEduTheoryYear.Theory2022.route)}
                ),
                onBioTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(BiologyTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(BiologyTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(BiologyTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(BiologyTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(BiologyTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(BiologyTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(BiologyTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(BiologyTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(BiologyTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(BiologyTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(BiologyTheoryYear.Theory2022.route)}
                ),
                onCommTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(CommerceTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(CommerceTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(CommerceTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(CommerceTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(CommerceTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(CommerceTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(CommerceTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(CommerceTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(CommerceTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(CommerceTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(CommerceTheoryYear.Theory2022.route)}
                ),
                onAcctTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AccountTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(AccountTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(AccountTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(AccountTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(AccountTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(AccountTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(AccountTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(AccountTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(AccountTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(AccountTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(AccountTheoryYear.Theory2022.route)}
                ),
                onPhyTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(PhysicsTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(PhysicsTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(PhysicsTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(PhysicsTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(PhysicsTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(PhysicsTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(PhysicsTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(PhysicsTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(PhysicsTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(PhysicsTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(PhysicsTheoryYear.Theory2022.route)}
                ),
                onAgricTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(AgricultureTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(AgricultureTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(AgricultureTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(AgricultureTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(AgricultureTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(AgricultureTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(AgricultureTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(AgricultureTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(AgricultureTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(AgricultureTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(AgricultureTheoryYear.Theory2022.route)}
                ),
                onLiteratureTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(LiteratureTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(LiteratureTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(LiteratureTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(LiteratureTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(LiteratureTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(LiteratureTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(LiteratureTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(LiteratureTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(LiteratureTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(LiteratureTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(LiteratureTheoryYear.Theory2022.route)}
                ),
                onChemistryTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(ChemistryTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(ChemistryTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(ChemistryTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(ChemistryTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(ChemistryTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(ChemistryTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(ChemistryTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(ChemistryTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(ChemistryTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(ChemistryTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(ChemistryTheoryYear.Theory2022.route)}
                ),
                onGovernmentTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(GovernmentTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(GovernmentTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(GovernmentTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(GovernmentTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(GovernmentTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(GovernmentTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(GovernmentTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(GovernmentTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(GovernmentTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(GovernmentTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(GovernmentTheoryYear.Theory2022.route)}
                ),
                onMarketingTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MarketingTheoryYear.Theory2012.route)},
                    on2013Click = {navController.navigate(MarketingTheoryYear.Theory2013.route)},
                    on2014Click = {navController.navigate(MarketingTheoryYear.Theory2014.route)},
                    on2015Click = {navController.navigate(MarketingTheoryYear.Theory2015.route)},
                    on2016Click = {navController.navigate(MarketingTheoryYear.Theory2016.route)},
                    on2017Click = {navController.navigate(MarketingTheoryYear.Theory2017.route)},
                    on2018Click = {navController.navigate(MarketingTheoryYear.Theory2018.route)},
                    on2019Click = {navController.navigate(MarketingTheoryYear.Theory2019.route)},
                    on2020Click = {navController.navigate(MarketingTheoryYear.Theory2020.route)},
                    on2021Click = {navController.navigate(MarketingTheoryYear.Theory2021.route)},
                    on2022Click = {navController.navigate(MarketingTheoryYear.Theory2022.route)}
                ),

                )
        }

        composable(
            route = Screen.Literature.route
        ){
            Literatures()
        }

        composable(
            route = Screen.SaveQuestion.route
        ){
            SaveQuestion()
        }

        composable(
            route = Screen.Activation.route
        ){
            GetActivationCode()
        }


    }

}
