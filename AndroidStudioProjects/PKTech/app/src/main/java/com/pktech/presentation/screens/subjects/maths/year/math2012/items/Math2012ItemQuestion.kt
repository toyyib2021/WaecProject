package com.pktech.presentation.screens.subjects.maths.year.math2012.items

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.pktech.R
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import com.vkochenkov.equationdisplayerlib.EquationItem
import com.vkochenkov.equationdisplayerlib.FontParams


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun CurrentQuestionMath2012(
    question: String,
    questionIndex: String,
    essay: String,
    bitmap1:@Composable () -> Unit,
    bitmap2:@Composable () -> Unit,
    bitmap3:@Composable () -> Unit,
    bitmap4:@Composable () -> Unit,
    bitmap5:@Composable () -> Unit,
    bitmap6:@Composable () -> Unit,
    bitmap7:@Composable () -> Unit,
    bitmap8:@Composable () -> Unit,
    bitmap9:@Composable () -> Unit,
    bitmap10:@Composable () -> Unit,
    bitmap11:@Composable () -> Unit,
    bitmap12:@Composable () -> Unit,
    bitmap13:@Composable () -> Unit,

){

    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        when(essay){
            "" -> MathsQuestions2012( questions = question)
            "2" -> Math2012No2(question = question)
            "4" -> Math2012No4()
            "5" -> Math2012No5()
            "8" -> Math2012No8(question = question)
            "9" -> Math2012No9(question = question)
            "11" -> Math2012No11(question = question)
            "14" -> Math2012No14(question = question)
            "16" -> MathsQuestions2012( questions = question)
            "18" -> Math2012No18()
            "19" -> MathsQuestions2012( questions = question)
            "20" -> Math2012No20()
            "22" -> Math2012No22()
            "24" -> Math2012No24()
            "25" -> MathsQuestions2012( questions = question)
            "26" -> Math2012No26()
            "33" -> Math2012No33()
            "34" -> Math2012No34()
            "35" -> Math2012No35()
            "36" -> Math2012No36()
            "39" -> Math2012No39()
            "41" -> MathsQuestions2012( questions = question)
            "44" -> Math2012No44()
            "45" -> Math2012No45()
            "46" -> Math2012No46()
            "47" -> MathsQuestions2012( questions = question)
            "48" -> Math2012No48()
            "49" -> MathsQuestions2012( questions = question)
            "50" -> Math2012No50()
        }

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp))

        ////// :::::: Images :::::::: ///////////
        when(questionIndex){
            "10" -> bitmap1()
            "18" -> bitmap2()
            "20" -> bitmap3()
            "22" -> bitmap4()
            "23" -> bitmap5()
            "26" -> bitmap6()
            "29" -> bitmap7()
            "36" -> bitmap8()
            "41" -> bitmap9()
            "42" -> bitmap10()
            "44" -> bitmap11()
            "45" -> bitmap12()
            "47" -> bitmap13()
        }

    }
}



