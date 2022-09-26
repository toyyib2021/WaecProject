package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants.ENGLISH_STUDY_YEAR_ROUTE
import com.pktech.navigation.screens.EnglishStudyYear
import com.pktech.presentation.screens.subjects.eng.year.eng2012.Eng2012ObjStudy
import com.pktech.presentation.screens.subjects.eng.year.eng2012.Eng2012ThyStudy

fun NavGraphBuilder.englishStudyYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = EnglishStudyYear.Obj2012.route,
        route = ENGLISH_STUDY_YEAR_ROUTE
    ) {
        composable(
            route = EnglishStudyYear.Obj2012.route
        ) {
            Eng2012ObjStudy()
        }
        composable(
            route = EnglishStudyYear.Theory2012.route
        ) {
            Eng2012ThyStudy()
        }
    }
}