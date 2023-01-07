package com.pktech.presentation.screens.subjects.eng

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Acct2012No48(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Cash Book")
        TwoColumnTable(colOneFirstText = "", colOneSecondText = "₦", colTwoFirstText = "", colTwoSecondText ="")
        TwoColumnTable(colOneFirstText = "Capital", colOneSecondText = "₦2,600", colTwoFirstText = "Purchases", colTwoSecondText ="₦15,000")
        TwoColumnTable(colOneFirstText = "Sale", colOneSecondText = "₦28,000", colTwoFirstText = "Rent", colTwoSecondText ="₦1,250")
        TwoColumnTable(colOneFirstText = "", colOneSecondText = "", colTwoFirstText = "Motor Vehicle", colTwoSecondText ="₦7,800")
    }

}


@Composable
fun TwoColumnTable(
    colOneFirstText: String,
    colOneSecondText: String,
    colTwoFirstText: String,
    colTwoSecondText: String
){
    Row(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier
            .weight(5f)
            .padding(start = 5.dp)
            .border(BorderStroke(1.dp, Color.Black))) {
            Column(
                modifier = Modifier
                    .weight(6f)
                    .padding(5.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = colOneFirstText, fontSize = 12.sp)
            }


            Column(modifier = Modifier
                .weight(4f)
                .padding(5.dp),
            horizontalAlignment = Alignment.End
            ) {
                Text(text = colOneSecondText, fontSize = 12.sp)
            }

        }
        Row(modifier = Modifier
            .weight(5f)
            .padding(end = 5.dp)
            .border(BorderStroke(1.dp, Color.Black))) {
            Column(
                modifier = Modifier
                    .weight(6f)
                    .padding(5.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = colTwoFirstText, fontSize = 12.sp)
            }


            Column(modifier = Modifier
                .weight(4f)
                .padding(5.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(text = colTwoSecondText, fontSize = 12.sp)
            }
        }
    }
}