@Composable
private fun Math2012No46(){
    val  superscript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Text(
            text = buildAnnotatedString {
                append("The graph is that of y = 2x")
                withStyle( superscript ){
                    append("2")
                }
                append(" - 5x - 3. What is the gradient of y = 2x")
                withStyle( superscript ){
                    append("2")
                }
                append(" - 5x - 3 at the point x = 4?")

            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
private fun Math2012No45(){
    val  superscript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Text(
            text = buildAnnotatedString {
                append("The graph is that of y = 2x")
                withStyle( superscript ){
                    append("2")
                }
                append(" - 5x - 3. For what value of x will y be negative?")

            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}


@Composable
private fun Math2012No26(){
    val  superscript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Text(
            text = buildAnnotatedString {
                append("The position of three ships P,Q and R at sea are illustrated in the diagram. The arrows indicated the North direction. The bearing of Q from P is 050")
                withStyle( superscript ){
                    append("0")
                }
                append(" and < PQR = 72")

                withStyle( superscript ){
                    append("0")
                }
                append(". Calculate the bearing of R and Q")

            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
private fun Math2012No48(){
    val  superscript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Text(
            text = buildAnnotatedString {
                append("The volume of a cuboid is 54cm")
                withStyle( superscript ){
                    append("3")
                }
                append(". If the length, width and height of the cuboid are in the ratio 2:1:1 respectively, find its total surface area")

            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
private fun Math2012No50(){
    val  superscript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Text(
            text = buildAnnotatedString {
                append("Factorise completely: 32x")
                withStyle( superscript ){
                    append("2")
                }
                append(" y - 48x")

                withStyle( superscript ){
                    append("3")
                }
                append(" y")
                withStyle( superscript ){
                    append("3")
                }
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}


@Composable
private fun Math2012No44() {

    Column(
        modifier = Modifier.fillMaxWidth()
        ) {
        val  superScript =  SpanStyle(
            baselineShift = BaselineShift.Superscript,
            color = VeryDarkGray,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = buildAnnotatedString {
                    append("In the diagram, |SR| = |QR|. <SRP = 65")
                    withStyle( superScript){
                        append("0")
                    }
                    append(" and <RPQ = 48")

                    withStyle( superScript){
                        append("0")
                    }
                    append(" find <PRQ")
                },
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }
    }
}


@Composable
private fun Math2012No39(){

    Column(
        modifier = Modifier.fillMaxWidth(),

        ){
        MathsQuestions2012(questions = "Solve")
        Row(modifier = Modifier.fillMaxWidth()) {
            EquationItem(
                line = "(27)",
                underline = "(125)",
                superscript = "-1/3"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = " X ", fontSize = MaterialTheme.typography.body2.fontSize)
            EquationItem(
                line = "(4)",
                underline = "(9)",
                superscript = "1/2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
        }

    }

}



@Composable
private fun Math2012No36(){
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),

    ){
        Text(
            text = buildAnnotatedString {
                append("In the diagram MN//PO, <PMN = 112")
                withStyle( superScript){
                    append("0")
                }
                append(", <PNO = 129")

                withStyle( superScript){
                    append("0")
                }
                append(", <NOP = 37")

                withStyle( superScript){
                    append("0")
                }
                append(" and <MPN = y. Find the value of y")
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}


@Composable
private fun Math2012No35(){
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        MathsQuestions2012(questions = "Find the coefficient of m in the expression of ")
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
            ) {
                Image(
                    painterResource(
                        id = R.drawable.open_brackect), contentDescription = "")
            }
            //////////// Equation Start////////////

            EquationItem(
                line = "m", underline = "2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = " - 1 ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "1",  underline = "2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))


            //////////// Equation End////////////
            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
            ) {
                Image(
                    painterResource(
                        id = R.drawable.close_brackect), contentDescription = "")
            }

            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
            ) {
                Image(
                    painterResource(
                        id = R.drawable.open_brackect), contentDescription = "")
            }
            //////////// Equation Start////////////


            EquationItem(
                line = "m"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = " + ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "2", underline = "3"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))




            //////////// Equation End////////////
            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
            ) {
                Image(
                    painterResource(
                        id = R.drawable.close_brackect), contentDescription = "")
            }

        }

    }
}

@Composable
private fun Math2012No34(){
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        MathsQuestions2012(questions = "Express ")
        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                color = Color.Black,
                text = " 3 -",
                style = MaterialTheme.typography.body2,
            )
            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                ) {
                Image(
                    painterResource(
                        id = R.drawable.open_brackect), contentDescription = "")
            }
            EquationItem(
            line = "x − y",
            underline = "y"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Row(modifier = Modifier
                .height(50.dp)
                .width(50.dp)
            ) {
                Image(
                    painterResource(
                        id = R.drawable.close_brackect), contentDescription = "")
            }

        }


        MathsQuestions2012(questions = "as a single fraction")
    }
}
@Composable
private fun Math2012No33(){
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        Row() {
            EquationItem(
                line = "If x + 0.4y = 3 and y =  ",
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            EquationItem(
                line = "1",
                underline = "2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(
                text = " x",
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }
        Text(
            text = "find the value of (x + y).",
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )



    }
}


@Composable
private fun Math2012No24(){
    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        val  superScript =  SpanStyle(
            baselineShift = BaselineShift.Superscript,
            color = VeryDarkGray,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
        )
        Text(
            text = buildAnnotatedString {
                append("If cos(x + 40)")
                withStyle( superScript){
                    append("0")
                }
                append(" = 0.0872, what is the value of x?")
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }

}


@Composable
private fun Math2012No22(){

    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        val  superScript =  SpanStyle(
            baselineShift = BaselineShift.Superscript,
            color = VeryDarkGray,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
        )
            Text(
                text = buildAnnotatedString {
                    append("In the diagram, MQ//RS, < TUV = 70")
                    withStyle( superScript){
                        append("0")
                    }
                    append(" and < RLV = 30")
                    withStyle( superScript){
                        append("0")
                    }
                    append(". Find the value of x")
                },
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }


}

@Composable
private fun Math2012No20(){

    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        val  superScript =  SpanStyle(
            baselineShift = BaselineShift.Superscript,
            color = VeryDarkGray,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = buildAnnotatedString {
                    append("In the diagram, O is a circle centre of the circle PQRS and < PSR = 86")
                    withStyle( superScript){
                        append("0")
                    }
                    append(" If < PQR = x")
                    withStyle( superScript){
                        append("0")
                    }
                    append(", find x")
                },
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }

    }
}


@Composable
private fun Math2012No18(){

    Column(
        modifier = Modifier.fillMaxWidth(),
    ){
        val  superScript =  SpanStyle(
            baselineShift = BaselineShift.Superscript,
            color = VeryDarkGray,
            fontSize = MaterialTheme.typography.subtitle1.fontSize,
        )
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = buildAnnotatedString {
                    append("In the diagram, |QR| = 10m, |SR| = 8m  < QPS = 30")
                    withStyle( superScript){
                        append("0")
                    }
                    append(", < QRP = 90")
                    withStyle( superScript){
                        append("0")
                    }
                    append(", and |PS| = x, Find x")
                },
                color = VeryDarkGray,
                style = MaterialTheme.typography.body2
            )
        }

    }
}

@Composable
private fun Math2012No14(question: String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        MathsQuestions2012(questions = question)
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {

            EquationItem(
                line = "-m", underline = "2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = " - ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "5",  underline = "4"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp),text = " ≤ ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "5m",  underline = "12"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp),text = " - ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "7",  underline = "6"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))

        }

    }
}

@Composable
private fun Math2012No2(question: String){
    
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        MathsQuestions2012(questions = question)

        EquationItem(
            line = EquationItem(
                line = listOf(
                    "(3",
                    EquationItem(
                        line = "5",
                        sqrt = 2
                    ),
                    " X 4",
                    EquationItem(
                        line = "6)",
                        sqrt = 2
                    )
                ),
                underline = EquationItem(
                    line = listOf(
                        "(2",
                        EquationItem(
                            line = "2",
                            sqrt = 2
                        ),
                        " X 3",
                        EquationItem(
                            line = "3)",
                            sqrt = 2
                        )
                    )
                ),
            )

        ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
    }

}

@Composable
private fun Math2012No4(){
    val  subScript =  SpanStyle(
        baselineShift = BaselineShift.Subscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = buildAnnotatedString {
                append("Convert 35")
                withStyle( subScript){
                    append("10")
                }
                append(" to a number base 2")
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
private fun Math2012No5(){

    val  subScript =  SpanStyle(
        baselineShift = BaselineShift.Subscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    val  superScript =  SpanStyle(
        baselineShift = BaselineShift.Superscript,
        color = VeryDarkGray,
        fontSize = MaterialTheme.typography.subtitle1.fontSize,
    )
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = buildAnnotatedString {
                append("The n")
                withStyle( superScript){
                    append("th")
                }
                append(" of a sequence is T")
                withStyle( subScript){
                    append("n")
                }
                append(" = 5 + (n-1)")
                withStyle( superScript){
                    append("2")
                }
                append(" evaluate T")
                withStyle( subScript){
                    append("4")
                }
                append(" - T")
                withStyle( subScript){
                    append("6")
                }
            },
            color = VeryDarkGray,
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
private fun Math2012No8(question: String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        MathsQuestions2012(questions = question)
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {

            EquationItem(
                line = "1", underline = "x"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = "+", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "2",  underline = "3x"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp),text = "=", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "1",  underline = "3"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))

        }

    }
}

@Composable
private fun Math2012No9(question: String){

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        MathsQuestions2012(questions = question)
        EquationItem(
            line = listOf(
              EquationItem(
                  line = "54k ",
                  superscript = "2"
              ),
                EquationItem(
                    line = "- 6",
                )
            ),
            underline = "3k + 1"
        ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))


    }
}

@Composable
private fun Math2012No11(question: String){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        MathsQuestions2012( questions = question)
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {

            Text(modifier = Modifier.padding(2.dp),text = "p =", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "3p", underline = "r"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
            Text(modifier = Modifier.padding(2.dp), text = " + ", fontSize = MaterialTheme.typography.body2.fontSize)

            EquationItem(
                line = "s",  underline = "2"
            ).Show(fontParams = FontParams(fontSize = MaterialTheme.typography.body2.fontSize))

        }

    }
}

@Composable
private fun MathsQuestions2012(questions: String){
    Column(
        modifier = Modifier.fillMaxWidth()
    ){

        Text(
            color = Color.Black,
            text = questions,
            style = MaterialTheme.typography.body2,
        )
    }

}

@Composable
 fun Maths2012QueImage(bitmap1: ImageBitmap){
    Image(bitmap1, contentDescription = "")
}









