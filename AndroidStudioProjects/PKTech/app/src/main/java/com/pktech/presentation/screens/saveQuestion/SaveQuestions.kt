package com.pktech.presentation.screens.saveQuestion


import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.pktech.presentation.screens.saveQuestion.items.SaveQuestionContent
import com.pktech.ui.theme.VeryDarkGray
import com.pktech.ui.theme.White
import com.pktech.R
import com.pktech.ui.theme.DarkBlue

@Composable
fun SaveQuestion() {

   Column(
       modifier = Modifier.fillMaxSize(),
    ) {
       val saveQuestionVM: SaveQuestionVM = hiltViewModel()
       val allSaveQuestion by saveQuestionVM.getAllSaveQuestion.collectAsState()

       Card(modifier = Modifier
           .fillMaxWidth()
           .padding(10.dp),
           shape = RoundedCornerShape(5.dp),
           backgroundColor = DarkBlue
       ) {
           Column(
               modifier = Modifier
                   .padding(5.dp)
                   .fillMaxWidth(),
               horizontalAlignment = Alignment.CenterHorizontally
           ) {
               Text(text ="Saved Question", style = MaterialTheme.typography.h2, color = White)
           }
       }


       if (allSaveQuestion.isEmpty()){
           Column(
               modifier = Modifier.fillMaxSize(),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally
           ) {

               Image(painter = painterResource(id = R.drawable.empty_list), contentDescription = "")
               Text(text = "You are yet to save a question", style = MaterialTheme.typography.h2)
           }

       } else{

           LazyColumn(modifier = Modifier.padding(vertical = 10.dp)
           ) {
               items(allSaveQuestion) { saveQuestion ->

                   Log.i(ContentValues.TAG, "question: ${saveQuestion.question} ")

                   SaveQuestionContent(
                       instruction = saveQuestion.instructions ,
                       questionTitle = saveQuestion.questionTitle,
                       questionIndex = saveQuestion.questionIndex,
                       CurrentQuestion = {
                           if (saveQuestion.questionUnderline != ""){
                               SaveCurrentQuestion(
                                   question = saveQuestion.question,
                                   underline = saveQuestion.questionUnderline,
                                   endLine = saveQuestion.questionEnd)
                           }else{
                               CurrentSaveQuestions(
                                   question = saveQuestion.question
                               )
                           }

                       },
                       onDeleteClick = {
                           saveQuestionVM.deleteSaveQuestionData.value = saveQuestion
                           saveQuestionVM.deleteSaveQuestion()
                       },
                       CurrentSaveAnswer = { CurrentSaveAnswer(answer = saveQuestion.answer)},
                       OptionA = { saveQuestion.optionA?.let { SaveQuestionOption(option = it) } },
                       OptionB = { saveQuestion.optionB?.let { SaveQuestionOption(option = it) } },
                       OptionC = { saveQuestion.optionC?.let { SaveQuestionOption(option = it) } },
                       OptionD = { saveQuestion.optionD?.let { SaveQuestionOption(option = it) } },
                   )
               }
           }

       }

    }
}


@Composable
fun SaveCurrentQuestion(question: String, underline: String, endLine: String){
    val  underlineSpanStyle =  SpanStyle(
        color = White,
        fontSize = MaterialTheme.typography.body2.fontSize,
        textDecoration = TextDecoration.Underline,
    )

    Text(
        text = buildAnnotatedString {
            append(question)
            withStyle( underlineSpanStyle){
                append(underline)
            }
            append(endLine)
        },
        color = White,
        style = MaterialTheme.typography.body2,
    )

}
@Composable
fun CurrentSaveQuestions(question: String){
    Text(text = question, style = MaterialTheme.typography.body2, color = White)
}

@Composable
fun CurrentSaveAnswer(answer: String){
    Text(text = answer, style = MaterialTheme.typography.body2, color = White)
}

@Composable
fun SaveQuestionOption(option: String){
    Text(text = option, style = MaterialTheme.typography.body2, color = White)
}






