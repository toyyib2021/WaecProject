package com.pktech.presentation.screens.onboarding

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintSet
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.pktech.data.repository.onBoardingRepo
import com.pktech.presentation.screens.onboarding.uiItems.OnBoardingPage
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.PKTechTheme
import com.pktech.ui.theme.Shapes
import com.pktech.ui.theme.StrongBlue2

@Composable
fun OnBoarding(){


   
}


@SuppressLint("ResourceType")
@Preview(showBackground = true)
@Composable
fun OnBoardingPreview() {
    PKTechTheme {
        OnBoarding()

    }

}