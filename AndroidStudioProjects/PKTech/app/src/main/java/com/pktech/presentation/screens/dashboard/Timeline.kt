package com.pktech.presentation.screens.dashboard

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.compose.Context
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.getSystemService
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.ui.layout.ColumnScope
import androidx.ui.layout.Table
import androidx.ui.material.Button
import androidx.ui.material.DataTable
import androidx.ui.tooling.preview.Preview
import coil.ImageLoader
import coil.request.ImageRequest
import com.pktech.R
import com.pktech.data.local.entity.StudyTimelineData
import com.pktech.data.local.entity.TestTimelineData
import com.pktech.data.repository.UiRepository
import com.pktech.data.repository.Years
import com.pktech.ui.SubjectsObjClick
import com.pktech.ui.theme.DarkBlue
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import com.pktech.utill.BackHandlerFun
import kotlinx.coroutines.launch
import java.util.function.DoublePredicate


@SuppressLint("UnrememberedMutableState", "CoroutineCreationDuringComposition")
@Composable
fun Timeline(
    subjectsObjClick: SubjectsObjClick
){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val dashboardVM: DashboardVM = hiltViewModel()
        BackHandlerFun(backHandler = { dashboardVM.selectedTab  = 0 })
        val getAllStudyTimelineData by dashboardVM.getAllStudyTimelineData.collectAsState()
        val getAllTestTimelineData by dashboardVM.getAllTestTimelineData.collectAsState()

        val uiRepository = UiRepository()
        val allSubject = uiRepository.subject

        val context = LocalContext.current
        val scope = rememberCoroutineScope()

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            text = "Study History",
            style = MaterialTheme.typography.body2,
        )
        LazyRow( modifier = Modifier
            .fillMaxWidth()
            .weight(3f)
            .padding(start = 20.dp)){
            items(getAllStudyTimelineData){ studyTimelineData ->

                StudyEventTimeline(studyTimelineData = studyTimelineData)
            }
        }


        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            text = "Test History",
            style = MaterialTheme.typography.body2,

            )
        LazyRow( modifier = Modifier
            .fillMaxWidth()
            .weight(3f)
            .padding(start = 20.dp)){
            items(getAllTestTimelineData){ testTimelineData ->

                TestEventTimeline(testTimelineData = testTimelineData)
            }
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp),
            text = "Overall Test Result",
            style = MaterialTheme.typography.body2,

            )
        LazyRow( modifier = Modifier
            .fillMaxWidth()
            .weight(3f)
            .padding(start = 20.dp)){
            items(allSubject){ subject ->
                OverallTestTimeline(
                    subject = subject,
                    onSubjectClick = {
                        when(subject){
                            "English" -> {subjectsObjClick.onEnglishObjClick()}
                            "Mathematics" -> {subjectsObjClick.onMathematicsObjClick() }
                            "Economics" -> {subjectsObjClick.onEconomicsObjClick() }
                            "Civic Education" -> { subjectsObjClick.onCivicEducationObjClick()}
                            " Biology" -> { subjectsObjClick.onBiologyObjClick()}
                            "Commerce" -> { subjectsObjClick.onCommerceObjClick()}
                            "Accounting" -> {subjectsObjClick.onAccountingObjClick() }
                            "Physics" -> {subjectsObjClick.onPhysicsObjClick() }
                            "Agric Science" -> { subjectsObjClick.onAgricScienceObjClick()}
                            "Lit-In-Eng" -> { subjectsObjClick.onLitInEngObjClick()}
                            "Chemistry" -> { subjectsObjClick.onChemistryObjClick()}
                            "Government" -> { subjectsObjClick.onGovernmentObjClick()}
                            "Marketing" -> { subjectsObjClick.onMarketingObjClick()}
                        }
                    }
                )
            }
        }



    }
}




@Composable
fun StudyEventTimeline(studyTimelineData: StudyTimelineData){

    Card(
            modifier = Modifier
                .width(190.dp)
                .height(150.dp)
                .padding(10.dp),
            shape = RoundedCornerShape(20.dp),
            backgroundColor = DarkBlue
        ){
        Column(
            Modifier.fillMaxSize(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                shape = RoundedCornerShape(topEnd = 20.dp),
                backgroundColor = DarkBlue
            ) {
                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        shape = RoundedCornerShape(topEnd = 10.dp),
                        backgroundColor = Color.White
                    ) {
                        Text(
                            modifier = Modifier
                                .background(Color.White)
                                .padding(3.dp),
                            text = studyTimelineData.year,
                            style = MaterialTheme.typography.body2,
                            color = DarkBlue
                        )
                    }
                }
            }

            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(5f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = studyTimelineData.subject,
                    style = MaterialTheme.typography.h2,
                    color = White
                )
                Row() {
                    Text(
                        text = studyTimelineData.date,
                        style = MaterialTheme.typography.subtitle1,
                        color = White
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = studyTimelineData.time,
                        style = MaterialTheme.typography.subtitle1,
                        color = White
                    )
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(3f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "${studyTimelineData.studyHours}hr ${studyTimelineData.studyMinis}min",
                    style = MaterialTheme.typography.body2,
                    color = White
                )
            }

        }
    }

}

@Composable
fun TestEventTimeline(testTimelineData: TestTimelineData){

    Card(
        modifier = Modifier
            .width(190.dp)
            .height(150.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        backgroundColor = DarkBlue
    ){
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                shape = RoundedCornerShape(topEnd = 20.dp),
                backgroundColor = DarkBlue
            ) {
                Column(
                    modifier = Modifier.padding(5.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Card(
                        shape = RoundedCornerShape(topEnd = 10.dp),
                        backgroundColor = Color.White
                    ) {
                        Text(
                            modifier = Modifier
                                .background(Color.White)
                                .padding(3.dp),
                            text = testTimelineData.year,
                            style = MaterialTheme.typography.body2,
                            color = DarkBlue
                        )
                    }
                }
            }

            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(5f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = testTimelineData.subject,
                    style = MaterialTheme.typography.h2,
                    color = White
                )
                Row() {
                    Text(
                        text = testTimelineData.date,
                        style = MaterialTheme.typography.subtitle1,
                        color = White
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(
                        text = testTimelineData.time,
                        style = MaterialTheme.typography.subtitle1,
                        color = White
                    )
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(3f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = testTimelineData.testResult,
                    style = MaterialTheme.typography.body2,
                    color = White
                )
            }

        }
    }

}

@Composable
fun OverallTestTimeline(subject: String, onSubjectClick: () -> Unit){

    Card(
        modifier = Modifier
            .width(190.dp)
            .height(150.dp)
            .padding(10.dp)
            .clickable { onSubjectClick() },
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(5.dp, DarkBlue)
    ){
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = subject,
                    style = MaterialTheme.typography.h2,
                    color = DarkBlue
                )
                Row() {
                    Text(
                        text = "Overall Test Result",
                        style = MaterialTheme.typography.subtitle1,
                        color = DarkBlue
                    )

                }
            }

        }
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
fun DataColumnTableCell(text: String,
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





