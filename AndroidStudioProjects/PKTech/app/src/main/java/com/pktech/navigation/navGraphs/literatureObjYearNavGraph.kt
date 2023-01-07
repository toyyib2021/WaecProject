package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2012.Lit2012Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2013.Lit2013Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2014.Lit2014Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2015.Lit2015Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2016.Lit2016Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2017.Lit2017Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2018.Lit2018Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2019.Lit2019Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2020.Lit2020Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2021.Lit2021Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2022.Lit2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.LITERATURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.literatureObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = LiteratureObjYear.Obj2012.route,
        route = LITERATURE_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = LiteratureObjYear.Obj2012.route
        ) {
            Lit2012Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2013.route
        ) {
            Lit2013Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2014.route
        ) {
            Lit2014Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2015.route
        ) {
            Lit2015Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2016.route
        ) {
            Lit2016Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2017.route
        ) {
            Lit2017Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2018.route
        ) {
            Lit2018Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2019.route
        ) {
            Lit2019Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2020.route
        ) {
            Lit2020Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = LiteratureObjYear.Obj2021.route
        ) {
            Lit2021Obj()
        }

        composable(
            route = LiteratureObjYear.Obj2022.route
        ) {
            Lit2022Obj()
        }
    }
}