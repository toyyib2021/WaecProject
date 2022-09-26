package com.pktech.presentation.screens.list.items

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pktech.R
import com.pktech.data.repository.UiRepository
import com.pktech.data.repository.Years
import com.pktech.domain.model.UiDataClass
import com.pktech.presentation.screens.list.ListVM
import com.pktech.ui.OnYearClick
import com.pktech.ui.SubjectsObjClick
import com.pktech.ui.SubjectsTheoryClick
import com.pktech.ui.theme.PKTechTheme
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Content(
    scaffoldState: BottomSheetScaffoldState,
    txtColorObj: Color,
    txtColorTheory: Color,
    bgColorObj: Color,
    bgColorTheory: Color,
    onObjectiveClick: () -> Unit,
    onTheoryClick: () -> Unit,
    ScreenIndex: Int,
    selectedSubject: String,
    subjectsObjClick: SubjectsObjClick,
    subjectsTheoryClick: SubjectsTheoryClick,
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
){

    val selectedSubjectValue = UiRepository()

    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {

            when(selectedSubject){
              selectedSubjectValue.selectedSubjectObj[0] -> BottomSheetContent(
                  selectedSubject = selectedSubject,
                  onYearClick = onEngObjYearClick,
              )
              selectedSubjectValue.selectedSubjectObj[1] -> BottomSheetContent(
                  selectedSubject = selectedSubject,
                  onYearClick = onMathObjYearClick,
              )
                selectedSubjectValue.selectedSubjectObj[2] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onEcoObjYearClick,
                )
                selectedSubjectValue.selectedSubjectObj[3] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onCivEduObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[4] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onBioObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[5] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onCommObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[6] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onAcctObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[7] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onPhyObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[8] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onAgricObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[9] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onLiteratureObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[10] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onChemistryObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[11] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onGovernmentObjYearClick,
                )

                selectedSubjectValue.selectedSubjectObj[12] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onMarketingObjYearClick,
                )

                selectedSubjectValue.selectedSubjectThy[0] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onEngTheoryYearClick,
                )

                selectedSubjectValue.selectedSubjectThy[1] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onMathTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[2] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onEcoTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[3] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onCivEduTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[4] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onBioTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[5] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onCommTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[6] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onAcctTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[7] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onPhyTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[8] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onAgricTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[9] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onLiteratureTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[10] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onChemistryTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[11] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onGovernmentTheoryYearClick,
                )
                selectedSubjectValue.selectedSubjectThy[12] -> BottomSheetContent(
                    selectedSubject = selectedSubject,
                    onYearClick = onMarketingTheoryYearClick,
                )

            }

        })
    {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Card(modifier = Modifier
                    .padding(10.dp),
                    //set shape of the card
                    shape = RoundedCornerShape(30.dp),
                    content = {
                        Column(modifier = Modifier
                            .height(50.dp)
                            .width(130.dp)
                            .clickable { onObjectiveClick() }
                            .background(color = bgColorObj),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = stringResource(id = R.string.objective),
                                style = MaterialTheme.typography.body2,
                                color = txtColorObj
                            )
                        }
                    }
                )

                Card(modifier = Modifier
                    .padding(10.dp),
                    //set shape of the card
                    shape = RoundedCornerShape(30.dp),
                    content = {
                        Column(modifier = Modifier
                            .height(50.dp)
                            .width(130.dp)
                            .clickable { onTheoryClick() }
                            .background(color = bgColorTheory),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            Text(
                                text = stringResource(id = R.string.theory),
                                style = MaterialTheme.typography.body2,
                                color = txtColorTheory
                            )
                        }
                    }
                )


            }
            when(ScreenIndex){
                0-> SubjectsObj(
                   subjectsObjClick = subjectsObjClick
                )
                1 -> SubjectsTheory(
                    subjectsTheoryClick = subjectsTheoryClick
                )
            }


        }
    }



}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun SubjectsTheory(subjectsTheoryClick: SubjectsTheoryClick){
    val context = LocalContext.current
    val listVM : ListVM = viewModel()
    val dataState = listVM.uiState.value.subjects

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)){
        items(dataState) {data ->
           SingleSubjects(
               uiDataClass = data,
               onSubjectClick = {
                   when(data.id){
                       1 -> subjectsTheoryClick.onEnglishThyClick()
                       2 -> subjectsTheoryClick.onMathematicsThyClick()
                       3 -> subjectsTheoryClick.onEconomicsThyClick()
                       4 -> subjectsTheoryClick.onCivicEducationThyClick()
                       5 -> subjectsTheoryClick.onBiologyThyClick()
                       6 -> subjectsTheoryClick.onCommerceThyClick()
                       7 -> subjectsTheoryClick.onAccountingThyClick()
                       8 -> subjectsTheoryClick.onPhysicsThyClick()
                       9 -> subjectsTheoryClick.onAgricScienceThyClick()
                       10 -> subjectsTheoryClick.onLitInEngThyClick()
                       11 -> subjectsTheoryClick.onChemistryThyClick()
                       12 -> subjectsTheoryClick.onGovernmentThyClick()
                       13 -> subjectsTheoryClick.onMarketingThyClick()
                   }

               }
           )
        }
    }

}


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun SubjectsObj( subjectsObjClick: SubjectsObjClick){
    val listVM : ListVM = viewModel()
    val dataState = listVM.uiState.value.subjects

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)){
        items(dataState) {data ->
            SingleSubjects(
                uiDataClass = data,
                onSubjectClick = {
                    when(data.id){
                        1 -> subjectsObjClick.onEnglishObjClick()
                        2 -> subjectsObjClick.onMathematicsObjClick()
                        3 -> subjectsObjClick.onEconomicsObjClick()
                        4 -> subjectsObjClick.onCivicEducationObjClick()
                        5 -> subjectsObjClick.onBiologyObjClick()
                        6 -> subjectsObjClick.onCommerceObjClick()
                        7 -> subjectsObjClick.onAccountingObjClick()
                        8 -> subjectsObjClick.onPhysicsObjClick()
                        9 -> subjectsObjClick.onAgricScienceObjClick()
                        10 -> subjectsObjClick.onLitInEngObjClick()
                        11 -> subjectsObjClick.onChemistryObjClick()
                        12 -> subjectsObjClick.onGovernmentObjClick()
                        13 -> subjectsObjClick.onMarketingObjClick()
                    }

                }
            )
        }
    }

}


