package com.pktech.data.repository

import com.pktech.R
import com.pktech.domain.model.OnBoardingData

fun onBoardingRepo(): List<OnBoardingData>{
    val onBoardingRepo = listOf<OnBoardingData>(
        OnBoardingData("Waec E-Study App",
                "Waec E-Study App is design to help student prepare ahead of WAEC",
            R.drawable.onboarding_screen_one
        ),
        OnBoardingData("Explore Various Studying Ways",
                "Using Waec E-Study App student can explore different method of study",
            R.drawable.onboarding_screen_two
        ),
        OnBoardingData("Let Start Studying",
                "Waec E-Study App is design to help student prepare ahead of WAEC",
            R.drawable.onboarding_screen_three
        )

    )
    return onBoardingRepo
}