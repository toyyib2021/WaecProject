package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.subjects.agriculture.year.agric2012.Agric2012Obj
import com.pktech.presentation.screens.subjects.litineng.year.liteng2012.Lit2012Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2013.Lit2013Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2014.Lit2014Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2015.Lit2015Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2016.Lit2016Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2017.Lit2017Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2018.Lit2018Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2019.Lit2019Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2020.Lit2020Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2021.Lit2021Theory
import com.pktech.presentation.screens.subjects.litineng.year.liteng2022.Lit2022Theory
import com.pktech.utill.Constants.AGRICULTURE_OBJ_YEAR_ROUTE
import com.pktech.utill.Constants.AGRICULTURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.BIOLOGY_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.CIVIC_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.LITERATURE_THEORY_YEAR_ROUTE
import com.pktech.utill.Constants.PHYSICS_THEORY_YEAR_ROUTE


fun NavGraphBuilder.literatureTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = LiteratureTheoryYear.Theory2012.route,
        route = LITERATURE_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = LiteratureTheoryYear.Theory2012.route
        ) {
            Lit2012Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2013.route
        ) {
            Lit2013Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2014.route
        ) {
            Lit2014Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2015.route
        ) {
            Lit2015Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2016.route
        ) {
            Lit2016Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2017.route
        ) {
            Lit2017Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2018.route
        ) {
            Lit2018Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2019.route
        ) {
            Lit2019Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2020.route
        ) {
            Lit2020Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2021.route
        ) {
            Lit2021Theory()
        }

        composable(
            route = LiteratureTheoryYear.Theory2022.route
        ) {
            Lit2022Theory()
        }


    }
}