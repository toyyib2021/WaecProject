package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.EconomicsObjYear
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2012.Eco2012Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2013.Eco2013Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2014.Eco2014Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2015.Eco2015Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2016.Eco2016Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2017.Eco2017Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2018.Eco2018Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2019.Eco2019Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2020.Eco2020Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2021.Eco2021Obj
import com.pktech.presentation.screens.subjects.economics.year.eco2022.Eco2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.ECONOMICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.economicsObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = EconomicsObjYear.Obj2012.route,
        route = ECONOMICS_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = EconomicsObjYear.Obj2012.route
        ) {
            Eco2012Obj(onYesClickTest = {}, onYesClickStudy = {})

        }

        composable(
            route = EconomicsObjYear.Obj2013.route
        ) {
            Eco2013Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2014.route
        ) {
            Eco2014Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2015.route
        ) {
            Eco2015Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2016.route
        ) {
            Eco2016Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2017.route
        ) {
            Eco2017Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2018.route
        ) {
            Eco2018Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2019.route
        ) {
            Eco2019Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2020.route
        ) {
            Eco2020Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2021.route
        ) {
            Eco2021Obj()
        }

        composable(
            route = EconomicsObjYear.Obj2022.route
        ) {
            Eco2022Obj()
        }
    }
}