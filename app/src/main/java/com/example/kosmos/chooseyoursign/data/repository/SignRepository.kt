package com.example.kosmos.chooseyoursign.data.repository

import com.example.kosmos.chooseyoursign.data.SignModelRequest
import com.example.kosmos.chooseyoursign.data.SignsServices
import com.example.kosmos.chooseyoursign.data.coroutines.AppContextProvider
import kotlinx.coroutines.withContext
import retrofit2.Call

class SignRepository(val signsServices: SignsServices) {

    suspend fun getTheSign(sign: String, day: String): Call<SignModelRequest> =
        withContext(AppContextProvider.io){
            signsServices.receiveSigns2(sign,day)
        }
}