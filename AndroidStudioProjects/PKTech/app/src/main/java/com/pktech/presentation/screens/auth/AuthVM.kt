package com.pktech.presentation.screens.auth


import android.content.ContentValues.TAG
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import coil.ImageLoader
import coil.request.ErrorResult
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.pktech.utill.Constants
import com.pktech.data.local.LoginScreenKey
import com.pktech.data.local.entity.ImageDB
import com.pktech.data.repository.AllImage
import com.pktech.data.repository.AllSubjectRepo
import com.pktech.data.repository.maths.MathsAllYear
import com.pktech.domain.repository.MathRepository

import com.pktech.domain.repository.QuestionsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.isCompleted
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class AuthVM @Inject constructor(
    val repository: QuestionsRepository,
    val mathsRepositoryw: MathRepository
): ViewModel() {



    private val allImage = AllImage()
    private val mathsAllYear = MathsAllYear()
    var isLoading by mutableStateOf(1)
    var isActiveState by mutableStateOf("Active")
    var isCancelledState by mutableStateOf("Cancelled")
    var isCompletedState by mutableStateOf("Completed")


    fun addAllSubjectsAndImage(context: Context) {
      val job =  viewModelScope.launch(Dispatchers.IO) {

            try {
                isLoading = 2
                val loginScreenKey = LoginScreenKey(context = context )
                loginScreenKey.saveKey(Constants.LOGIN_KEY)
                mathsRepositoryw.deleteAll()
                repository.deleteAllImage()
                delay(5000)
                addingAllImage(context = context)
                mathsRepositoryw.addMaths(addMaths = mathsAllYear.mathsAllYear())
                isLoading = 1
            } catch (e: IOException){
                Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                isLoading = 1
                Toast.makeText(context, "no internet connection", Toast.LENGTH_SHORT).show()


            } catch (e: HttpException){
                Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                isLoading = 1
                Toast.makeText(context, "something went wrong", Toast.LENGTH_SHORT).show()

            }


        }.status()
        Log.i(TAG, "addAllSubjectsAndImage: $job")
        if (job == isCompletedState){
            isLoading = 2
        }
    }

     private fun addingAllImage(context: Context) {
        viewModelScope.launch {
            repository.addAllImage(allImage = allImage.addingAllImage(context = context))
        }

    }

    fun Job.status(): String = when{
        isActive -> isActiveState
        isCancelled -> isCancelledState
        isCompleted -> isCompletedState
        else -> ""
    }



}





