package com.pktech.presentation.screens.onboarding.uiItems

import android.annotation.SuppressLint
import android.view.Gravity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pktech.R
import com.pktech.domain.model.OnBoardingData
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.PKTechTheme
import com.pktech.ui.theme.StrongBlue2

@Composable
fun OnBoardingPage(onBoardingData: OnBoardingData){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){

            Image(painterResource(id = onBoardingData.image)
                , contentDescription = stringResource(id = R.string.onBoarding_image),
                modifier = Modifier
                    .height(200.dp)
                    .width(300.dp))

            Text(text = onBoardingData.title,
                style = MaterialTheme.typography.h2,
                color = Color.White
                )

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
            )

            Text(text = onBoardingData.des,
                style = MaterialTheme.typography.body2,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 10.dp),
                color = Color.White

            )



    }






}

@SuppressLint("ResourceType")
@Preview(showBackground = true)
@Composable
fun OnBoardingPagePreview() {
    PKTechTheme {
        OnBoardingPage(onBoardingData = OnBoardingData("Let Start Studying",
            "Waec E-Study App is design to help student prepare ahead of WAEC",
            R.drawable.onboarding_screen_three))
    }

}