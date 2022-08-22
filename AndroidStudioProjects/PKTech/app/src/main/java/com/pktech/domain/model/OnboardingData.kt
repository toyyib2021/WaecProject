package com.pktech.domain.model

import androidx.annotation.DrawableRes

data class OnBoardingData(
    val title: String,
    val des: String,
    @DrawableRes val image: Int
)
