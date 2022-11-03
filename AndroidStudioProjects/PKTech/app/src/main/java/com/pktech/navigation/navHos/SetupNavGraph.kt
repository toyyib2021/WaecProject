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
        englishObjYearNavGraph(navController = navController)
        englishTheoryYearNavGraph(navController = navController)
        mathTheoryYearNavGraph(navController = navController)
        mathObjYearNavGraph(navController = navController)
        accountObjYearNavGraph(navController = navController)
        accountTheoryYearNavGraph(navController = navController)
        agricultureObjYearNavGraph(navController = navController)
        agricultureTheoryYearNavGraph(navController = navController)
        economicsTheoryYearNavGraph(navController = navController)
        economicsObjYearNavGraph(navController = navController)
        civicObjYearNavGraph(navController = navController)
        civicTheoryYearNavGraph(navController = navController)
        biologyTheoryYearNavGraph(navController = navController)
        biologyObjYearNavGraph(navController = navController)
        commerceObjYearNavGraph(navController = navController)
        commerceTheoryYearNavGraph(navController = navController)
        physicsObjYearNavGraph(navController = navController)
        physicsTheoryYearNavGraph(navController = navController)
        literatureObjYearNavGraph(navController = navController)
        literatureTheoryYearNavGraph(navController = navController)
        chemistryObjYearNavGraph(navController = navController)
        chemistryTheoryYearNavGraph(navController = navController)
        governmentObjYearNavGraph(navController = navController)
        governmentTheoryYearNavGraph(navController = navController)
        marketingObjYearNavGraph(navController = navController)
        marketingTheoryYearNavGraph(navController = navController)
        overallTestResultNavGraph(navController = navController)


    }
}