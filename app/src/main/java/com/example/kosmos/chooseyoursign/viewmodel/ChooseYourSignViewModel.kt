package com.example.kosmos.chooseyoursign.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kosmos.chooseyoursign.data.BaseAcViewModel
import com.example.kosmos.chooseyoursign.data.SignModelRequest
import com.example.kosmos.chooseyoursign.data.repository.SignRepository
import com.example.kosmos.chooseyoursign.model.ChooseYourSignModel
import com.example.kosmos.chooseyoursign.usecase.ChooseYourSignUseCase
import kotlinx.coroutines.launch

class ChooseYourSignViewModel(private val repository: SignRepository, private val request: SignModelRequest) :
    BaseAcViewModel() {

    private val useCase = ChooseYourSignUseCase()

    fun generateDummySigns(): List<ChooseYourSignModel> = useCase.generateDummySigns()

    sealed class SignState {
        data class Success(val resposnse: SignModelRequest) : SignState()
        data class Error(val error: Throwable) : SignState()
        object Loading : SignState()
    }

    val signState = MutableLiveData<SignState>()

    fun getAllSign() {

        launch {
            signState.postValue(SignState.Loading)

            try {
                val signResponse = repository.getTheSign(request.sign, request.day)
                signState.postValue(SignState.Success(signResponse))
            } catch (error: Throwable) {

                signState.postValue(SignState.Error(error))
            }
        }
    }
}