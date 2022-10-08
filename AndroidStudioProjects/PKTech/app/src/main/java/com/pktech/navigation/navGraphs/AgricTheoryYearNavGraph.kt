package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.AgricultureTheoryYear
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2013.Agric2013Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2014.Agric2014Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2015.Agric2015Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2016.Agric2016Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2017.Agric2017Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2018.Agric2018Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2019.Agric2019Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2020.Agric2020Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2021.Agric2021Theory
import com.pktech.presentation.screens.subjects.agriculture.year.agric2022.Agric2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE


fun NavGraphBuilder.agricultureTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = AgricultureTheoryYear.Theory2012.route,
        route =AGRICULTURE_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = AgricultureTheoryYear.Theory2012.route
        ) {
            Agric2012Theory()

        }

        composable(
            route = AgricultureTheoryYear.Theory2013.route
        ) {
            Agric2013Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2014.route
        ) {
            Agric2014Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2015.route
        ) {
            Agric2015Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2016.route
        ) {
            Agric2016Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2017.route
        ) {
            Agric2017Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2018.route
        ) {
            Agric2018Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2019.route
        ) {
            Agric2019Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2020.route
        ) {
            Agric2020Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2021.route
        ) {
            Agric2021Theory()
        }

        composable(
            route = AgricultureTheoryYear.Theory2022.route
        ) {
            Agric2022Theory()
        }


    }
}