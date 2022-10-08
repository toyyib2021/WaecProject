package com.pktech.presentation.screens.subjects.maths.year.math2012.items

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
fun CurrentOptionMathD(
    option: String,
    essay: String
){
    when(essay){
        "" -> OptionMath(option = option)
        "2" -> OptionMath(option = option)
        "4" -> OptionMath(option = option)
        "5" -> OptionMath(option = option)
        "8" -> OptionMath(option = option)
        "9" -> OptionMath(option = option)
        "11" -> OptionMathDNo11()
        "14" -> OneWholeNumberWithFraction(wholeNumber = "D. m ≤ ", line = "-1", underline = "11")
        "16" -> OptionMathWithJustDecree(option = option)
        "18" -> OptionMath(option = option)
        "19" -> OptionMathDNo19()
        "20" -> OptionMathWithJustDecree(option = option)
        "22" -> OptionMathWithJustDecree(option = option)
        "24" -> OptionMathWithJustDecree(option = option)
        "25" -> OptionMathWithJustDecree(option = option)
        "26" -> OptionMathWithJustDecree(option = option)
        "33" -> OptionMath(option = option)
        "34" -> OneWholeNumberWithFraction(wholeNumber = "D. ", line = "4y - x", underline = "y")
        "35" -> OneWholeNumberWithFraction(wholeNumber = "D. -1", line = "1", underline = "6")
        "36" -> OptionMathWithJustDecree(option = option)
        "39" -> OneWholeNumberWithFraction(wholeNumber = "D. ", line = "12", underline = "125")
        "41" -> OptionMathWithJustDecree(option = option)
        "44" -> OptionMathWithJustDecree(option = option)
        "45" -> TextBeforeAndAfterFraction(
            beforeText = "D. -",
            line = "1",
            underline = "2",
            afterText = " ≤ x ≤ 3"
        )
        "46" -> OptionMath(option = option)
        "47" -> OptionMathWithJustDecree(option = option)
        "48" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "49" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "50" -> OptionMathWithTwoSuperScript(
            text1 = "D.  16xy(2x - 3x",
            superScriptText = "2",
            text2 = "y",
            superScriptText2 = "2",
            text3 = ")"
        )












    }

}

@Composable
private fun OptionMathDNo19(){
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )

    Text(
        text = buildAnnotatedString {
            append("C. /YZ/")
            withStyle( superScript){
                append("2")
            }
            append(" = /XZ/")
            withStyle( superScript){
                append("2")
            }
            append(" - /XY/")
            withStyle( superScript){
                append("2")
            }

        },
        color = VeryDarkGray,
        style = MaterialTheme.typography.body2
    )

}

@Composable
private fun OptionMathDNo14(){
    EquationItem(
        line = "m",
    ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
    Text(modifier = Modifier.padding(2.dp), text = " ≤ ", fontSize = MaterialTheme.typography.body2.fontSize)

    EquationItem(
        line = "-1",  underline = "11"
    ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))

}
@Composable
private fun OptionMathDNo11(){

    Row() {
        Text(modifier = Modifier.padding(2.dp),text = "p =", fontSize = MaterialTheme.typography.body2.fontSize)
        EquationItem(
            line = "2ar - rs",
            underline = "6"
        ).Show(
            fontParams = FontParams(
                fontSize = MaterialTheme.typography.body2.fontSize,

                )
        )
    }


}



