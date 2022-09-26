package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.utill.Constants.AUTH_GRAPH_ROUTE
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.auth.SignInNor
import com.pktech.presentation.screens.auth.SignUpNor
import com.pktech.presentation.screens.onboarding.OnboardingNor
import com.pktech.presentation.screens.splashScreen.SplashScreen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {

    navigation(
        startDestination = Screen.Splash.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Splash.route
        ){
            SplashScreen(navController = navController)

        }
        composable(
            route = Screen.Welcome.route
        ){
            OnboardingNor(
                onSignInClick = { navController.navigate(Screen.SignIn.route) },
                onSignUpClick = { navController.navigate(Screen.SignUp.route) }
            )

        }

        composable(
            route = Screen.SignIn.route
        ){
            SignInNor(
                onSignUpClick = { navController.navigate(Screen.SignUp.route) },
                onSignInClick = {navController.navigate(Screen.DashBoard.route)}
            )
        }

        composable(
            route = Screen.SignUp.route
        ){
            SignUpNor(
                onSignUpClick = { navController.navigate(Screen.DashBoard.route) },
                onSignInClick = {navController.navigate(Screen.SignIn.route)}
            )
        }

    }

}