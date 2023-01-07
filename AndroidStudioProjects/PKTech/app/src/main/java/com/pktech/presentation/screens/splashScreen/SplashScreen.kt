package com.pktech.presentation.screens.splashScreen

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

import com.pktech.utill.Constants.LOGIN_KEY
import com.pktech.R
import com.pktech.data.local.LoginScreenKey
import com.pktech.navigation.screens.Screen
import com.pktech.ui.theme.Purple500
import com.pktech.ui.theme.Purple700

@Composable
fun SplashScreen(
    navController: NavHostController,
) {

    val context = LocalContext.current
    val loginScreenKey = LoginScreenKey(context)
    val getLoginScreenKey = loginScreenKey.getKey.collectAsState(initial = "")


    val degrees = remember { Animatable(0f) }

    LaunchedEffect(key1 = true) {
        degrees.animateTo(
            targetValue = 360f,
            animationSpec = tween(
                durationMillis = 1000,
                delayMillis = 200
            )
        )
        navController.popBackStack()
        if (getLoginScreenKey.value != "") {
            navController.navigate(Screen.DashBoard.route)
        } else {
            navController.navigate(Screen.SignUp.route)
        }
    }

    Splash(degrees = degrees.value)
}

@Composable
fun Splash(degrees: Float) {
    val modifier = if (isSystemInDarkTheme()) {
        Modifier.background(Color.Black)
    } else {
        Modifier.background(
            Brush.verticalGradient(listOf(Purple700, Purple500))
        )
    }
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier.rotate(degrees = degrees),
            painter = painterResource(id = R.drawable.icons_economics),
            contentDescription = "o"
        )
    }

}

@Composable
@Preview
fun SplashScreenPreview() {
    Splash(degrees = 0f)
}

@Composable
@Preview(uiMode = UI_MODE_NIGHT_YES)
fun SplashScreenDarkPreview() {
    Splash(degrees = 0f)
}