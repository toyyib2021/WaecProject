package com.pktech.presentation.screens.subjects.maths.year.math2012.items

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.pktech.ui.theme.VeryDarkGray
import com.vkochenkov.equationdisplayerlib.EquationItem
import com.vkochenkov.equationdisplayerlib.FontParams

@Composable
fun CurrentOptionMathA(
    option: String,
    essay: String
){
    when(essay){
        "" -> OptionMath(option = option)
        "2" -> OptionMath(option = option)
        "4" -> OptionMath(option = option)
        "5" -> OptionMath(option = option)
        "8" -> OptionMath(option = option)
        "9" -> OptionMathANo9()
        "11" -> OptionMathANo11()
        "14" -> OneWholeNumberWithFraction(wholeNumber = "A. m ≥ ", line = "5", underline = "4")
        "16" -> OptionMathWithJustDecree(option = option)
        "18" -> OptionMath(option = option)
        "19" -> OptionMath(option = option)
        "20" -> OptionMathWithJustDecree(option = option)
        "22" -> OptionMathWithJustDecree(option = option)
        "24" -> OptionMathWithJustDecree(option = option)
        "25" -> OptionMathWithJustDecree(option = option)
        "26" -> OptionMathWithJustDecree(option = option)
        "33" -> OneWholeNumberWithFraction(wholeNumber = "A. 1", line = "1", underline = "4")
        "34" -> OneWholeNumberWithFraction(wholeNumber = "A. ", line = "3xy", underline = "y")
        "35" -> OneWholeNumberWithFraction(wholeNumber = "A. -", line = "1", underline = "6")
        "36" -> OptionMathWithJustDecree(option = option)
        "39" -> OneWholeNumberWithFraction(wholeNumber = "A. ", line = "10", underline = "9")
        "41" -> OptionMathWithJustDecree(option = option)
        "44" -> OptionMathWithJustDecree(option = option)
        "45" -> TextBeforeAndAfterFraction(
            beforeText = "A. -",
            line = "1",
            underline = "2",
            afterText = " ≤ x < 3"
        )
        "46" -> OptionMath(option = option)
        "47" -> OptionMathWithJustDecree(option = option)
        "48" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "49" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "50" -> OptionMathWithTwoSuperScript(
            text1 = "A.  16x",
            superScriptText = "2",
            text2 = "y(2 - 3xy",
            superScriptText2 = "2",
            text3 = ")"
        )



    }


}



@Composable
fun TextBeforeAndAfterFraction(beforeText: String, line: String, underline: String, afterText: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(modifier = Modifier.padding(2.dp), text = beforeText, fontSize = MaterialTheme.typography.body2.fontSize)
        EquationItem(
            line = line,  underline = underline
        ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
        Text(modifier = Modifier.padding(2.dp), text = afterText, fontSize = MaterialTheme.typography.body2.fontSize)

    }

}

@Composable
fun OneWholeNumberWithFraction(wholeNumber: String, line: String, underline: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(modifier = Modifier.padding(2.dp), text = wholeNumber, fontSize = MaterialTheme.typography.body2.fontSize)

        EquationItem(
            line = line,  underline = underline
        ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
    }

}

@Composable
fun OptionMathWithJustDecree(option: String){
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )

        Text(
            text = buildAnnotatedString {
                append(option)
                withStyle( superScript){
                    append("0")
                }
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )

}



@Composable
fun OptionMathWithSuperScript(option: String, superScriptText: String){
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )

    Text(
        text = buildAnnotatedString {
            append(option)
            withStyle( superScript){
                append(superScriptText)
            }
        },
        color = VeryDarkGray,
        style = MaterialTheme.typography.body2
    )

}

@Composable
fun OptionMathWithTwoSuperScript(
    text1: String,
    superScriptText: String,
    text2: String,
    superScriptText2: String,
    text3: String = ""
) {
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )

    Text(
        text = buildAnnotatedString {
            append(text1)
            withStyle( superScript){
                append(superScriptText)
            }
            append(text2)
            withStyle( superScript){
                append(superScriptText2)
            }
            append(text3)
        },
        color = VeryDarkGray,
        style = MaterialTheme.typography.body2
    )

}

@Composable
private fun OptionMathANo9(){
    EquationItem(
        line = listOf(
            EquationItem(
                line = "A. 6(1 - 3k",
                superscript = "2"
            ),
            EquationItem(
                line = ")"
            )
        )
    ).Show(
        fontParams = FontParams(
            fontSize = MaterialTheme.typography.body2.fontSize,

            )
    )
}


@Composable
private fun OptionMathANo11(){

    Row() {
        Text(modifier = Modifier.padding(2.dp),text = "p =", fontSize = MaterialTheme.typography.body2.fontSize)
        EquationItem(
            line = "2a - rs",
            underline = "6"
        ).Show(
            fontParams = FontParams(
                fontSize = MaterialTheme.typography.body2.fontSize,

                )
        )
    }


}

@Composable
 fun OptionMath(option: String){
    Text(
        color = Color.Black,
        text = option,
        style = MaterialTheme.typography.body2,
    )
}