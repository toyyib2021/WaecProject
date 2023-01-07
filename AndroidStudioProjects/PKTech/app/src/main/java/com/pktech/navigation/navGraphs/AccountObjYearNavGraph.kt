package com.pktech.navigation.navGraphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pktech.navigation.screens.AccountObjYear
import com.pktech.navigation.screens.Screen
import com.pktech.presentation.screens.subjects.account.year.account2012.Account2012Obj
import com.pktech.presentation.screens.subjects.account.year.account2013.Account2013Obj
import com.pktech.presentation.screens.subjects.account.year.account2014.Account2014Obj
import com.pktech.presentation.screens.subjects.account.year.account2015.Account2015Obj
import com.pktech.presentation.screens.subjects.account.year.account2016.Account2016Obj
import com.pktech.presentation.screens.subjects.account.year.account2017.Account2017Obj
import com.pktech.presentation.screens.subjects.account.year.account2018.Account2018Obj
import com.pktech.presentation.screens.subjects.account.year.account2019.Account2019Obj
import com.pktech.presentation.screens.subjects.account.year.account2020.Account2020Obj
import com.pktech.presentation.screens.subjects.account.year.account2021.Account2021Obj
import com.pktech.presentation.screens.subjects.account.year.account2022.Account2022Obj
import com.pktech.utill.Constants.ACCOUNT_OBJ_YEAR_ROUTE

fun NavGraphBuilder.accountObjYearNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = AccountObjYear.Obj2012.route,
        route = ACCOUNT_OBJ_YEAR_ROUTE
    ) {
        composable(
            route = AccountObjYear.Obj2012.route
        ) {
            Account2012Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )


        }

        composable(
            route = AccountObjYear.Obj2013.route
        ) {
            Account2013Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2014.route
        ) {
            Account2014Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2015.route
        ) {
            Account2015Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2016.route
        ) {
            Account2016Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2017.route
        ) {
            Account2017Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2018.route
        ) {
            Account2018Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2019.route
        ) {
            Account2019Obj(
                onYesClickTest = {navController.navigate(Screen.Result.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                } },
                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
                    popUpTo(Screen.StudyYear.route){inclusive = true}
                }
                }
            )
        }

        composable(
            route = AccountObjYear.Obj2020.route
        ) {
//            Account2020Obj(
//                onYesClickTest = {navController.navigate(Screen.Result.route){
//                    popUpTo(Screen.StudyYear.route){inclusive = true}
//                } },
//                onYesClickStudy = {navController.navigate(Screen.DashBoard.route){
//                    popUpTo(Screen.StudyYear.route){inclusive = true}
//                }
//                }
//            )
        }

        composable(
            route = AccountObjYear.Obj2021.route
        ) {
            Account2021Obj()
        }

        composable(
            route = AccountObjYear.Obj2022.route
        ) {
            Account2022Obj()
        }

    }
}