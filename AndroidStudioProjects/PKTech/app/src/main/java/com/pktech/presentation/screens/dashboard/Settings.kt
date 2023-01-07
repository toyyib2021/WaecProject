package com.pktech.presentation.screens.dashboard

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.R
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.StrongBlue2
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.UiEvent

@Composable
fun Settings(){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        val dashboardVM: DashboardVM = hiltViewModel()
        val isLoading = dashboardVM.questionState.value.isLoading
        val context = LocalContext.current
        val scaffoldState = rememberScaffoldState()

        BackHandlerFun(backHandler = { dashboardVM.selectedTab  = 0 })

        if(dashboardVM.isLoading == 2) {
            CircularProgressIndicator(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                strokeWidth = 20.dp,
                color = VeryDarkGray
            )
        }else{

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                LazyColumn(modifier = Modifier.fillMaxSize()){
                    item{
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(horizontal = 10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            var activationPin by remember { mutableStateOf("")}
                            Image(painter = painterResource(id = R.drawable.pass_result), contentDescription = "")
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(horizontal = 10.dp),
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(text = "How to activate", style = MaterialTheme.typography.body2)
                            }
                            Spacer(modifier = Modifier.padding(10.dp))
                            ActivationGuide(steps = "Step One", des = "Get your activation code from your app provider")
                            Spacer(modifier = Modifier.padding(10.dp))
                            ActivationGuide(steps = "Step Two", des = "Input the 12 digit code into the box below without spacing")
                            Spacer(modifier = Modifier.padding(10.dp))
                            OutlinedTextField(
                                modifier = Modifier
                                    .height(50.dp)
                                    .fillMaxWidth(),
                                value = activationPin ,
                                onValueChange = {
                                    activationPin = it },
                                shape = RoundedCornerShape(10.dp),
                                maxLines = 1
                            )
                            Spacer(modifier = Modifier.padding(5.dp))
                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                horizontalAlignment = Alignment.End
                            ) {
                                Button(
                                    onClick = { /*TODO*/ },
                                    colors = ButtonDefaults.buttonColors(
                                        backgroundColor = DarkBlue, contentColor = Color.White
                                    )
                                ) {
                                    Text(text = "Activate Now")
                                }
                            }

                        }
                        Spacer(modifier = Modifier.padding(20.dp))
                        ResetAllQuestions(
                            steps = """
                            if you receive an update from your app provided about any question relate issues,
                            Click the RESET ALL QUESTION button to solve the issue 
                        """.trimIndent(),
                            onResetClick = {}
                        )
                    }
                }
            }

            Button(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = StrongBlue2
                ),
                shape = RoundedCornerShape(9.dp),
                onClick = {
                    dashboardVM.addAllSubjectsAndImage(context = context)
                })
            {
                Text(
                    text = "Get All Questions",
                    color = Color.White,
                    style = MaterialTheme.typography.body2
                )
            }

        }


    }
}

@Composable
private fun ActivationGuide(steps: String, des: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(2.dp, DarkBlue),
        elevation = 5.dp
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Text(text = steps, style = MaterialTheme.typography.body2)
            Text(
                text = des, style = MaterialTheme.typography.body1
            )
        }
    }
}

@Composable
private fun ResetAllQuestions(steps: String, onResetClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(2.dp, DarkBlue),
        elevation = 5.dp
    ) {
        Text(text = steps, style = MaterialTheme.typography.body1)
        Button(
            onClick = { onResetClick() }) {
            Text(text = "Reset All Questions")
        }

    }
}