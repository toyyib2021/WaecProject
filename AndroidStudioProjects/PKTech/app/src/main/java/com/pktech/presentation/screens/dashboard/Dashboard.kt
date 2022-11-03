package com.pktech.presentation.screens.dashboard

import android.widget.Toast
import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.res.stringResource

import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.pktech.utill.Constants.SELECTED_STUDY_KEY
import com.pktech.utill.Constants.SELECTED_TEST_KEY

import com.pktech.R
import com.pktech.data.local.StudyOrTestKey
import com.pktech.ui.SubjectsObjClick
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.Purple700
import com.pktech.utill.BackHandlerFun
import kotlinx.coroutines.launch


@Composable
fun Dashboard(
    navControllerOnLiteratureClick: () -> Unit,
    navControllerOnSaveQuestionClick: () -> Unit,
    navControllerStudyYear: () -> Unit,
    navControllerTestYear: () -> Unit,
    navControllerStudyTopic: () -> Unit,
    navControllerTestTopic: () -> Unit,
   backHandler: () -> Unit,
    subjectsObjClick: SubjectsObjClick,
) {

    BackHandlerFun(backHandler = {
      backHandler()

    } )

    val bottomNavPosition = listOf<Int>(0, 1, 2)

    val dashboardVM: DashboardVM = hiltViewModel()
    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    val studyOrTestKey = StudyOrTestKey(context)


    val systemUIController = rememberSystemUiController()
    SideEffect {
        systemUIController.setStatusBarColor(
            color = Purple700
        )
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    TopBar()
                },
                backgroundColor = DarkBlue,
                contentColor = Color.White,
//                elevation = 10.dp
            )
        },
        content = {
            Box(modifier = Modifier.padding(it)){
                when (dashboardVM.selectedTab) {
                    0 -> Home(
                        onTestYearClick = {
                            navControllerTestYear()
                            scope.launch {
                                studyOrTestKey.saveKey(SELECTED_TEST_KEY)
//                                dashboardVM.addEmptyOptions()
                            }

                        },
                        onTestTopicClick = {
                            navControllerTestTopic()
                            scope.launch {
                                studyOrTestKey.saveKey(SELECTED_TEST_KEY)
//                                dashboardVM.addEmptyOptions()
                            }

                        },
                        onStudyYearClick = {
                            navControllerStudyYear()
                            scope.launch {
                                studyOrTestKey.saveKey(SELECTED_STUDY_KEY)
//                                dashboardVM.addEmptyOptions()

                            }
                        },
                        onStudyTopicClick = {
                            navControllerStudyTopic()
                            scope.launch {
                                studyOrTestKey.saveKey(SELECTED_STUDY_KEY)
//                                dashboardVM.addEmptyOptions()

                            }
                        },
                        onLiteratureClick = {
                            navControllerOnLiteratureClick()
                        },
                        onSaveQuestionClick = {
                            navControllerOnSaveQuestionClick()
                        },
                    )
                    1 -> Timeline(subjectsObjClick = subjectsObjClick)
                    2 -> Settings()
                }
            }

        },
        bottomBar = { BottomBar(bottomNavPosition = bottomNavPosition) })
}

@Composable
private fun TopBar() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.body2,
        )
    }
}

@Composable
fun BottomBar(bottomNavPosition: List<Int>) {
    val dashboardVM : DashboardVM = viewModel()

    BottomNavigation(elevation = 10.dp, backgroundColor = Color.White) {

        BottomNavigationItem(
            icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = stringResource(id = R.string.icon),
                tint = Color.Black
            )
        },
            label = { Text(text = stringResource(id = R.string.Home), color = Color.Black) },
            selected = (dashboardVM.selectedTab == bottomNavPosition[0]),
            onClick = {
                dashboardVM.selectedTab = bottomNavPosition[0]

            })

        BottomNavigationItem(
            icon = {
            Icon(
                imageVector = Icons.Default.Timeline,
                contentDescription =stringResource(id = R.string.icon),
                tint = Color.Black
            )
        },
            label = { Text(text = stringResource(id = R.string.Timeline), color = Color.Black) },
            selected = (dashboardVM.selectedTab == bottomNavPosition[1]),
            onClick = {
                dashboardVM.selectedTab = bottomNavPosition[1]
            })

        BottomNavigationItem(
            icon = {
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = stringResource(id = R.string.icon),
                tint = Color.Black
            )
        },
            label = { Text(text = stringResource(id = R.string.settings), color = Color.Black) },
            selected = (dashboardVM.selectedTab == 2),
            onClick = {
                dashboardVM.selectedTab = bottomNavPosition[2]
            })

    }
}

