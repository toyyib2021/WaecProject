package com.pktech.presentation.screens.dashboard.overallResult

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.DarkBlue

data class Test( val year: String, val score: String, val remark: String, val date: String)
@Composable
fun EnglishOverallTestResult(){

    val test = listOf<Test>(
        Test("2014", "20/14", "Good", "October 29, 2022" ),
        Test("2014", "20/14", "Good", "October 29, 2022" ),
        Test("2014", "20/14", "Good", "October 29, 2022" ),
        Test("2014", "20/14", "Good", "October 29, 2022" ),
    )
    Column(
        Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "ENGLISH", style = MaterialTheme.typography.h2, color = DarkBlue )
        Spacer(modifier = Modifier.padding(5.dp))
        LazyColumn(){
            item{
                Testtest()
                FourRowTable(year = "year", score = "score", remark = "remark", date = "date")
            }
            items(test){test ->
                FourRowTable(
                    year = test.year,
                    score = test.score,
                    remark = test.remark,
                    date = test.date,
                    height = 60.dp

                )
            }

        }
    }
}



@Composable
fun FourRowTable(
    year: String,
    score: String,
    remark: String,
    date: String,
    height: Dp = 30.dp,
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, DarkBlue)
    ) {
        Column(
            modifier = Modifier
                .weight(2f)
                .border(1.dp, DarkBlue)
                .padding(start = 10.dp)
                .height(height),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = year,
                style = MaterialTheme.typography.body2,
                color = DarkBlue
            )
        }
        Column(
            modifier = Modifier
                .weight(2f)
                .border(1.dp, DarkBlue)
                .padding(start = 10.dp)
                .height(height),
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = score,
                style = MaterialTheme.typography.body2,
                color = DarkBlue
            )
        }
        Column(
            modifier = Modifier
                .weight(3f)
                .border(1.dp, DarkBlue)
                .padding(start = 10.dp)
                .height(height),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = remark,
                style = MaterialTheme.typography.body2,
                color = DarkBlue
            )
        }
        Column(
            modifier = Modifier
                .weight(4f)
                .border(1.dp, DarkBlue)
                .padding(start = 10.dp)
                .height(height),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = date,
                style = MaterialTheme.typography.body2,
                color = DarkBlue
            )
        }
    }
}

@Composable
fun Testtest(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var score by remember {
          mutableStateOf(0)
        }
        if (score < 39){
            Text(text = "Fail", style = MaterialTheme.typography.body2)
        }else if (score in 40..48){
            Text(text = "Pass", style = MaterialTheme.typography.body2)
        }else if (score in 49..59){
            Text(text = "Credit", style = MaterialTheme.typography.body2)
        }else if (score in 60..75){
            Text(text = "Good", style = MaterialTheme.typography.body2)
        }else if (score in 76..100){
            Text(text = "Excellent", style = MaterialTheme.typography.body2)
        }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            onClick = {
                if (score < 100) {
                score = score +10
            }else{
                score = -10
            }
                      },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.White,
                contentColor = DarkBlue
            ),
            shape = RoundedCornerShape(10.dp),
            elevation = ButtonDefaults.elevation(10.dp)
        ) {
            Text(text = "Home")
        }
        Log.i(TAG, "Score: $score")

    }
}

