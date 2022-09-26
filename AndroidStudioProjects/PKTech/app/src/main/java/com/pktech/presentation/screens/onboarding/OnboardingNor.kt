package com.pktech.presentation.screens.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState
import com.pktech.R
import com.pktech.data.repository.onBoardingRepo
import com.pktech.presentation.screens.onboarding.uiItems.OnBoardingPage
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.StrongBlue2

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnboardingNor(
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit
){
        val onBoardingRepo = onBoardingRepo()
        val pagerState = rememberPagerState(pageCount = 3)

        ConstraintLayout(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(listOf(StrongBlue2, DarkBlue))
            )
        ) {
            val (onBoardingPage, 
               signupBtn, signinBtn, 
                pageIndicator, ) = createRefs()

          
            
            HorizontalPager(
                modifier = Modifier.constrainAs(onBoardingPage) {
                    top.linkTo(parent.top)
                    bottom.linkTo(signupBtn.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }, state = pagerState
            ) { page ->
                OnBoardingPage(onBoardingData = onBoardingRepo[page])
            }

            HorizontalPagerIndicator(
                modifier = Modifier.constrainAs(pageIndicator) {
                    top.linkTo(onBoardingPage.bottom, 10.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }, pagerState = pagerState,
                activeColor = Color.White
            )

            Button(
                modifier = Modifier
                    .constrainAs(signupBtn) {
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(signinBtn.top, margin = 30.dp)

                    }
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 20.dp, end = 20.dp),
                shape = RoundedCornerShape(9.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.White),
                onClick = { onSignUpClick() }) {
                
                Text(
                    text = stringResource(id = R.string.create_an_account),
                    style = MaterialTheme.typography.body2,
                    color = StrongBlue2
                )
            }

            Text(
                modifier = Modifier.constrainAs(signinBtn){
                    bottom.linkTo(parent.bottom, margin = 30.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                    .clickable { onSignInClick() },
                text =stringResource(id = R.string.sign_in),
                style = MaterialTheme.typography.body2,
                color = Color.White

            )

        }
}

