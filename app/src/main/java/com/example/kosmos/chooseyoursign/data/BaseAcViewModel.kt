package com.example.kosmos.chooseyoursign.data

import androidx.lifecycle.ViewModel
import com.example.kosmos.chooseyoursign.data.coroutines.AppContextProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseAcViewModel:ViewModel(), CoroutineScope {

    private val job = Job()
    override val coroutineContext: CoroutineContext by lazy { job + AppContextProvider.io }

    override fun onCleared() {
        job.cancel()
        super.onCleared()
    }
}