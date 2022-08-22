package com.pktech.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pktech.R

// Set of Material typography styles to start with
val calibri = FontFamily(
    Font(R.font.calibri_regular)
)
val Typography = Typography(
    h1 = TextStyle(
        fontFamily = calibri,
        fontWeight = FontWeight.Normal,
        fontSize = 35.sp),

    h2 = TextStyle(
    fontFamily = calibri,
    fontWeight = FontWeight.Normal,
    fontSize = 25.sp),

    body2 = TextStyle(
        fontFamily = calibri,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp),

    body1 = TextStyle(
        fontFamily = calibri,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp),

    subtitle1 = TextStyle(
        fontFamily = calibri,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)