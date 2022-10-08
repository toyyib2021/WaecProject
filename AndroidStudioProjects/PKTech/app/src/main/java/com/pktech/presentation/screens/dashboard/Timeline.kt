package com.pktech.presentation.screens.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.ui.layout.ColumnScope
import androidx.ui.layout.Table
import androidx.ui.material.Button
import androidx.ui.material.DataTable
import androidx.ui.tooling.preview.Preview
import com.pktech.R
import com.pktech.data.repository.UiRepository
import com.pktech.data.repository.Years
import com.pktech.utill.BackHandlerFun
import java.util.function.DoublePredicate


@Composable
fun Timeline(){
    Column(modifier = Modifier.fillMaxSize(),
    ) {
        val dashboardVM: DashboardVM = hiltViewModel()
        BackHandlerFun(backHandler = { dashboardVM.selectedTab  = 0 })


    }
}






@Composable
fun ColumnTable(){
    Column(modifier = Modifier.fillMaxSize(),
    ) {
        val dashboardVM: DashboardVM = hiltViewModel()
        BackHandlerFun(backHandler = { dashboardVM.selectedTab  = 0 })

        val uiRepo = UiRepository()
        val years = uiRepo.years
        LazyRow( ){
            item {
                Column() {
                    TitleColumnTableCell(text = "Column 1" )
                    TitleColumnTableCell(text = "Column 2")
                }
            }

            items(years){ years ->
                Column(Modifier.fillMaxSize()) {
                    DataColumnTableCell(text = years.id.toString())
                    DataColumnTableCell(text = years.years)
                }
            }
        }
    }
}

@Composable
fun RowScope.TableCell(
    text: String,
    weight: Float
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .weight(weight)
            .padding(8.dp)
    )
}

@Composable
fun DataColumnTableCell(
    text: String,
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .padding(8.dp)
            .width(50.dp)
    )
}


@Composable
fun TitleColumnTableCell(
    text: String
) {
    Text(
        text = text,
        Modifier
            .border(1.dp, Color.Black)
            .padding(5.dp)

    )
}




