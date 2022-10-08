package com.pktech.presentation.screens.literatures

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.vkochenkov.equationdisplayerlib.EquationItem
import com.vkochenkov.equationdisplayerlib.FontParams

@Composable
fun Literatures() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(com.pktech.R.string.literature), style = MaterialTheme.typography.h1)

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp))
        Image(painterResource(id = com.pktech.R.drawable.xhdpi), contentDescription = "")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp))
        Image(painterResource(id = com.pktech.R.drawable.mdpi), contentDescription = "")
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp))
        Math2012No2()

    }
}

@Composable
private fun Math2012No2(){

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EquationItem(
            line = EquationItem(
                line = listOf(
                    "3",
                    EquationItem(
                        line = "5",
                        sqrt = 2
                    ),
                    " X 4",
                    EquationItem(
                        line = "6",
                        sqrt = 2
                    )
                ),
                underline = EquationItem(
                    line = listOf(
                        "2",
                        EquationItem(
                            line = "2",
                            sqrt = 2
                        ),
                        " X 3",
                        EquationItem(
                            line = "3",
                            sqrt = 2
                        )
                    )
                ),
            )

        ).Show(FontParams(fontSize = MaterialTheme.typography.body2.fontSize))
    }

}
