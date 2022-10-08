package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.AgricultureTheoryYear
import com.pktech.navigation.screens.BiologyTheoryYear
import com.pktech.navigation.screens.CivicEduTheoryYear
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2012.Biology2012Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2013.Biology2013Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2014.Biology2014Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2015.Biology2015Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2016.Biology2016Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2017.Biology2017Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2018.Biology2018Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2019.Biology2019Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2020.Biology2020Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2021.Biology2021Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2022.Biology2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE


fun NavGraphBuilder.biologyTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = BiologyTheoryYear.Theory2012.route,
        route = BIOLOGY_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = BiologyTheoryYear.Theory2012.route
        ) {
            Biology2012Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2013.route
        ) {
            Biology2013Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2014.route
        ) {
            Biology2014Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2015.route
        ) {
            Biology2015Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2016.route
        ) {
            Biology2016Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2017.route
        ) {
            Biology2017Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2018.route
        ) {
            Biology2018Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2019.route
        ) {
            Biology2019Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2020.route
        ) {
            Biology2020Theory()
        }

        composable(
            route = BiologyTheoryYear.Theory2021.route
        ) {
            Biology2021Theory()

        }

        composable(
            route = BiologyTheoryYear.Theory2022.route
        ) {
            Biology2022Theory()

        }


    }
}