@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun BottomSheetContent(
    onYearClick: OnYearClick,
    selectedSubject: String
){
    val listVM : ListVM = viewModel()
    val dataState = listVM.uiState.value.years

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        elevation = 20.dp,
        content = {
            Column(modifier = Modifier.height(300.dp)
                .background(color = VeryDarkGray)
                .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = selectedSubject,
                    style = MaterialTheme.typography.h2,
                    color = White
                )
                Spacer(modifier = Modifier.padding(10.dp))
                LazyColumn(modifier = Modifier
                    .padding(horizontal = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(10.dp)){
                    items(dataState) { data ->
                        BottomSheetItems(
                            years = data,
                            onYearClick = {
                                when(data.id){
                                    1 -> onYearClick.on2012Click()
                                    2 -> onYearClick.on2013Click()
                                    3 -> onYearClick.on2014Click()
                                    4 -> onYearClick.on2015Click()
                                    5 -> onYearClick.on2016Click()
                                    6 -> onYearClick.on2017Click()
                                    7 -> onYearClick.on2018Click()
                                    8 -> onYearClick.on2019Click()
                                    9 -> onYearClick.on2020Click()
                                    10 -> onYearClick.on2021Click()
                                    11 -> onYearClick.on2022Click()
                                }
                            }
                        )

                    }
                }
            }
        })



}



@Composable
private fun SingleSubjects(
    uiDataClass: UiDataClass,
    onSubjectClick: () -> Unit
){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(80.dp)
        .padding(10.dp),
        //set shape of the card
        shape = RoundedCornerShape(20.dp),
        content = {
            Row(modifier = Modifier
                .clickable { onSubjectClick() }
                .background(color = uiDataClass.color!!),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ){
                Image(
                    modifier = Modifier
                        .height(50.dp)
                        .padding(start = 20.dp),
                    painter = painterResource(uiDataClass.image),
                    contentDescription = stringResource(
                        id = R.string.icon),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = uiDataClass.title,
                    style = MaterialTheme.typography.body2,
                    color = Color.White
                )

            }

        }
    )
}

@Composable
private fun BottomSheetItems(years: Years, onYearClick: () -> Unit){

            Column(
                modifier = Modifier.fillMaxWidth()
                    .clickable { onYearClick() },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = years.years,
                    style = MaterialTheme.typography.body2,
                    color = White,
                )
            }


}

@Composable
fun TopBar(onBackArrowClick: () -> Unit){
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,

                ) {

                Text(text = stringResource(id = R.string.subject))
            }
        },
        navigationIcon = {
            IconButton(onClick = { onBackArrowClick() }) {
                Icon(
                    Icons.Filled.ArrowBack,
                    contentDescription = stringResource(id = R.string.icon))
            }
        },
        backgroundColor = Color.White,
        contentColor = Color.Black,
        elevation = 10.dp
    )
}



@Preview(showBackground = true)
@Composable
fun SubjectPreview() {
    PKTechTheme {

    }
}