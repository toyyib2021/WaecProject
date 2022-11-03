package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.CivicEduObjYear
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2014.Civic2014Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2015.Civic2015Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2016.Civic2016Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2017.Civic2017Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2018.Civic2018Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2019.Civic2019Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2020.Civic2020Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2021.Civic2021Obj
import com.pktech.presentation.screens.subjects.civilEdu.year.civil2022.Civic2022Obj
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE


fun NavGraphBuilder.civicObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = CivicEduObjYear.Obj2014.route,
        route = CIVIC_OBJ_YEAR_ROUTE
    ) {

        composable(
            route = CivicEduObjYear.Obj2014.route
        ) {
            Civic2014Obj(
                onYesClickStudy = {},
                onYesClickTest = {}
            )
        }

        composable(
            route = CivicEduObjYear.Obj2015.route
        ) {
            Civic2015Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2016.route
        ) {
            Civic2016Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2017.route
        ) {
            Civic2017Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2018.route
        ) {
            Civic2018Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2019.route
        ) {
            Civic2019Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2020.route
        ) {
            Civic2020Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2021.route
        ) {
            Civic2021Obj()
        }

        composable(
            route = CivicEduObjYear.Obj2022.route
        ) {
            Civic2022Obj()
        }
    }
}