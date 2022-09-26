package com.pktech.domain.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class UiDataClass(
    val id: Int,
    val title: String,
    val des: String,
    val color: Color? = null,
    @DrawableRes val image: Int
)
