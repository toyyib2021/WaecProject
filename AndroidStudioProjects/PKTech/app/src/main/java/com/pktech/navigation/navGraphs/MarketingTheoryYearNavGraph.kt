package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2012.Mar2012Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2013.Mar2013Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2014.Mar2014Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2015.Mar2015Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2016.Mar2016Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2017.Mar2017Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2018.Mar2018Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2019.Mar2019Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2020.Mar2020Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2021.Mar2021Theory
import com.pktech.presentation.screens.subjects.marketing.year.mar2022.Mar2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CHEMISTRY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.MARKETING_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.marketingTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = MarketingTheoryYear.Theory2012.route,
        route = MARKETING_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = MarketingTheoryYear.Theory2012.route
        ) {

            Mar2012Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2013.route
        ) {
            Mar2013Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2014.route
        ) {
            Mar2014Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2015.route
        ) {
            Mar2015Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2016.route
        ) {
            Mar2016Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2017.route
        ) {
            Mar2017Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2018.route
        ) {
            Mar2018Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2019.route
        ) {
            Mar2019Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2020.route
        ) {
            Mar2020Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2021.route
        ) {
            Mar2021Theory()
        }

        composable(
            route = MarketingTheoryYear.Theory2022.route
        ) {
            Mar2022Theory()
        }


    }
}