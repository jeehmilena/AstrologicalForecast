package com.example.kosmos.chooseyoursign.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kosmos.chooseyoursign.data.SignModelRequest
import com.example.kosmos.chooseyoursign.data.repository.SignRepository
import com.example.kosmos.chooseyoursign.model.ChooseYourSignModel
import com.example.kosmos.chooseyoursign.usecase.ChooseYourSignUseCase

class ChooseYourSignViewModel(val repository: SignRepository,val request : SignModelRequest) : ViewModel() {

    private val useCase = ChooseYourSignUseCase()

    fun generateDummySigns() : List<ChooseYourSignModel> = useCase.generateDummySigns()

    sealed class SignState{
        data class Success(val resposnse: SignModelRequest): SignState()
        data class Error( val error: Throwable): SignState()
        object loading: SignState()
    }

    val signState = MutableLiveData<SignState>()

    fun getAllSign(){


        //        val signResponse = repository.getTheSign(request.sign,request.day)
    }
}