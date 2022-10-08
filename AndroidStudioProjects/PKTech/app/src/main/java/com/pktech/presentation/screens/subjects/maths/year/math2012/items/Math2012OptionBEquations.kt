package com.pktech.presentation.screens.subjects.maths.year.math2012.items

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.vkochenkov.equationdisplayerlib.EquationItem
import com.vkochenkov.equationdisplayerlib.FontParams

@Composable
fun CurrentOptionMathB(
    option: String,
    essay: String
){
    when(essay){
        "" -> OptionMath(option = option)
        "2" -> OptionMath(option = option)
        "4" -> OptionMath(option = option)
        "5" -> OptionMath(option = option)
        "8" -> OptionMath(option = option)
        "9" -> OptionMathBNo9()
        "11" -> OptionMathBNo11()
        "14" -> OneWholeNumberWithFraction(wholeNumber = "B. m ≤ ", line = "5", underline = "4")
        "16" -> OptionMathWithJustDecree(option = option)
        "18" -> OptionMath(option = option)
        "19" -> OptionMath(option = option)
        "20" -> OptionMathWithJustDecree(option = option)
        "22" -> OptionMathWithJustDecree(option = option)
        "24" -> OptionMathWithJustDecree(option = option)
        "25" -> OptionMathWithJustDecree(option = option)
        "26" -> OptionMathWithJustDecree(option = option)
        "33" -> OneWholeNumberWithFraction(wholeNumber = "B. 2", line = "1", underline = "2")
        "34" -> OneWholeNumberWithFraction(wholeNumber = "B. ", line = "x - 4y", underline = "y")
        "35" -> OneWholeNumberWithFraction(wholeNumber = "B. -", line = "1", underline = "2")
        "36" -> OptionMathWithJustDecree(option = option)
        "39" -> OneWholeNumberWithFraction(wholeNumber = "B. ", line = "9", underline = "10")
        "41" -> OptionMathWithJustDecree(option = option)
        "44" -> OptionMathWithJustDecree(option = option)
        "45" -> TextBeforeAndAfterFraction(
            beforeText = "B. -",
            line = "1",
            underline = "2",
            afterText = " < x ≤ 3"
        )
        "46" -> OptionMath(option = option)
        "47" -> OptionMathWithJustDecree(option = option)
        "48" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "49" -> OptionMathWithSuperScript(option = option, superScriptText = "2")
        "50" -> OptionMathWithTwoSuperScript(
            text1 = "B.  8xy(4x - 6x",
            superScriptText = "2",
            text2 = "y",
            superScriptText2 = "2",
            text3 = ")"
        )














    }


}


@Composable
private fun OptionMathBNo14(){
    EquationItem(
        line = "m",
    ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
    Text(modifier = Modifier.padding(2.dp), text = " ≤ ", fontSize = MaterialTheme.typography.body2.fontSize)

    EquationItem(
        line = "5",  underline = "4"
    ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))

}
@Composable
private fun OptionMathBNo9(){
    EquationItem(
        line = listOf(
            EquationItem(
                line = "B. 6(3k",
                superscript = "2"
            ),
            EquationItem(
                line = " - 1)"
            )
        )
    ).Show(
        fontParams = FontParams(
            fontSize = MaterialTheme.typography.body2.fontSize,

            )
    )
}

@Composable
private fun OptionMathBNo11(){

    Text(
        color = Color.Black,
        text = "p = 2qr - sr- 3",
        style = MaterialTheme.typography.body2,
    )


}





