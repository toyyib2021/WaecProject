package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2012.Phy2012Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2013.Phy2013Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2014.Phy2014Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2015.Phy2015Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2016.Phy2016Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2017.Phy2017Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2018.Phy2018Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2019.Phy2019Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2020.Phy2020Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2021.Phy2021Theory
import com.pktech.presentation.screens.subjects.physics.year.phy2022.Phy2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.physicsTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = PhysicsTheoryYear.Theory2012.route,
        route = PHYSICS_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = PhysicsTheoryYear.Theory2012.route
        ) {
            Phy2012Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2013.route
        ) {
            Phy2013Theory()

        }

        composable(
            route = PhysicsTheoryYear.Theory2014.route
        ) {
            Phy2014Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2015.route
        ) {
            Phy2015Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2016.route
        ) {
            Phy2016Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2017.route
        ) {
            Phy2017Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2018.route
        ) {
            Phy2018Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2019.route
        ) {
            Phy2019Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2020.route
        ) {
            Phy2020Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2021.route
        ) {
            Phy2021Theory()
        }

        composable(
            route = PhysicsTheoryYear.Theory2022.route
        ) {
            Phy2022Theory()

        }


    }
}