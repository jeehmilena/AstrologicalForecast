package com.example.kosmos.chooseyoursign.data

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @FormUrlEncoded
    @POST("/?")
    fun receiveSigns2(
        @Field("sign") sign:String,
        @Field("day") day:String
    ):SignModelRequest

}