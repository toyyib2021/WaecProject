package com.pktech.presentation.screens.auth


import android.widget.Toast
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
import com.google.firebase.auth.FirebaseAuth
import com.pktech.R
import com.pktech.data.local.LoginScreenKey
import com.pktech.domain.model.ActivationPin
import com.pktech.presentation.screens.dashboard.isInternetAvailable
import com.pktech.ui.theme.*
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.pktech.utill.Constants.COMPLETE
import com.pktech.utill.Constants.LOADING
import kotlinx.coroutines.launch

@Composable
fun SignUpNor(
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit
) {
    val context = LocalContext.current
    val authVM : AuthVM = hiltViewModel()
    val loginScreenKey = LoginScreenKey(context)
    val firebaseAuth = FirebaseAuth.getInstance()
    val scope =  rememberCoroutineScope()
    val database = Firebase.database
    val myRef = database.getReference("pin")




    var loginCheck by remember { mutableStateOf("")}
    LaunchedEffect(key1 = authVM.isLoading, key2 = loginCheck){
        if(authVM.isLoading == COMPLETE && loginCheck == COMPLETE ) {
            onSignUpClick()
        }
    }

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

        val pin =  authVM.generateAlphallumeric(12)
        val activationPinDetails = ActivationPin(email, pin, phone)

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


        //* SIGN UP BUTTON *//
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
                if (isInternetAvailable(context)){
                    if(email != "" && phone != "" && password != "" && confirmPassword != ""){
                        if(password == confirmPassword){
                            authVM.isLoading = LOADING
                            firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener{
                                if (it.isSuccessful()){
                                    myRef.push().setValue(activationPinDetails)
                                    authVM.addAllSubjectsAndImage(context = context)
                                    Toast.makeText(context, "Sign up Successful", Toast.LENGTH_SHORT).show()
                                    scope.launch {
                                        loginScreenKey.saveKey(pin)
                                    }
                                    loginCheck = COMPLETE
                                }else{
                                    Toast.makeText(context, "Try Again Something went wrong", Toast.LENGTH_SHORT).show()
                                    authVM.isLoading = ""
                                }
                            }
                        } else{
                            Toast.makeText(context, "password not match", Toast.LENGTH_SHORT).show()
                        }
                    }else{
                        Toast.makeText(context, "empty fields", Toast.LENGTH_SHORT).show()
                    }

                }else{
                    Toast.makeText(context, "Check Your Internet Connection", Toast.LENGTH_SHORT).show()
                }

            }
        ) {
            when (authVM.isLoading) {
                LOADING -> {
                    Text(
                        text = stringResource(R.string.loading),
                        color = Color.White,
                        style = MaterialTheme.typography.body2
                    )
                }
                COMPLETE -> {
                    Text(
                        text = "Successful",
                        color = Color.White,
                        style = MaterialTheme.typography.body2
                    )
                }
                else -> {
                    Text(
                        text = stringResource(R.string.sign_up),
                        color = Color.White,
                        style = MaterialTheme.typography.body2
                    )

                }
            }

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


