package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants.ENGLISH_TEST_YEAR_ROUTE
import com.pktech.navigation.screens.EnglishTestYear
import com.pktech.presentation.screens.subjects.eng.year.eng2012.Eng2012ObjTest
import com.pktech.presentation.screens.subjects.eng.year.eng2012.Eng2012ThyTest

fun NavGraphBuilder.englishTestYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = EnglishTestYear.Obj2012.route,
        route = ENGLISH_TEST_YEAR_ROUTE
    ) {
        composable(
            route = EnglishTestYear.Obj2012.route
        ) {
            Eng2012ObjTest()
        }
        composable(
            route = EnglishTestYear.Theory2012.route
        ) {
            Eng2012ThyTest()
        }
    }
}