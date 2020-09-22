package com.example.kosmos.chooseyoursign.data

import com.example.kosmos.chooseyoursign.usecase.ChooseYourSignUseCase
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface SignsServices {
    @POST("/")
    suspend fun receiveSigns(@Body chooseYourSignUseCase: ChooseYourSignUseCase): Call<ChooseYourSignUseCase>

    //estou em dúvida sobre esse método, talvez seja uma boa.
    @FormUrlEncoded
    @POST("/")
    fun receiveSigns2(@Field("sign") sign:String, @Field("day") day:String):Call<ChooseYourSignUseCase>

}