package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2013.Agric2013Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2014.Agric2014Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2015.Agric2015Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2016.Agric2016Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2017.Agric2017Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2018.Agric2018Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2019.Agric2019Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2020.Agric2020Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2021.Agric2021Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2022.Agric2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE


fun NavGraphBuilder.agricultureObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = AgricultureObjYear.Obj2012.route,
        route = AGRICULTURE_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = AgricultureObjYear.Obj2012.route
        ) {
            Agric2012Obj(
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
            route = AgricultureObjYear.Obj2013.route
        ) {
            Agric2013Obj(
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
            route = AgricultureObjYear.Obj2014.route
        ) {
            Agric2014Obj(
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
            route = AgricultureObjYear.Obj2015.route
        ) {
            Agric2015Obj(
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
            route = AgricultureObjYear.Obj2016.route
        ) {
            Agric2016Obj(
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
            route = AgricultureObjYear.Obj2017.route
        ) {
            Agric2017Obj(
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
            route = AgricultureObjYear.Obj2018.route
        ) {
            Agric2018Obj(
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
            route = AgricultureObjYear.Obj2019.route
        ) {
            Agric2019Obj(
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
            route = AgricultureObjYear.Obj2020.route
        ) {
            Agric2020Obj(
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
            route = AgricultureObjYear.Obj2021.route
        ) {
            Agric2021Obj()
        }

        composable(
            route = AgricultureObjYear.Obj2022.route
        ) {
            Agric2022Obj()
        }
    }
}