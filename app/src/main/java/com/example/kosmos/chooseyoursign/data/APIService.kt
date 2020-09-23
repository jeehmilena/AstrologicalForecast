package com.example.kosmos.chooseyoursign.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object APIService {


    private fun initRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://aztro.sameerkumar.website")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    val services = initRetrofit().create(SignsServices::class.java)

}