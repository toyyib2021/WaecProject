package com.pktech.presentation.screens.auth


import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pktech.utill.Constants
import com.pktech.data.local.LoginScreenKey
import com.pktech.data.remote.QuestionsAPI
import com.pktech.data.repository.AllImage
import com.pktech.domain.repository.*
import com.pktech.presentation.screens.dashboard.isInternetAvailable
import com.pktech.utill.Constants.COMPLETE
import com.pktech.utill.Constants.LOADING
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import retrofit2.HttpException
import java.io.IOException
import java.lang.StringBuilder
import java.util.*
import javax.inject.Inject

@HiltViewModel
class AuthVM @Inject constructor(
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
): ViewModel() {




    private val allImage = AllImage()
    var isLoading by mutableStateOf("")



    fun addAllSubjectsAndImage(context: Context)  {
        kotlin.run {
            val job =  viewModelScope.launch(Dispatchers.IO) {
                try {
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

                } catch (e: IOException){
                    Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                    Toast.makeText(context, "no internet connection", Toast.LENGTH_SHORT).show()


                } catch (e: HttpException){
                    Log.e("AuthVM", "deleteAllSubjectsTest: $e ", )
                    Toast.makeText(context, "something went wrong", Toast.LENGTH_SHORT).show()

                }

            }

            job.invokeOnCompletion {
                isLoading = COMPLETE
                Log.e("AuthVM", "throwable: $it ",)
            }
        }
        Log.e("AuthVM", "isloading: $isLoading ",)




    }

    private fun addingAllImage(context: Context) {
        viewModelScope.launch {
            repository.addAllImage(allImage = allImage.addingAllImage(context = context))
        }

    }

    fun generateAlphallumeric(length: Int): String {
        val LETTERS = "abcdefghijklmnopqrstuwaxyz"
        val NUMBER = "0123456789"
        val ALPHAIRMERIC =
            (LETTERS + LETTERS.uppercase(Locale.getDefault()) + NUMBER).toCharArray()
        val result = StringBuilder()
        for (i in 0 until length) {
            result.append(ALPHAIRMERIC[java.util.Random().nextInt(ALPHAIRMERIC.size)])
        }
        return result.toString()
    }

}





