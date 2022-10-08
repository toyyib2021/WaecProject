package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2012.Chemistry2012Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2013.Chemistry2013Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2014.Chemistry2014Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2015.Chemistry2015Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2016.Chemistry2016Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2017.Chemistry2017Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2018.Chemistry2018Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2019.Chemistry2019Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2020.Chemistry2020Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2021.Chemistry2021Theory
import com.pktech.presentation.screens.subjects.chemistry.year.chy2022.Chemistry2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CHEMISTRY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.chemistryTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = ChemistryTheoryYear.Theory2012.route,
        route = CHEMISTRY_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = ChemistryTheoryYear.Theory2012.route
        ) {
            Chemistry2012Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2013.route
        ) {
            Chemistry2013Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2014.route
        ) {
            Chemistry2014Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2015.route
        ) {
            Chemistry2015Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2016.route
        ) {
            Chemistry2016Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2017.route
        ) {
            Chemistry2017Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2018.route
        ) {
            Chemistry2018Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2019.route
        ) {
            Chemistry2019Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2020.route
        ) {
            Chemistry2020Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2021.route
        ) {
            Chemistry2021Theory()
        }

        composable(
            route = ChemistryTheoryYear.Theory2022.route
        ) {
            Chemistry2022Theory()
        }


    }
}