package com.pktech.navigation.navGraphs

import Eng2012Obj
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants.ENGLISH_OBJ_YEAR_ROUTE
import com.pktech.navigation.screens.EnglishObjYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.eng.year.eng2013.Eng2013Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2014.Eng2014Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2015.Eng2015Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2016.Eng2016Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2017.Eng2017Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2018.Eng2018Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2019.Eng2019Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2020.Eng2020Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2021.Eng2021Obj
import com.pktech.presentation.screens.subjects.eng.year.eng2022.Eng2022Obj

fun NavGraphBuilder.englishObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = EnglishObjYear.Obj2012.route,
        route = ENGLISH_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = EnglishObjYear.Obj2012.route
        ) {
            Eng2012Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},

            )
        }

        composable(
            route = EnglishObjYear.Obj2013.route
        ) {
            Eng2013Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2014.route
        ) {
            Eng2014Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2015.route
        ) {
            Eng2015Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2016.route
        ) {
            Eng2016Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2017.route
        ) {
            Eng2017Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2018.route
        ) {
            Eng2018Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2019.route
        ) {
            Eng2019Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2020.route
        ) {
            Eng2020Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = EnglishObjYear.Obj2021.route
        ) {
            Eng2021Obj()
        }

        composable(
            route = EnglishObjYear.Obj2022.route
        ) {
            Eng2022Obj()
        }



    }
}