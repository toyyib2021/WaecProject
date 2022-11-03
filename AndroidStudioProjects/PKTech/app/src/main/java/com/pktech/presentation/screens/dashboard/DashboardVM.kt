package com.pktech.presentation.screens.dashboard


import android.content.ContentValues
import android.content.ContentValues.TAG
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.data.local.entity.SaveQuestionData
import com.pktech.data.local.entity.StudyTimelineData
import com.pktech.data.local.entity.TestTimelineData
import com.pktech.data.remote.QuestionsAPI
import com.pktech.data.repository.AllImage
import com.pktech.data.repository.UiRepository
import com.pktech.domain.model.UiDataClass
import com.pktech.domain.repository.*
import com.pktech.utill.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.join
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

val homeStudyAndTest = UiRepository()

@HiltViewModel
class DashboardVM @Inject constructor(
    val repository: QuestionsRepository,
    private val api: QuestionsAPI,
    private val mathsRepositoryw: MathRepository,
    private val accountRepositoryw: AccountRepository,
    private val englishRepositoryw: EnglishRepository,
    private val economicsRepositoryw: EconomicsRepository,
    private val civicEduRepositoryw: CivicEduRepository,
    private val biologyRepositoryw: BiologyRepository,
    private val commerceRepositoryw: CommerceRepository,
    private val physicsRepositoryw: PhysicsRepository,
    private val agricultureRepositoryw: AgricultureRepository,
    private val literatureRepositoryw: LiteratureRepository,
    private val chemistryRepositoryw: ChemistryRepository,
    private val governmentRepositoryw: GovernmentRepository,
    private val studyTimelineRepository: StudyTimelineRepository,
    private val testTimelineRepository: TestTimelineRepository,
): ViewModel() {

    var studyTimelineData: List<StudyTimelineData> = listOf()
    private val _getAllStudyTimelineData = MutableStateFlow(studyTimelineData)
    val getAllStudyTimelineData: StateFlow<List<StudyTimelineData>> = _getAllStudyTimelineData.asStateFlow()



    init {
        getAllTestTimelineData()
        deleteAllSelectedOption()
        getAllStudyTimelineData()
    }

    private fun getAllStudyTimelineData(){
        viewModelScope.launch(Dispatchers.IO) {
            studyTimelineRepository.getAllStudyEvent().collect{
                _getAllStudyTimelineData.value = it
            }

        }

    }

    var testTimelineData: List<TestTimelineData> = listOf()
    private val _getAllTestTimelineData = MutableStateFlow(testTimelineData)
    val getAllTestTimelineData: StateFlow<List<TestTimelineData>> = _getAllTestTimelineData.asStateFlow()


    private fun getAllTestTimelineData(){
        viewModelScope.launch(Dispatchers.IO) {
            testTimelineRepository.getAllTestEvent().collect{
                _getAllTestTimelineData.value = it
            }

        }

    }

    var testTimelineForEachSubject: List<TestTimelineData> = listOf()
    private val _getAllTestTimelineForEachSubject = MutableStateFlow(testTimelineForEachSubject)
    val getAllTestTimelineForEachSubject: StateFlow<List<TestTimelineData>> = _getAllTestTimelineForEachSubject.asStateFlow()

    fun getAllTestTimelineForEachSubject(subject: String){
        viewModelScope.launch(Dispatchers.IO) {
            testTimelineRepository.getAllTestSubjectEvent(subject = subject).collect{
                _getAllTestTimelineForEachSubject.value = it
            }

        }

    }

    private val uiRepository = UiRepository()


    var selectedTab by mutableStateOf(0)
    var isLoading by mutableStateOf(1)

    var hours by mutableStateOf("0")

    var isActiveState by mutableStateOf("Active")
    var isCancelledState by mutableStateOf("Cancelled")
    var isCompletedState by mutableStateOf("Completed")

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    private val _questionState = mutableStateOf(AddAllSubjectState())
    val questionState: State<AddAllSubjectState> = _questionState

    private val allImage = AllImage()


    fun addAllSubjectsAndImage(context: Context)  {
        kotlin.run {
            val job =  viewModelScope.launch(Dispatchers.IO) {
                try {
                    if (isInternetAvailable(context)){
                        isLoading = 2
                        repository.deleteAllImage()
                        mathsRepositoryw.deleteAll()
                        englishRepositoryw.deleteAllEnglish()
                        accountRepositoryw.deleteAllAccount()
                        economicsRepositoryw.deleteAllEconomics()
                        civicEduRepositoryw.deleteAllCivicEdu()
                        biologyRepositoryw.deleteAllBiology()
                        commerceRepositoryw.deleteAllCommerce()
                        physicsRepositoryw.deleteAllPhysics()
                        agricultureRepositoryw.deleteAllAgriculture()
                        literatureRepositoryw.deleteAllLiterature()
                        chemistryRepositoryw.deleteAllChemistry()
                        governmentRepositoryw.deleteAllGovernment()
                        delay(5000)
                        addingAllImage(context = context)
                        mathsRepositoryw.addMaths(addMaths = api.getAllMathematics())
                        accountRepositoryw.addAccount(addMath = api.getAllAccount())
                        englishRepositoryw.addEnglish(addEnglish = api.getAllEnglish())
                        economicsRepositoryw.addEconomics(addEconomics = api.getAllEconomic())
                        civicEduRepositoryw.addCivicEdu(addCivicEdu = api.getAllCivicEducation())
                        biologyRepositoryw.addBiology(addBiology = api.getAllBiology())
                        commerceRepositoryw.addCommerce(addCommerce = api.getAllCommerce())
                        physicsRepositoryw.addPhysics(addPhysics = api.getAllPhysics())
                        agricultureRepositoryw.addAgriculture(addAgriculture = api.getAllAgriculture())
                        literatureRepositoryw.addLiterature(addLiterature = api.getAllLiterature())
                        chemistryRepositoryw.addChemistry(addChemistry = api.getAllChemistry())
                        governmentRepositoryw.addGovernment(addGovernment = api.getAllGovernment())

                    }else{
                        Log.i(TAG, "addAllSubjectsAndImage: no internet")
                    }


                } catch (e: IOException){
                    Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                    Toast.makeText(context, "no internet connection", Toast.LENGTH_SHORT).show()


                } catch (e: HttpException){
                    Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                    Toast.makeText(context, "something went wrong", Toast.LENGTH_SHORT).show()

                }

            }

            job.invokeOnCompletion {
                isLoading = 1
                Log.e("AuthVM", "throwable: $it ",)
            }
        }
        Log.e("AuthVM", "isloading: $isLoading ",)




    }


    fun Job.status(): String = when{
        isActive -> isActiveState
        isCancelled -> isCancelledState
        isCompleted -> isCompletedState
        else -> ""
    }


    private fun addingAllImage(context: Context) {
        viewModelScope.launch {
            repository.addAllImage(allImage = allImage.addingAllImage(context = context))
        }

    }

    private fun deleteAllSelectedOption() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllSelectedOption()
            delay(1000)
            repository.addEmptyOptions(emptyOptions = uiRepository.emptySelectedOptionList)

        }

    }


}

data class DashboardUiState(
    var homeStudyAndTestState: List<UiDataClass> = homeStudyAndTest.uiDataClassRepos,
    var saveQuestionAndOthers: List<UiDataClass> = homeStudyAndTest.saveQuestionAndOthers
)

data class AddAllSubjectState(
    val allSubjects: () -> Unit = {} ,
    val isLoading: Boolean = false
)


fun isInternetAvailable(context: Context): Boolean {
    var result = false
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
        val networkCapabilities = connectivityManager.activeNetwork ?: return false
        val actNw = connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false
        result = when {
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
            actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
            else -> false
        }
    } else {
        connectivityManager.run {
            connectivityManager.activeNetworkInfo?.run {
                result = when (type) {
                    ConnectivityManager.TYPE_WIFI -> true
                    ConnectivityManager.TYPE_MOBILE -> true
                    ConnectivityManager.TYPE_ETHERNET -> true
                    else -> false
                }
            }
        }
    }
    return result
}
