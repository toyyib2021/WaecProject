package com.pktech.presentation.screens.dashboard

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pktech.R
import com.pktech.domain.model.UiDataClass
import com.pktech.ui.theme.StrongBlue
import com.pktech.ui.theme.StrongBlue2

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Home( onStudyYearClick: () -> Unit,
          onTestYearClick: () -> Unit,
          onStudyTopicClick: () -> Unit,
          onTestTopicClick: () -> Unit,
         onSaveQuestionClick: () -> Unit,
         onLiteratureClick: () -> Unit,
){

    val dashboardVM : DashboardVM = viewModel()
    val dataState = dashboardVM.uiState.value.saveQuestionAndOthers
    LazyColumn( modifier = Modifier.fillMaxSize()
        ){
        item {
            HomeSectionOne()
            Spacer(modifier = Modifier.padding(10.dp))
            HomeTextSectionOne(stringResource(id = R.string.how_do_you))
            Spacer(modifier = Modifier.padding(10.dp))
            HomeSectionTwo(
                onStudyTopicClick = onStudyTopicClick,
                onStudyYearClick = onStudyYearClick,
                onTestTopicClick = onTestTopicClick,
                onTestYearClick = onTestYearClick,

            )
            Spacer(modifier = Modifier.padding(10.dp))
            HomeTextSectionOne(stringResource(id = R.string.save_question))
            Spacer(modifier = Modifier.padding(10.dp))
            SaveQuestionAndOthers(uiDataClass = dataState[0], onClick = onSaveQuestionClick)
            Spacer(modifier = Modifier.padding(10.dp))
            SaveQuestionAndOthers(uiDataClass = dataState[1], onClick = onLiteratureClick)
            Spacer(modifier = Modifier.padding(10.dp))

            
        }
    }


}



@Composable
private fun HomeTextSectionOne(text: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp),
        text = text,
        style = MaterialTheme.typography.body2
    )
}

@Composable
private fun HomeSectionOne() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
        ,
        //set shape of the card
        shape = RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp),
        content = {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(StrongBlue)

            ) {
                val (titleTv, desTv, iv) = createRefs()

                Text(
                    modifier = Modifier
                        .constrainAs(titleTv) {
                            top.linkTo(parent.top, margin = 50.dp)
                            start.linkTo(parent.start, margin = 30.dp)
                        }
                        .padding(start = 10.dp),
                    text = stringResource(
                        id = R.string.w_a_e_c
                    ),
                    style = MaterialTheme.typography.h1,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    modifier = Modifier.constrainAs(desTv) {
                        top.linkTo(titleTv.bottom)
                        start.linkTo(titleTv.start)
                    },
                    text = stringResource(id = R.string.e_study_app),
                    style = MaterialTheme.typography.body2,
                    color = Color.White,
                )

                Image(
                    modifier = Modifier
                        .constrainAs(iv) {
                            top.linkTo(parent.top)
                            bottom.linkTo(parent.bottom)
                            end.linkTo(parent.end, margin = 10.dp)
                        }
                        .height(170.dp)
                        .width(100.dp),
                    painter = painterResource(id = R.drawable.dashboard_image),
                    contentDescription = stringResource(
                        id = R.string.w_a_e_c
                    ))

            }
        }

    )


}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
private fun HomeSectionTwo(
    onStudyYearClick: () -> Unit,
    onTestYearClick: () -> Unit,
    onStudyTopicClick: () -> Unit,
    onTestTopicClick: () -> Unit,

){
    val dashboardVM : DashboardVM = viewModel()
    val dataState = dashboardVM.uiState.value.homeStudyAndTestState

    LazyRow(modifier = Modifier
        .fillMaxSize()
        .padding(horizontal = 20.dp),
    horizontalArrangement = Arrangement.spacedBy(30.dp)){
        items(dataState) {data ->
            HomeStudyAndTestData(
                uiDataClass = data,
                onClick = {
                    when (data.id){
                        1 -> { onStudyYearClick() }
                        2 -> { onStudyTopicClick() }
                        3 -> { onTestYearClick() }
                        4 -> { onTestTopicClick() }

                    }
                }
                    )
        }
    }

}


@Composable
private fun HomeStudyAndTestData(uiDataClass: UiDataClass,
                                 onClick: () -> Unit
){
    Card(
        modifier = Modifier
            .width(190.dp)
            .height(150.dp)
            .clickable { onClick() }
        ,
        //set shape of the card
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(4.dp, color = StrongBlue2),
        content = {
            ConstraintLayout {
                val (titleTv, row) = createRefs()


                Text(
                    modifier = Modifier
                        .constrainAs(titleTv) {
                            top.linkTo(parent.top, margin = 20.dp)
                            centerHorizontallyTo(parent)
                        },
                    text = uiDataClass.title,
                    style = MaterialTheme.typography.body2,
                )

                Row(
                    modifier = Modifier.constrainAs(row){
                        top.linkTo(titleTv.bottom)
                        centerHorizontallyTo(parent)
                    },
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){

                    Image(
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp),
                        painter = painterResource(id = uiDataClass.image),
                        contentDescription = stringResource(
                            id = R.string.icon
                        ),
                        contentScale = ContentScale.Fit
                    )

                    Text(
                        modifier = Modifier
                            .height(80.dp)
                            .width(80.dp)
                            .padding(top = 10.dp),
                        text = uiDataClass.des,
                        style = MaterialTheme.typography.subtitle1,
                    )

                }


            }
        })
}

@Composable
private fun SaveQuestionAndOthers(
    uiDataClass: UiDataClass,
    onClick: () -> Unit
){

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
                .padding(horizontal = 20.dp)
                .clickable { onClick()  },
            //set shape of the card
            shape = RoundedCornerShape(20.dp),
            elevation = 10.dp,
            content = {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .background(color = uiDataClass.color!!)
                        .padding(vertical = 20.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,

                ) {
                    Column(modifier = Modifier
                        .width(200.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = uiDataClass.title,
                            style = MaterialTheme.typography.body2,
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )

                        Text(
                            text = uiDataClass.des,
                            style = MaterialTheme.typography.body1,
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )
                    }

                    Image(
                        modifier = Modifier
                            .height(90.dp)
                            .width(90.dp),
                        painter = painterResource(uiDataClass.image),
                        contentDescription = stringResource(
                            id = R.string.icon
                        ),
                        contentScale = ContentScale.Fit
                    )

                }

            }
        )
    }



}


