package com.example.a20151148060269.appconsultaatendimento.Remote

import com.example.a20151148060269.appconsultaatendimento.Model.MyPlaces
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface IGoogleAPIService {
    @GET
    fun getNearbyPlaces(@Url url:String):Call<MyPlaces>
}