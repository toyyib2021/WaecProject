package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AgricultureObjYear
import com.pktech.navigation.screens.BiologyObjYear
import com.pktech.navigation.screens.CivicEduObjYear
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2012.Bio2012Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2013.Bio2013Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2014.Bio2014Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2014.Biology2014Theory
import com.pktech.presentation.screens.subjects.biology.year.bio2015.Bio2015Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2016.Bio2016Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2017.Bio2017Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2018.Bio2018Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2019.Bio2019Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2020.Bio2020Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2021.Bio2021Obj
import com.pktech.presentation.screens.subjects.biology.year.bio2022.Bio2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE


fun NavGraphBuilder.biologyObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = BiologyObjYear.Obj2012.route,
        route = BIOLOGY_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = BiologyObjYear.Obj2012.route
        ) {
            Bio2012Obj(
                onYesClickTest = {},
                onYesClickStudy = {}
            )

        }

        composable(
            route = BiologyObjYear.Obj2013.route
        ) {
            Bio2013Obj()
        }

        composable(
            route = BiologyObjYear.Obj2014.route
        ) {
            Bio2014Obj()
        }

        composable(
            route = BiologyObjYear.Obj2015.route
        ) {
            Bio2015Obj()
        }

        composable(
            route = BiologyObjYear.Obj2016.route
        ) {
            Bio2016Obj()

        }

        composable(
            route = BiologyObjYear.Obj2017.route
        ) {
            Bio2017Obj()
        }

        composable(
            route = BiologyObjYear.Obj2018.route
        ) {
            Bio2018Obj()

        }

        composable(
            route = BiologyObjYear.Obj2019.route
        ) {
            Bio2019Obj()

        }

        composable(
            route = BiologyObjYear.Obj2020.route
        ) {
            Bio2020Obj()
        }

        composable(
            route = BiologyObjYear.Obj2021.route
        ) {
            Bio2021Obj()
        }

        composable(
            route = BiologyObjYear.Obj2022.route
        ) {
            Bio2022Obj()
        }
    }
}