package com.example.kosmos.chooseyoursign.data.repository

import com.example.kosmos.chooseyoursign.data.Api
import com.example.kosmos.chooseyoursign.data.SignModelRequest
import com.example.kosmos.chooseyoursign.data.coroutines.AppContextProvider
import kotlinx.coroutines.withContext

class SignRepository(private val api: Api) {

    suspend fun getTheSign(sign: String, day: String): SignModelRequest =
        withContext(AppContextProvider.io){
            api.receiveSigns2(sign,day)
        }
}