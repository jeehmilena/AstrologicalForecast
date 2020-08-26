package com.example.kosmos.chooseyoursign.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kosmos.chooseyoursign.model.ChooseYourSignModel
import com.example.kosmos.chooseyoursign.usecase.ChooseYourSignUseCase

class ChooseYourSignViewModel : ViewModel() {
    private val useCase = ChooseYourSignUseCase()

    fun generateDummySigns() : List<ChooseYourSignModel> = useCase.generateDummySigns()
}