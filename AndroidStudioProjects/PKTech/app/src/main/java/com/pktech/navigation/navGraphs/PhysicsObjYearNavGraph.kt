package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2012.Phy2012Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2013.Phy2013Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2014.Phy2014Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2015.Phy2015Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2016.Phy2016Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2017.Phy2017Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2018.Phy2018Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2019.Phy2019Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2020.Phy2020Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2021.Phy2021Obj
import com.pktech.presentation.screens.subjects.physics.year.phy2022.Phy2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.physicsObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = PhysicsObjYear.Obj2012.route,
        route = PHYSICS_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = PhysicsObjYear.Obj2012.route
        ) {
            Phy2012Obj(onYesClickStudy = {}, onYesClickTest = {})

        }

        composable(
            route = PhysicsObjYear.Obj2013.route
        ) {
            Phy2013Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2014.route
        ) {
            Phy2014Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2015.route
        ) {
            Phy2015Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2016.route
        ) {
            Phy2016Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2017.route
        ) {
            Phy2017Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2018.route
        ) {
            Phy2018Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2019.route
        ) {
            Phy2019Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2020.route
        ) {
            Phy2020Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2021.route
        ) {
            Phy2021Obj()
        }

        composable(
            route = PhysicsObjYear.Obj2022.route
        ) {
            Phy2022Obj()
        }
    }
}