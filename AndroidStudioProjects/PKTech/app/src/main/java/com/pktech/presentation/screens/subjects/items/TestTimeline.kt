package com.pktech.presentation.screens.subjects.items

import android.content.ContentValues
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.pktech.data.local.entity.*
import com.pktech.data.local.utill.QuestionTitleKey
import com.pktech.presentation.screens.subjects.SubjectVM
import java.text.DateFormat
import java.util.*

@Composable
fun TestTimelineEnglish(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    english2012R: English?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (english2012R != null) {
                val correctOption2 = english2012R.english.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < english2012R.english.size) {
                    if (english2012R.english.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (english2012R != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${english2012R.english.size}"
                questionTitleKey.saveKey("${english2012R.english.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}



@Composable
fun TestTimelineAccount(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    account2012R: Account?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (account2012R != null) {
                val correctOption2 = account2012R.account.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < account2012R.account.size) {
                    if (account2012R.account.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (account2012R != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${account2012R.account.size}"
                questionTitleKey.saveKey("${account2012R.account.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineAgriculture(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    agriculture2012R: Agriculture?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (agriculture2012R != null) {
                val correctOption2 = agriculture2012R.agriculture.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < agriculture2012R.agriculture.size) {
                    if (agriculture2012R.agriculture.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (agriculture2012R != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${agriculture2012R.agriculture.size}"
                questionTitleKey.saveKey("${agriculture2012R.agriculture.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineBiology(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    biologyQuestionR: Biology?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (biologyQuestionR != null) {
                val correctOption2 = biologyQuestionR.biology.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < biologyQuestionR.biology.size) {
                    if (biologyQuestionR.biology.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (biologyQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${biologyQuestionR.biology.size}"
                questionTitleKey.saveKey("${biologyQuestionR.biology.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}

@Composable
fun TestTimelineChemistry(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    chemistryQuestionR: Chemistry?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (chemistryQuestionR != null) {
                val correctOption2 = chemistryQuestionR.chemistry.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < chemistryQuestionR.chemistry.size) {
                    if (chemistryQuestionR.chemistry.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (chemistryQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${chemistryQuestionR.chemistry.size}"
                questionTitleKey.saveKey("${chemistryQuestionR.chemistry.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineCivicEdu(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    civicEduQuestionR: CivicEdu?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (civicEduQuestionR != null) {
                val correctOption2 = civicEduQuestionR.civic.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < civicEduQuestionR.civic.size) {
                    if (civicEduQuestionR.civic.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (civicEduQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${civicEduQuestionR.civic.size}"
                questionTitleKey.saveKey("${civicEduQuestionR.civic.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineCommerce(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    commerceQuestionR: Commerce?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (commerceQuestionR != null) {
                val correctOption2 = commerceQuestionR.commerce.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < commerceQuestionR.commerce.size) {
                    if (commerceQuestionR.commerce.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (commerceQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${commerceQuestionR.commerce.size}"
                questionTitleKey.saveKey("${commerceQuestionR.commerce.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineEconomics(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    economicsQuestionR: Economics?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (economicsQuestionR != null) {
                val correctOption2 = economicsQuestionR.economics.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < economicsQuestionR.economics.size) {
                    if (economicsQuestionR.economics.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (economicsQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${economicsQuestionR.economics.size}"
                questionTitleKey.saveKey("${economicsQuestionR.economics.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineGovernment(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    governmentQuestionR: Government?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (governmentQuestionR != null) {
                val correctOption2 = governmentQuestionR.government.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < governmentQuestionR.government.size) {
                    if (governmentQuestionR.government.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (governmentQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${governmentQuestionR.government.size}"
                questionTitleKey.saveKey("${governmentQuestionR.government.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}


@Composable
fun TestTimelineLiterature(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    literatureQuestionR: Literature?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (literatureQuestionR != null) {
                val correctOption2 = literatureQuestionR.literature.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < literatureQuestionR.literature.size) {
                    if (literatureQuestionR.literature.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (literatureQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${literatureQuestionR.literature.size}"
                questionTitleKey.saveKey("${literatureQuestionR.literature.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}

@Composable
fun TestTimelinePhysics(
    resultKey: Int,
    splitListYear: String,
    splitListSubject: String,
    subjectVM: SubjectVM,
    physicsQuestionR: Physics?,
    getSelectedOptionR: List<SelectedOptionDB>?,
    finailResult: Int,
    questionTitleKey: QuestionTitleKey,
    questionRoute: String
) {
    var finailResult1 = finailResult
    LaunchedEffect(key1 = resultKey) {
        if (resultKey == 2) {
            val timeAndDate: Date = Calendar.getInstance().time
            val formatedDate = DateFormat.getDateInstance().format(timeAndDate)
            val formatedTime = DateFormat.getTimeInstance().format(timeAndDate)

            val year = splitListYear
            val subject = splitListSubject

            subjectVM.addTestTimeline.value.year = year
            subjectVM.addTestTimeline.value.subject = subject
            subjectVM.addTestTimeline.value.date = formatedDate
            subjectVM.addTestTimeline.value.time = formatedTime

            var index = 0
            if (physicsQuestionR != null) {
                val correctOption2 = physicsQuestionR.physics.get(index).objective.correctOption
                val selectedOption = getSelectedOptionR?.get(index)?.selectedOption
                while (index < physicsQuestionR.physics.size) {
                    if (physicsQuestionR.physics.get(index).objective.correctOption ==
                        getSelectedOptionR?.get(index)?.selectedOption
                    ) {
                        finailResult1++
                    }
                    index++
                }
                Log.i(ContentValues.TAG, "result: $selectedOption")
                Log.i(ContentValues.TAG, "result: $correctOption2")
                Log.i(ContentValues.TAG, "finailResult: ${finailResult1}")
                Log.i(ContentValues.TAG, "result: $index")
            }

            if (physicsQuestionR != null) {
                subjectVM.addTestTimeline.value.testResult =
                    "$finailResult1 / ${physicsQuestionR.physics.size}"
                questionTitleKey.saveKey("${physicsQuestionR.physics.size} $finailResult1 $questionRoute")

            }

            subjectVM.addTestTimeline()
        }
    }
}