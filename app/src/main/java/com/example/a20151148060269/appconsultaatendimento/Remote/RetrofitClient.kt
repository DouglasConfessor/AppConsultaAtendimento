package com.example.a20151148060269.appconsultaatendimento.Remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private var retrofit: Retrofit?=null

    fun getClient(baseUrll:String):Retrofit{
        if (retrofit==null){

            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrll)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit!!
    }
}