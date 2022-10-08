package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2012.Govt2012Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2013.Govt2013Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2014.Govt2014Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2015.Govt2015Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2016.Govt2016Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2017.Govt2017Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2018.Govt2018Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2019.Govt2019Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2020.Govt2020Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2021.Govt2021Theory
import com.pktech.presentation.screens.subjects.govt.year.govt2022.Govt2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.GOVERNMENT_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.governmentTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = GovernmentTheoryYear.Theory2012.route,
        route = GOVERNMENT_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = GovernmentTheoryYear.Theory2012.route
        ) {

            Govt2012Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2013.route
        ) {

            Govt2013Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2014.route
        ) {
            Govt2014Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2015.route
        ) {
            Govt2015Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2016.route
        ) {
            Govt2016Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2017.route
        ) {
            Govt2017Theory()

        }

        composable(
            route = GovernmentTheoryYear.Theory2018.route
        ) {
            Govt2018Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2019.route
        ) {
            Govt2019Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2020.route
        ) {
            Govt2020Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2021.route
        ) {
            Govt2021Theory()
        }

        composable(
            route = GovernmentTheoryYear.Theory2022.route
        ) {
            Govt2022Theory()
        }


    }
}