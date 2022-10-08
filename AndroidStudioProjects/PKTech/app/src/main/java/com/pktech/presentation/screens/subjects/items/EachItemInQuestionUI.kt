package com.pktech.presentation.screens.subjects.items

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun CurrentQuestion(
    questionComposeFun: @Composable () -> Unit
//    bitmap: ImageBitmap
){

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
       questionComposeFun()

    }
}




@Composable
fun CurrentAnswer(answer: String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = answer,
            style = MaterialTheme.typography.body2,
        )
    }
}


@Composable
fun Option(
    selectedOptionDB: String,
    alphabetOption: String,
    onOptionClick: () -> Unit,
    currentOption: @Composable () -> Unit,
    emptyCorrectOption: String

    ){

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = 5.dp,
        shape = RoundedCornerShape(10.dp)

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color =
                        when (alphabetOption) {
                            emptyCorrectOption -> Color.Green
                            selectedOptionDB -> White
                            else -> {
                                Color.White
                            }
                        }
                )
                .clickable { onOptionClick() },
            verticalAlignment = Alignment.CenterVertically
        ) {

            RadioButton(
                modifier = Modifier.weight(2f),
                selected = selectedOptionDB == alphabetOption,
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.White,
                    unselectedColor = Color.Black
                ),
                onClick = { onOptionClick() }
            )

            Column(
                modifier = Modifier.weight(8f),
                verticalArrangement = Arrangement.Center
            ) {

                currentOption()


            }


//            CurrentOption(
//                option = "",
//                modifier = Modifier.weight(8f),
//                color = when(selectedOptionDB){
//                            alphabetOption -> Color.White
//                            else -> {
//                                Color.Black
//                    }
//                }
//            )


        }
    }




}

@Composable
fun CurrentOption(
    option: String,
){
        Text(
            color = Color.Black,
            text = option,
            style = MaterialTheme.typography.body2,
        )

}