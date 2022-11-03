package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.*
import com.pktech.presentation.screens.dashboard.overallResult.EnglishOverallTestResult
import com.pktech.utill.Constants.OVERALL_TEST_RESULT_ROUTE


fun NavGraphBuilder.overallTestResultNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = OverallTestResult.OverallTestResultEnglish.route,
        route = OVERALL_TEST_RESULT_ROUTE
    ) {
        composable(
            route = OverallTestResult.OverallTestResultEnglish.route
        ) {
            EnglishOverallTestResult()
        }

        composable(
            route = OverallTestResult.OverallTestResultMathematics.route
        ) {


        }

        composable(
            route = OverallTestResult.OverallTestResultEconomics.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultCivicEducation.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultBiology.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultCommerce.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultAccounting.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultPhysics.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultAgriculture.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultLiterature.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultChemistry.route
        ) {

        }

        composable(
            route = OverallTestResult.OverallTestResultGovernment.route
        ) {

        }
        composable(
            route = OverallTestResult.OverallTestResultMarketing.route
        ) {

        }


    }
}