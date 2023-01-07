package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2012.Commerce2012Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2013.Commerce2013Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2014.Commerce2014Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2015.Commerce2015Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2016.Commerce2016Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2017.Commerce2017Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2018.Commerce2018Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2019.Commerce2019Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2020.Commerce2020Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2021.Commerce2021Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2022.Commerce2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE


fun NavGraphBuilder.commerceObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = CommerceObjYear.Obj2012.route,
        route = COMMERCE_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = CommerceObjYear.Obj2012.route
        ) {

            Commerce2012Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2013.route
        ) {
            Commerce2013Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2014.route
        ) {
            Commerce2014Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2015.route
        ) {
            Commerce2015Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2016.route
        ) {
            Commerce2016Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2017.route
        ) {
            Commerce2017Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2018.route
        ) {
            Commerce2018Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2019.route
        ) {
            Commerce2019Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2020.route
        ) {
            Commerce2020Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = CommerceObjYear.Obj2021.route
        ) {
            Commerce2021Obj()
        }

        composable(
            route = CommerceObjYear.Obj2022.route
        ) {
            Commerce2022Obj()
        }
    }
}