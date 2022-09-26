package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants
import com.pktech.navigation.screens.MathTestyYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012ObjStudy
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012TheoryTest


fun NavGraphBuilder.mathTestYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = MathTestyYear.Obj2012.route,
        route = Constants.MATH_TEST_YEAR_ROUTE
    ) {
        composable(
            route = MathTestyYear.Obj2012.route
        ) {
            Math2012ObjStudy(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.TestYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route)}
            )
        }
        composable(
            route = MathTestyYear.Theory2012.route
        ) {
            Math2012TheoryTest()
        }
    }
}