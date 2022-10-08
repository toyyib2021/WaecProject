package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants
import com.pktech.navigation.screens.MathObjYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012Obj
import com.pktech.presentation.screens.subjects.maths.year.math2013.Math2013Obj
import com.pktech.presentation.screens.subjects.maths.year.math2014.Math2014Obj
import com.pktech.presentation.screens.subjects.maths.year.math2015.Math2015Obj
import com.pktech.presentation.screens.subjects.maths.year.math2016.Math2016Obj
import com.pktech.presentation.screens.subjects.maths.year.math2017.Math2017Obj
import com.pktech.presentation.screens.subjects.maths.year.math2018.Math2018Obj
import com.pktech.presentation.screens.subjects.maths.year.math2019.Math2019Obj
import com.pktech.presentation.screens.subjects.maths.year.math2020.Math2020Obj
import com.pktech.presentation.screens.subjects.maths.year.math2021.Math2021Obj
import com.pktech.presentation.screens.subjects.maths.year.math2022.Math2022Obj

fun NavGraphBuilder.mathObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = MathObjYear.Obj2012.route,
        route = Constants.MATH_OBJ_YEAR_ROUTE
    ) {

        composable(
            route = MathObjYear.Obj2012.route
        ) {
            Math2012Obj(
                onYesClickTest = { navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = { navController.navigate(Screen.DashBoard.route)},
            )
        }

        composable(
            route = MathObjYear.Obj2013.route
        ) {
            Math2013Obj()
        }

        composable(
            route = MathObjYear.Obj2014.route
        ) {
            Math2014Obj()
        }

        composable(
            route = MathObjYear.Obj2015.route
        ) {
            Math2015Obj()
        }

        composable(
            route = MathObjYear.Obj2016.route
        ) {
            Math2016Obj()
        }

        composable(
            route = MathObjYear.Obj2017.route
        ) {
            Math2017Obj()
        }

        composable(
            route = MathObjYear.Obj2018.route
        ) {
            Math2018Obj()
        }

        composable(
            route = MathObjYear.Obj2019.route
        ) {
            Math2019Obj()
        }

        composable(
            route = MathObjYear.Obj2020.route
        ) {
            Math2020Obj()
        }

        composable(
            route = MathObjYear.Obj2021.route
        ) {
            Math2021Obj()
        }

        composable(
            route = MathObjYear.Obj2022.route
        ) {
            Math2022Obj()
        }


    }
}