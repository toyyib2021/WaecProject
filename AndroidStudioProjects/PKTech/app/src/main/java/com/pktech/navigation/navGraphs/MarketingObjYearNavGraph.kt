package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2012.Mar2012Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2013.Mar2013Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2014.Mar2014Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2015.Mar2015Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2016.Mar2016Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2017.Mar2017Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2018.Mar2018Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2019.Mar2019Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2020.Mar2020Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2021.Mar2021Obj
import com.pktech.presentation.screens.subjects.marketing.year.mar2022.Mar2022Obj
import com.pktech.presentation.screens.subjects.maths.year.math2013.Math2013Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.MARKETING_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.marketingObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = MarketingObjYear.Obj2012.route,
        route = MARKETING_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = MarketingObjYear.Obj2012.route
        ) {
            Mar2012Obj()
        }

        composable(
            route = MarketingObjYear.Obj2013.route
        ) {
            Mar2013Obj()
        }

        composable(
            route = MarketingObjYear.Obj2014.route
        ) {
            Mar2014Obj()
        }

        composable(
            route = MarketingObjYear.Obj2015.route
        ) {
            Mar2015Obj()
        }

        composable(
            route = MarketingObjYear.Obj2016.route
        ) {
            Mar2016Obj()
        }

        composable(
            route = MarketingObjYear.Obj2017.route
        ) {
            Mar2017Obj()
        }

        composable(
            route = MarketingObjYear.Obj2018.route
        ) {
            Mar2018Obj()
        }

        composable(
            route = MarketingObjYear.Obj2019.route
        ) {
            Mar2019Obj()
        }

        composable(
            route = MarketingObjYear.Obj2020.route
        ) {
            Mar2020Obj()
        }

        composable(
            route = MarketingObjYear.Obj2021.route
        ) {
            Mar2021Obj()
        }

        composable(
            route = MarketingObjYear.Obj2022.route
        ) {
            Mar2022Obj()
        }
    }
}