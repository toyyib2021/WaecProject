package com.pktech.presentation.screens.dashboard

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.R
import com.pktech.ui.theme.StrongBlue2
import com.pktech.ui.theme.VeryDarkGray

@Composable
fun Settings(){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        val dashboardVM: DashboardVM = hiltViewModel()
        val isLoading = dashboardVM.questionState.value.isLoading


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
                dashboardVM.deleteAllSubjectsTest()

            }) {
            Text(
                text = stringResource(R.string.update_db),
                color = Color.White,
                style = MaterialTheme.typography.body2
            )
        }
        Spacer(modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth())
        if(dashboardVM.isLoading == 2) {
            CircularProgressIndicator(
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp),
                strokeWidth = 20.dp,
                color = VeryDarkGray
            )
        }
        Log.i(TAG, "Settings: ${dashboardVM.isLoading}")
    }
}