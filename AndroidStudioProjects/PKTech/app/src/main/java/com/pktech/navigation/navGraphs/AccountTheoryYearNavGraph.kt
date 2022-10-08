package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AccountTheoryYear
import com.pktech.presentation.screens.subjects.account.year.account2012.Account2012Theory
import com.pktech.presentation.screens.subjects.account.year.account2013.Account2013Theory
import com.pktech.presentation.screens.subjects.account.year.account2014.Account2014Theory
import com.pktech.presentation.screens.subjects.account.year.account2015.Account2015Theory
import com.pktech.presentation.screens.subjects.account.year.account2016.Account2016Theory
import com.pktech.presentation.screens.subjects.account.year.account2017.Account2017Theory
import com.pktech.presentation.screens.subjects.account.year.account2018.Account2018Theory
import com.pktech.presentation.screens.subjects.account.year.account2019.Account2019Theory
import com.pktech.presentation.screens.subjects.account.year.account2020.Account2020Theory
import com.pktech.presentation.screens.subjects.account.year.account2021.Account2021Theory
import com.pktech.presentation.screens.subjects.account.year.account2022.Account2022Theory
import com.pktech.utill.Constants.ACCOUNT_THEORY_YEAR_ROUTE

fun NavGraphBuilder.accountTheoryYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = AccountTheoryYear.Theory2012.route,
        route = ACCOUNT_THEORY_YEAR_ROUTE
    ) {

        composable(
            route = AccountTheoryYear.Theory2012.route
        ) {
            Account2012Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2013.route
        ) {
            Account2013Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2014.route
        ) {
            Account2014Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2015.route
        ) {
            Account2015Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2016.route
        ) {
            Account2016Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2017.route
        ) {
            Account2017Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2018.route
        ) {
            Account2018Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2019.route
        ) {
            Account2019Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2020.route
        ) {
            Account2020Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2021.route
        ) {
            Account2021Theory()
        }

        composable(
            route = AccountTheoryYear.Theory2022.route
        ) {
            Account2022Theory()
        }

    }
}