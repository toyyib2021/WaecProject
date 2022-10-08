package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.commerce.year.comme2012.Commerce2012Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2013.Commerce2013Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2014.Commerce2014Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2015.Commerce2015Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2016.Commerce2016Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2017.Commerce2017Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2018.Commerce2018Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2019.Commerce2019Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2020.Commerce2020Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2021.Commerce2021Theory
import com.pktech.presentation.screens.subjects.commerce.year.comme2022.Commerce2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_THEORY_YEAR_ROUTE


fun NavGraphBuilder.commerceTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = CommerceTheoryYear.Theory2012.route,
        route = COMMERCE_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = CommerceTheoryYear.Theory2012.route
        ) {
            Commerce2012Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2013.route
        ) {
            Commerce2013Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2014.route
        ) {
            Commerce2014Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2015.route
        ) {
            Commerce2015Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2016.route
        ) {
            Commerce2016Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2017.route
        ) {
            Commerce2017Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2018.route
        ) {
            Commerce2018Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2019.route
        ) {
            Commerce2019Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2020.route
        ) {
            Commerce2020Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2021.route
        ) {
            Commerce2021Theory()
        }

        composable(
            route = CommerceTheoryYear.Theory2022.route
        ) {
            Commerce2022Theory()
        }


    }
}