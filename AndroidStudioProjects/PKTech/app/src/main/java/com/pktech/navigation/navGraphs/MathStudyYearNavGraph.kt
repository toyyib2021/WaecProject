package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants
import com.pktech.navigation.screens.MathStudyYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012ObjStudy
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012TheoryStudy

fun NavGraphBuilder.mathStudyYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = MathStudyYear.Obj2012.route,
        route = Constants.MATH_STUDY_YEAR_ROUTE
    ) {
        composable(
            route = MathStudyYear.Obj2012.route
        ) {
            Math2012ObjStudy(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route)}
            )
        }
        composable(
            route = MathStudyYear.Theory2012.route
        ) {
            Math2012TheoryStudy()
        }
    }
}