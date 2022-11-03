package com.pktech.presentation.screens.result

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.ui.material.surface.Card
import com.pktech.R
import com.pktech.data.local.StudyOrTestKey
import com.pktech.data.local.utill.QuestionTitleKey
import com.pktech.ui.theme.DarkBlue
import com.pktech.utill.BackHandlerFun
import com.pktech.utill.Constants.COMPLETE
import com.pktech.utill.Constants.LOADING
import com.pktech.utill.Constants.SHOWANSWERFORTEST
import com.pktech.utill.SaveQuestionConstants.ENGLISH2012
import com.pktech.utill.SaveQuestionConstants.ENGLISH2013
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TestResult(
    backHandler: () -> Unit,
    onHomeClick: () -> Unit,
    onTryAgainOrShowAnswerClick: (String) -> Unit,
){

    BackHandlerFun(backHandler = { backHandler() })
    val context = LocalContext.current
    val questionTitleKey = QuestionTitleKey(context)
    val getResultDetails = questionTitleKey.getKey.collectAsState(initial = "")
    val getResultDetailsR  = getResultDetails.value
    val studyOrTestKey = StudyOrTestKey(context)
    val studyOrTestKeyState = studyOrTestKey.getKey.collectAsState(initial = "")
    val studyOrTestKeyValue = studyOrTestKeyState.value

    var questionSize by remember { mutableStateOf("")}
    var score by remember { mutableStateOf(0)}
    var route by remember { mutableStateOf("")}
    val testResultVM: TestResultVM = hiltViewModel()
    val  restartQuestionState = testResultVM.restartQuestionState
    val splitResultDetails = getResultDetailsR.split(" ")
    val scope = rememberCoroutineScope()

    LaunchedEffect(key1 = splitResultDetails){
        delay(1000)
        questionSize = splitResultDetails[0]
        score =  splitResultDetails[1].toInt()
        route =  splitResultDetails[2]
    }

    LaunchedEffect(key1 = restartQuestionState){
        if (restartQuestionState == COMPLETE){
            onTryAgainOrShowAnswerClick(route)
        }
    }

//         questionSize = splitResultDetails[1]
//         score =  splitResultDetails[1].toInt()
//         route =  splitResultDetails[2]


    Log.i(TAG, "splitResultDetails: $splitResultDetails")
    Log.i(TAG, "TestResult: $questionSize")
    Log.i(TAG, "TestResult: $score")
    Log.i(TAG, "TestResult: $route")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

//        Text(
//            text = "English 2015",
//            style = MaterialTheme.typography.h2,
//            color = DarkBlue
//        )
//        Spacer(modifier = Modifier.padding(20.dp))

        when(questionSize) {
            "100" -> {
                if (score < 45){
                    Image(
                        painter = painterResource(id = R.drawable.fail_result),
                        contentDescription = "")
                }else{
                    Image(
                        painter = painterResource(id = R.drawable.pass_result),
                        contentDescription = "")
                }
            }
            "80" -> {
                if (score < 35){
                    Image(
                        painter = painterResource(id = R.drawable.fail_result),
                        contentDescription = "")
                }else{
                    Image(
                        painter = painterResource(id = R.drawable.pass_result),
                        contentDescription = "")
                }
            }
            "60" -> {
                if (score < 25){
                    Image(
                        painter = painterResource(id = R.drawable.fail_result),
                        contentDescription = "")
                }else{
                    Image(
                        painter = painterResource(id = R.drawable.pass_result),
                        contentDescription = "")
                }
            }
            "50" -> {
                if (score < 25){
                    Image(
                        painter = painterResource(id = R.drawable.fail_result),
                        contentDescription = "")
                }else{
                    Image(
                        painter = painterResource(id = R.drawable.pass_result),
                        contentDescription = "")
                }
            }

        }


        Text(
            text = "$score / $questionSize",
            style = MaterialTheme.typography.h1,
            color = DarkBlue
        )
        Spacer(modifier = Modifier.padding(5.dp))
        when(questionSize){
            "100" -> {
                if (score < 39){
                    Text(text = "Fail", style = MaterialTheme.typography.body2)
                }else if (score in 40..49){
                    Text(text = "Pass", style = MaterialTheme.typography.body2)
                }else if (score in 50..64){
                    Text(text = "Credit", style = MaterialTheme.typography.body2)
                }else if (score in 65..74){
                    Text(text = "Good", style = MaterialTheme.typography.body2)
                }else if (score in 75..100){
                    Text(text = "Excellent", style = MaterialTheme.typography.body2)
                }
            }
            "80" -> {
                if (score < 31){
                    Text(text = "Fail", style = MaterialTheme.typography.body2)
                }else if (score in 32..39){
                    Text(text = "Pass", style = MaterialTheme.typography.body2)
                }else if (score in 40..51){
                    Text(text = "Credit", style = MaterialTheme.typography.body2)
                }else if (score in 52..59){
                    Text(text = "Good", style = MaterialTheme.typography.body2)
                }else if (score in 60..80){
                    Text(text = "Excellent", style = MaterialTheme.typography.body2)
                }
            }
            "60" -> {
                if (score < 18){
                    Text(text = "Fail", style = MaterialTheme.typography.body2)
                }else if (score in 18..29){
                    Text(text = "Pass", style = MaterialTheme.typography.body2)
                }else if (score in 30..39){
                    Text(text = "Credit", style = MaterialTheme.typography.body2)
                }else if (score in 40..44){
                    Text(text = "Good", style = MaterialTheme.typography.body2)
                }else if (score in 45..60){
                    Text(text = "Excellent", style = MaterialTheme.typography.body2)
                }
            }
            "50" -> {
                if (score < 15){
                    Text(text = "Fail", style = MaterialTheme.typography.body2)
                }else if (score in 16..24){
                    Text(text = "Pass", style = MaterialTheme.typography.body2)
                }else if (score in 25..32){
                    Text(text = "Credit", style = MaterialTheme.typography.body2)
                }else if (score in 33..37){
                    Text(text = "Good", style = MaterialTheme.typography.body2)
                }else if (score in 38..50){
                    Text(text = "Excellent", style = MaterialTheme.typography.body2)
                }
            }
        }


        Spacer(modifier = Modifier.padding(20.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    onClick = {
                        testResultVM.deleteAllSelectedOption() },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = DarkBlue
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(10.dp)
                ) {
                    when(restartQuestionState){
                        "" -> {Text(text = "Take Test Again")}
                        LOADING -> {Text(text = "Getting Questions")}
                        COMPLETE -> {Text(text = "Done")}
                    }




                }
                Spacer(modifier = Modifier.padding(10.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    onClick = {
                        scope.launch {
                            studyOrTestKey.saveKey(SHOWANSWERFORTEST)
                        }
                        onTryAgainOrShowAnswerClick(route) },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = DarkBlue
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(10.dp)
                ) {
                    Text(text = "Show All Answer")
                }
                Spacer(modifier = Modifier.padding(10.dp))

                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    onClick = { onHomeClick() },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = DarkBlue
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(10.dp)
                ) {
                    Text(text = "Home")
                }




    }
    
}