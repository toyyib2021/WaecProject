package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants.ENGLISH_THEORY_YEAR_ROUTE
import com.pktech.navigation.screens.EnglishTheoryYear
import com.pktech.presentation.screens.subjects.eng.year.eng2012.Eng2012Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2013.Eng2013Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2014.Eng2014Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2015.Eng2015Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2016.Eng2016Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2017.Eng2017Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2018.Eng2018Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2019.Eng2019Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2020.Eng2020Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2021.Eng2021Theory
import com.pktech.presentation.screens.subjects.eng.year.eng2022.Eng2022Theory

fun NavGraphBuilder.englishTheoryYearNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = EnglishTheoryYear.Theory2012.route,
        route = ENGLISH_THEORY_YEAR_ROUTE
    ) {
        composable(
            route = EnglishTheoryYear.Theory2012.route
        ) {
            Eng2012Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2013.route
        ) {
            Eng2013Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2014.route
        ) {
            Eng2014Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2015.route
        ) {
            Eng2015Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2016.route
        ) {
            Eng2016Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2017.route
        ) {
            Eng2017Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2018.route
        ) {
            Eng2018Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2019.route
        ) {
            Eng2019Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2020.route
        ) {
            Eng2020Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2021.route
        ) {
            Eng2021Theory()
        }

        composable(
            route = EnglishTheoryYear.Theory2022.route
        ) {
            Eng2022Theory()
        }

    }
}