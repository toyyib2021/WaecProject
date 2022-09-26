package com.pktech.navigation.navGraphs

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.pktech.utill.Constants.HOME_GRAPH_ROUTE
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.activation.GetActivationCode
import com.pktech.presentation.screens.dashboard.Dashboard
import com.pktech.presentation.screens.list.StudyYear
import com.pktech.presentation.screens.list.TestYear
import com.pktech.presentation.screens.literatures.Literatures
import com.pktech.presentation.screens.saveQuestion.SaveQuestion
import com.pktech.presentation.screens.subjects.maths.uiItems.TestResult
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
            Dashboard(
                navControllerStudyTopic = { navController.navigate(Screen.StudyTopic.route) },
                navControllerStudyYear = { navController.navigate(Screen.StudyYear.route) },
                navControllerTestTopic = { navController.navigate(Screen.TestTopic.route) },
                navControllerTestYear = { navController.navigate(Screen.TestYear.route) },
                navControllerOnSaveQuestionClick = { navController.navigate(Screen.SaveQuestion.route) },
                navControllerOnLiteratureClick = { navController.navigate(Screen.Literature.route) },
            )
        }

        composable(
            route = Screen.Result.route
        ){
            TestResult()
        }

        composable(
            route = Screen.StudyTopic.route
        ){

        }

        composable(
            route = Screen.StudyYear.route,
        ){
            StudyYear(
                onBackArrowClick = {navController.navigate(Screen.DashBoard.route)},
                onEngObjYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishStudyYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EnglishStudyYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EnglishStudyYear.Obj2014.route)},
                    on2015Click = {navController.navigate(EnglishStudyYear.Obj2015.route)},
                    on2016Click = {navController.navigate(EnglishStudyYear.Obj2016.route)},
                    on2017Click = {navController.navigate(EnglishStudyYear.Obj2017.route)},
                    on2018Click = {navController.navigate(EnglishStudyYear.Obj2018.route)},
                    on2019Click = {navController.navigate(EnglishStudyYear.Obj2019.route)},
                    on2020Click = {navController.navigate(EnglishStudyYear.Obj2020.route)},
                    on2021Click = {navController.navigate(EnglishStudyYear.Obj2021.route)},
                    on2022Click = {navController.navigate(EnglishStudyYear.Obj2021.route)}
                ),
                onMathObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathStudyYear.Obj2012.route)},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onEcoObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCivEduObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onBioObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCommObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAcctObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onPhyObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAgricObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onLiteratureObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onChemistryObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onGovernmentObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onMarketingObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),

                onEngTheoryYearClick = OnYearClick(
                    on2012Click = { navController.navigate(EnglishStudyYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EnglishStudyYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EnglishStudyYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EnglishStudyYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EnglishStudyYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EnglishStudyYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EnglishStudyYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EnglishStudyYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EnglishStudyYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EnglishStudyYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EnglishStudyYear.Theory2022.route)}
                ),

                onMathTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathStudyYear.Theory2012.route)},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onEcoTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCivEduTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onBioTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCommTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAcctTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onPhyTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAgricTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onLiteratureTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onChemistryTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onGovernmentTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onMarketingTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
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
            TestYear(
                onBackArrowClick = {navController.navigate(Screen.DashBoard.route)},
                onEngObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EnglishTestYear.Obj2012.route)},
                    on2013Click = {navController.navigate(EnglishTestYear.Obj2013.route)},
                    on2014Click = {navController.navigate(EnglishTestYear.Obj2014.route)},
                    on2015Click = { navController.navigate(EnglishTestYear.Obj2015.route)},
                    on2016Click = { navController.navigate(EnglishTestYear.Obj2016.route)},
                    on2017Click = { navController.navigate(EnglishTestYear.Obj2017.route)},
                    on2018Click = { navController.navigate(EnglishTestYear.Obj2018.route)},
                    on2019Click = { navController.navigate(EnglishTestYear.Obj2019.route)},
                    on2020Click = { navController.navigate(EnglishTestYear.Obj2020.route)},
                    on2021Click = { navController.navigate(EnglishTestYear.Obj2021.route)},
                    on2022Click = { navController.navigate(EnglishTestYear.Obj2022.route)}
                ),
                onMathObjYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathTestyYear.Obj2012.route)},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onEcoObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCivEduObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onBioObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCommObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAcctObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onPhyObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAgricObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onLiteratureObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onChemistryObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onGovernmentObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onMarketingObjYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),

                onEngTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(EnglishTestYear.Theory2012.route)},
                    on2013Click = {navController.navigate(EnglishTestYear.Theory2013.route)},
                    on2014Click = {navController.navigate(EnglishTestYear.Theory2014.route)},
                    on2015Click = {navController.navigate(EnglishTestYear.Theory2015.route)},
                    on2016Click = {navController.navigate(EnglishTestYear.Theory2016.route)},
                    on2017Click = {navController.navigate(EnglishTestYear.Theory2017.route)},
                    on2018Click = {navController.navigate(EnglishTestYear.Theory2018.route)},
                    on2019Click = {navController.navigate(EnglishTestYear.Theory2019.route)},
                    on2020Click = {navController.navigate(EnglishTestYear.Theory2020.route)},
                    on2021Click = {navController.navigate(EnglishTestYear.Theory2021.route)},
                    on2022Click = {navController.navigate(EnglishTestYear.Theory2022.route)}
                ),

                onMathTheoryYearClick = OnYearClick(
                    on2012Click = {navController.navigate(MathTestyYear.Theory2012.route)},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onEcoTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCivEduTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onBioTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onCommTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAcctTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onPhyTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onAgricTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onLiteratureTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onChemistryTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onGovernmentTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
                ),
                onMarketingTheoryYearClick = OnYearClick(
                    on2012Click = {},
                    on2013Click = {},
                    on2014Click = {},
                    on2015Click = {},
                    on2016Click = {},
                    on2017Click = {},
                    on2018Click = {},
                    on2019Click = {},
                    on2020Click = {},
                    on2021Click = {},
                    on2022Click = {}
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
