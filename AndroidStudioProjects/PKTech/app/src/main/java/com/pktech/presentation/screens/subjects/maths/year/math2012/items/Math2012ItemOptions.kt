package com.pktech.presentation.screens.subjects.maths.year.math2012.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import com.vkochenkov.equationdisplayerlib.EquationItem
import com.vkochenkov.equationdisplayerlib.FontParams

@Composable
fun MathsOptions(
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
                modifier = Modifier
                    .weight(8f),
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
















