package com.pktech.presentation.screens.subjects.items

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.pktech.presentation.screens.subjects.SubjectVM
import java.text.DateFormat
import java.util.*

@Composable
fun StudyTimeline(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM
) {
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 1) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject
            val hoursOfStudy = subjectVM.hoursStudy
            val minutesOfStudy = subjectVM.minutesStudy

            subjectVM.addStudyTimeline.value.year = year
            subjectVM.addStudyTimeline.value.subject = subject
            subjectVM.addStudyTimeline.value.date = formatedDate
            subjectVM.addStudyTimeline.value.studyHours = hoursOfStudy
            subjectVM.addStudyTimeline.value.studyMinis = minutesOfStudy
            subjectVM.addStudyTimeline.value.time = formatedTime

            subjectVM.addStudyTimeline()

        }
    }
}