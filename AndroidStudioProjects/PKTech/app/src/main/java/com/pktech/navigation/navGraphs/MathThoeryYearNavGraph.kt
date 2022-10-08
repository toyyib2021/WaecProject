package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants
import com.pktech.navigation.screens.MathTheoryYear
import com.pktech.presentation.screens.subjects.maths.year.math2012.Math2012Theory
import com.pktech.presentation.screens.subjects.maths.year.math2013.Math2013Theory
import com.pktech.presentation.screens.subjects.maths.year.math2014.Math2014Theory
import com.pktech.presentation.screens.subjects.maths.year.math2015.Math2015Theory
import com.pktech.presentation.screens.subjects.maths.year.math2016.Math2016Theory
import com.pktech.presentation.screens.subjects.maths.year.math2017.Math2017Theory
import com.pktech.presentation.screens.subjects.maths.year.math2018.Math2018Theory
import com.pktech.presentation.screens.subjects.maths.year.math2019.Math2019Theory
import com.pktech.presentation.screens.subjects.maths.year.math2020.Math2020Theory
import com.pktech.presentation.screens.subjects.maths.year.math2021.Math2021Theory
import com.pktech.presentation.screens.subjects.maths.year.math2022.Math2022Theory


fun NavGraphBuilder.mathTheoryYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = MathTheoryYear.Theory2012.route,
        route = Constants.MATH_THEORY_YEAR_ROUTE
    ) {

        composable(
            route = MathTheoryYear.Theory2012.route
        ) {
            Math2012Theory()
        }

        composable(
            route = MathTheoryYear.Theory2013.route
        ) {
            Math2013Theory()
        }

        composable(
            route = MathTheoryYear.Theory2014.route
        ) {
            Math2014Theory()
        }

        composable(
            route = MathTheoryYear.Theory2015.route
        ) {
            Math2015Theory()
        }

        composable(
            route = MathTheoryYear.Theory2016.route
        ) {
            Math2016Theory()
        }

        composable(
            route = MathTheoryYear.Theory2017.route
        ) {
            Math2017Theory()
        }

        composable(
            route = MathTheoryYear.Theory2018.route
        ) {
            Math2018Theory()
        }

        composable(
            route = MathTheoryYear.Theory2019.route
        ) {
            Math2019Theory()
        }

        composable(
            route = MathTheoryYear.Theory2020.route
        ) {
            Math2020Theory()
        }

        composable(
            route = MathTheoryYear.Theory2021.route
        ) {
            Math2021Theory()
        }

        composable(
            route = MathTheoryYear.Theory2022.route
        ) {
            Math2022Theory()
        }

    }
}