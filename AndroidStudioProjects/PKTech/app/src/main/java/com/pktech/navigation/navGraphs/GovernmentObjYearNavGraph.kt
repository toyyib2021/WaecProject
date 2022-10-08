package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2012.Govt2012Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2013.Govt2013Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2014.Govt2014Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2015.Govt2015Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2016.Govt2016Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2017.Govt2017Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2018.Govt2018Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2019.Govt2019Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2020.Govt2020Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2021.Govt2021Obj
import com.pktech.presentation.screens.subjects.govt.year.govt2022.Govt2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.GOVERNMENT_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.governmentObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = GovernmentObjYear.Obj2012.route,
        route = GOVERNMENT_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = GovernmentObjYear.Obj2012.route
        ) {
            Govt2012Obj()

        }

        composable(
            route = GovernmentObjYear.Obj2013.route
        ) {
            Govt2013Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2014.route
        ) {
            Govt2014Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2015.route
        ) {
            Govt2015Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2016.route
        ) {
            Govt2016Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2017.route
        ) {
            Govt2017Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2018.route
        ) {
            Govt2018Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2019.route
        ) {
            Govt2019Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2020.route
        ) {
            Govt2020Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2021.route
        ) {
            Govt2021Obj()
        }

        composable(
            route = GovernmentObjYear.Obj2022.route
        ) {
            Govt2022Obj()
        }
    }
}