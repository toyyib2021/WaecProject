package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2012.Chy2012Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2013.Chy2013Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2014.Chy2014Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2015.Chy2015Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2016.Chy2016Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2017.Chy2017Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2018.Chy2018Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2019.Chy2019Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2020.Chy2020Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2021.Chy2021Obj
import com.pktech.presentation.screens.subjects.chemistry.year.chy2022.Chy2022Obj
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CHEMISTRY_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.COMMERCE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_OBJ_YEAR_ROUTE


fun NavGraphBuilder.chemistryObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = ChemistryObjYear.Obj2012.route,
        route = CHEMISTRY_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = ChemistryObjYear.Obj2012.route
        ) {
            Chy2012Obj(
                onYesClickStudy = {},
                onYesClickTest = {}
            )
        }

        composable(
            route = ChemistryObjYear.Obj2013.route
        ) {
            Chy2013Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2014.route
        ) {
            Chy2014Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2015.route
        ) {
            Chy2015Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2016.route
        ) {
            Chy2016Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2017.route
        ) {
            Chy2017Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2018.route
        ) {
            Chy2018Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2019.route
        ) {
            Chy2019Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2020.route
        ) {
            Chy2020Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2021.route
        ) {
            Chy2021Obj()
        }

        composable(
            route = ChemistryObjYear.Obj2022.route
        ) {
            Chy2022Obj()
        }
    }
}