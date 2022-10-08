@file:JvmName("StudyYearKt")

package com.pktech.presentation.screens.list

import android.widget.Toast
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.pktech.data.repository.UiRepository
import com.pktech.presentation.screens.list.items.Content
import com.pktech.presentation.screens.list.items.TopBar
import com.pktech.presentation.screens.subjects.SubjectVM
import com.pktech.ui.OnYearClick
import com.pktech.ui.SubjectsObjClick
import com.pktech.ui.SubjectsTheoryClick
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun StudyAndTestYearList(
    onBackArrowClick: () -> Unit,
    onBackHandlerClick: () -> Unit,
    onEngObjYearClick: OnYearClick,
    onMathObjYearClick: OnYearClick,
    onEcoObjYearClick: OnYearClick,
    onCivEduObjYearClick: OnYearClick,
    onBioObjYearClick: OnYearClick,
    onCommObjYearClick: OnYearClick,
    onAcctObjYearClick: OnYearClick,
    onPhyObjYearClick: OnYearClick,
    onAgricObjYearClick: OnYearClick,
    onLiteratureObjYearClick: OnYearClick,
    onChemistryObjYearClick: OnYearClick,
    onGovernmentObjYearClick: OnYearClick,
    onMarketingObjYearClick: OnYearClick,
    onEngTheoryYearClick: OnYearClick,
    onMathTheoryYearClick: OnYearClick,
    onEcoTheoryYearClick: OnYearClick,
    onCivEduTheoryYearClick: OnYearClick,
    onBioTheoryYearClick: OnYearClick,
    onCommTheoryYearClick: OnYearClick,
    onAcctTheoryYearClick: OnYearClick,
    onPhyTheoryYearClick: OnYearClick,
    onAgricTheoryYearClick: OnYearClick,
    onLiteratureTheoryYearClick: OnYearClick,
    onChemistryTheoryYearClick: OnYearClick,
    onGovernmentTheoryYearClick: OnYearClick,
    onMarketingTheoryYearClick: OnYearClick,
) {



    val systemUIController = rememberSystemUiController()
    SideEffect {
        systemUIController.setStatusBarColor(
            color = White
        )
    }
    val context = LocalContext.current
    val listVM : ListVM = hiltViewModel()
    val sheetState = rememberBottomSheetState(
        initialValue = BottomSheetValue.Collapsed )

    val scaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )

    val selectedSubjectValue = UiRepository()


    BackHandlerFun(backHandler = {
        if (listVM.selectedSubject != ""){
            listVM.selectedSubject = ""
        }else{
            onBackHandlerClick()
        }
    })


    Scaffold(
        topBar = {  TopBar(onBackArrowClick = onBackArrowClick) }
    ) {
            Content(
                txtColorObj =
                when (listVM.selectedTab) {
                    0 -> Color.White
                    else -> {
                        Color.Black
                    }
                },
                bgColorObj =
                when (listVM.selectedTab) {
                    0 -> Color.Black
                    else -> {
                        Color.White
                    }
                },
                bgColorTheory = when (listVM.selectedTab) {
                    1 -> Color.Black
                    else -> {
                        Color.White
                    }
                },
                txtColorTheory =
                when (listVM.selectedTab) {
                    1 -> Color.White
                    else -> {
                        Color.Black
                    }
                },
                onObjectiveClick = {
                    listVM.selectedTab = 0
                    listVM.selectedSubject = "" },

                onTheoryClick = { listVM.selectedTab = 1
                    listVM.selectedSubject = "" },

                ScreenIndex = listVM.selectedTab,
                selectedSubject = listVM.selectedSubject,

                scaffoldState = scaffoldState,

                subjectsObjClick = SubjectsObjClick(
                    onEnglishObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[0] },
                    onMathematicsObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[1] },
                    onEconomicsObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[2] },
                    onCivicEducationObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[3] },
                    onBiologyObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[4] },
                    onCommerceObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[5] },
                    onAccountingObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[6] },
                    onPhysicsObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[7] },
                    onAgricScienceObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[8]},
                    onLitInEngObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[9] },
                    onChemistryObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[10] },

                    onGovernmentObjClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[11]},
                    onMarketingObjClick = {listVM.selectedSubject = selectedSubjectValue.selectedSubjectObj[12]},
                ),


                subjectsTheoryClick = SubjectsTheoryClick(
                    onEnglishThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[0] },
                    onMathematicsThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[1]  },
                    onEconomicsThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[2]  },
                    onCivicEducationThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[3]  },
                    onBiologyThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[4]  },
                    onCommerceThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[5]  },
                    onAccountingThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[6]  },
                    onPhysicsThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[7]  },
                    onAgricScienceThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[8]  },
                    onLitInEngThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[9]  },
                    onChemistryThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[10]  },
                    onGovernmentThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[11]  },
                    onMarketingThyClick = { listVM.selectedSubject = selectedSubjectValue.selectedSubjectThy[12] },
                ),

                onEngObjYearClick = onEngObjYearClick,
                onAcctObjYearClick = onAcctObjYearClick,
                onAgricObjYearClick = onAgricObjYearClick,
                onBioObjYearClick = onBioObjYearClick,
                onChemistryObjYearClick = onChemistryObjYearClick,
                onCivEduObjYearClick = onCivEduObjYearClick,
                onCommObjYearClick = onCommObjYearClick,
                onEcoObjYearClick = onEcoObjYearClick,
                onLiteratureObjYearClick = onLiteratureObjYearClick,
                onMathObjYearClick = onMathObjYearClick,
                onPhyObjYearClick = onPhyObjYearClick,
                onGovernmentObjYearClick = onGovernmentObjYearClick,
                onMarketingObjYearClick = onMarketingObjYearClick,


                onEngTheoryYearClick = onEngTheoryYearClick,
                onMathTheoryYearClick = onMathTheoryYearClick,
                onEcoTheoryYearClick = onEcoTheoryYearClick,
                onCivEduTheoryYearClick = onCivEduTheoryYearClick,
                onBioTheoryYearClick = onBioTheoryYearClick,
                onCommTheoryYearClick = onCommTheoryYearClick,
                onAcctTheoryYearClick = onAcctTheoryYearClick,
                onPhyTheoryYearClick = onPhyTheoryYearClick,
                onAgricTheoryYearClick = onAgricTheoryYearClick,
                onLiteratureTheoryYearClick = onLiteratureTheoryYearClick,
                onChemistryTheoryYearClick = onChemistryTheoryYearClick,
                onGovernmentTheoryYearClick = onGovernmentTheoryYearClick,
                onMarketingTheoryYearClick = onMarketingTheoryYearClick,
            )

    }
}