package com.example.kosmos.chooseyoursign.data

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object APIService {
    private const val BASE_URL = "https://aztro.sameerkumar.website"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        retrofit.create(Api::class.java)


    }

}