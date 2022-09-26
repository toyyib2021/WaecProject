package com.pktech.navigation.navHos

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import com.pktech.utill.Constants.AUTH_GRAPH_ROUTE
import com.pktech.utill.Constants.ROOT_GRAPH_ROUTE
import com.pktech.navigation.navGraphs.*


@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AUTH_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        authNavGraph(navController = navController)
        dashboardNavGraph(navController = navController)
        englishStudyYearNavGraph(navController = navController)
        englishTestYearNavGraph(navController = navController)
        mathTestYearNavGraph(navController = navController)
        mathStudyYearNavGraph(navController = navController)

    }
}