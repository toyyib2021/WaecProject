package com.pktech.presentation.screens.auth


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.R
import com.pktech.ui.theme.*

@Composable
fun SignUpNor(
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit
) {
    val context = LocalContext.current
    val authVM : AuthVM = hiltViewModel()

    val scope =  rememberCoroutineScope()

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                brush = Brush.verticalGradient(listOf(StrongBlue2, DarkBlue))
            )
            .padding(horizontal = 20.dp)
    ) {
        var email by remember { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }


        val (iv, titleTv,
            emailEt, phoneEt,
            passwordEt, confirmPasswordEt,
            signupBt, signinTv) = createRefs()


        Image(painterResource(id = R.drawable.onboarding_screen_one),
            contentDescription = stringResource(id = R.string.onBoarding_image),
            modifier = Modifier
                .height(200.dp)
                .width(300.dp)
                .constrainAs(iv) {
                    top.linkTo(parent.top)
                    bottom.linkTo(emailEt.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Text(
            modifier = Modifier.constrainAs(titleTv) {
                top.linkTo(iv.bottom)
                bottom.linkTo(emailEt.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
            text = stringResource(id = R.string.login_your_account),
            style = MaterialTheme.typography.body2,
            color = Color.White
        )

        TextField(
            modifier = Modifier
                .constrainAs(emailEt) {
                    bottom.linkTo(phoneEt.top, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(),
            value = email,
            onValueChange = {
                email = it
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = stringResource(
                        id = R.string.icon
                    )
                )
            },
            shape = RoundedCornerShape(9.dp),
            placeholder = {
                Text(
                    text = stringResource(
                        id = R.string.email
                    )
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                textColor = VeryDarkGray,
            )


        )

        TextField(
            modifier = Modifier
                .constrainAs(phoneEt) {
                    bottom.linkTo(passwordEt.top, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(),
            value = phone,
            onValueChange = {
                phone = it
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = stringResource(
                        id = R.string.icon
                    )
                )
            },
            shape = RoundedCornerShape(9.dp),
            placeholder = {
                Text(
                    text = stringResource(
                        R.string.phone_number
                    )
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                textColor = VeryDarkGray,
            )


        )

        val passwordVisibility = remember { mutableStateOf(true) }
        TextField(
            modifier = Modifier
                .constrainAs(passwordEt) {
                    bottom.linkTo(confirmPasswordEt.top, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(),
            value = password,
            onValueChange = {
                password = it
            },
            shape = RoundedCornerShape(9.dp),
            placeholder = {
                Text(text = stringResource(id = R.string.passsword))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "emailIcon"
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility.value = !passwordVisibility.value
                }) {
                    Icon(
                        imageVector = if (passwordVisibility.value) Icons.Filled.VisibilityOff else Icons.Default.Visibility,
                        contentDescription = stringResource(id = R.string.icon),
                        tint = Color.Black
                    )
                }
            },
            visualTransformation = if (passwordVisibility.value) PasswordVisualTransformation() else VisualTransformation.None,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                textColor = VeryDarkGray,
            )

        )

        val confirmPasswordVisibility = remember { mutableStateOf(true) }
        TextField(
            modifier = Modifier
                .constrainAs(confirmPasswordEt) {
                    bottom.linkTo(signupBt.top, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth(),
            value = confirmPassword,
            onValueChange = {
                confirmPassword = it
            },
            shape = RoundedCornerShape(9.dp),
            placeholder = {
                Text(text = stringResource(R.string.confirm_passsword))
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "emailIcon"
                )
            },
            trailingIcon = {
                IconButton(onClick = {
                    confirmPasswordVisibility.value = !confirmPasswordVisibility.value
                }) {
                    Icon(
                        imageVector = if (confirmPasswordVisibility.value) Icons.Filled.VisibilityOff else Icons.Default.Visibility,
                        contentDescription = stringResource(id = R.string.icon),
                        tint = Color.Black
                    )
                }
            },
            visualTransformation = if (confirmPasswordVisibility.value) PasswordVisualTransformation() else VisualTransformation.None,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                textColor = VeryDarkGray,
            )

        )

        Button(
            modifier = Modifier
                .constrainAs(signupBt) {
                    bottom.linkTo(signinTv.top, margin = 30.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = StrongBlue2
            ),
            shape = RoundedCornerShape(9.dp),
            onClick = {
                onSignUpClick()
                authVM.addAllSubjects(context = context)


            }) {
            Text(
                text = stringResource(R.string.sign_up),
                color = Color.White,
                style = MaterialTheme.typography.body2
            )
        }

        Text(
            modifier = Modifier
                .constrainAs(signinTv) {
                    bottom.linkTo(parent.bottom, margin = 20.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .clickable { onSignInClick() },
            text = stringResource(R.string.already_have),
            style = MaterialTheme.typography.body1,
            color = Color.White,
            textAlign = TextAlign.Center,
        )

    }
}


