package com.example.a20151148060269.appconsultaatendimento.Common

import com.example.a20151148060269.appconsultaatendimento.Remote.IGoogleAPIService
import com.example.a20151148060269.appconsultaatendimento.Remote.RetrofitClient

object Common {

    private val GOOGLE_API_URL="https://maps.googleapis.com/"

    val googleApiService:IGoogleAPIService
        get() = RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService::class.java)
}