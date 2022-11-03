package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.CivicEduTheoryYear

import com.pktech.presentation.screens.subjects.civilEdu.year.civil2014.Civic2014Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2015.Civic2015Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2016.Civic2016Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2017.Civic2017Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2018.Civic2018Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2019.Civic2019Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2020.Civic2020Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2021.Civic2021Theory
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2022.Civic2022Theory
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE


fun NavGraphBuilder.civicTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = CivicEduTheoryYear.Theory2012.route,
        route = CIVIC_THEORY_YEAR_ROUTE
    ) {

        composable(
            route = CivicEduTheoryYear.Theory2014.route
        ) {
            Civic2014Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2015.route
        ) {
            Civic2015Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2016.route
        ) {
            Civic2016Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2017.route
        ) {
            Civic2017Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2018.route
        ) {
            Civic2018Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2019.route
        ) {
            Civic2019Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2020.route
        ) {
            Civic2020Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2021.route
        ) {
            Civic2021Theory()
        }

        composable(
            route = CivicEduTheoryYear.Theory2022.route
        ) {
            Civic2022Theory()
        }


    }
}