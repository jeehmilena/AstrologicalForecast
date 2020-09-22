package com.example.kosmos.chooseyoursign.data

import retrofit2.Retrofit

object APIService {


    private fun initRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://aztro.sameerkumar.website")
            .build()
    }

}