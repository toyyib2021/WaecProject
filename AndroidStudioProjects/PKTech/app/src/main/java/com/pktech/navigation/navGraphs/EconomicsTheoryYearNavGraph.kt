package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.AgricultureTheoryYear
import com.pktech.navigation.screens.EconomicsTheoryYear
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2012.Eco2012Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2013.Eco2013Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2014.Eco2014Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2015.Eco2015Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2016.Eco2016Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2017.Eco2017Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2018.Eco2018Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2019.Eco2019Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2020.Eco2020Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2021.Eco2021Theory
import com.pktech.presentation.screens.subjects.economics.year.eco2022.Eco2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.ECONOMICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.economicsTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = EconomicsTheoryYear.Theory2012.route,
        route =ECONOMICS_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = EconomicsTheoryYear.Theory2012.route
        ) {
            Eco2012Theory()

        }

        composable(
            route = EconomicsTheoryYear.Theory2013.route
        ) {
            Eco2013Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2014.route
        ) {
            Eco2014Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2015.route
        ) {
            Eco2015Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2016.route
        ) {
            Eco2016Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2017.route
        ) {
            Eco2017Theory()

        }

        composable(
            route = EconomicsTheoryYear.Theory2018.route
        ) {
            Eco2018Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2019.route
        ) {
            Eco2019Theory()

        }

        composable(
            route = EconomicsTheoryYear.Theory2020.route
        ) {
            Eco2020Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2021.route
        ) {
            Eco2021Theory()
        }

        composable(
            route = EconomicsTheoryYear.Theory2022.route
        ) {
            Eco2022Theory()
        }


    }
}