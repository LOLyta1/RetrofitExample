package com.tsivileva.retrofitexample

import com.tsivileva.retrofitexample.Model.Item
import com.tsivileva.retrofitexample.Model.MyModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface INetwork {

    //"https://news.yandex.ru/realty.rss"
    @GET("realty.rss")
    fun loadAllData(): Call<List<MyModel>>


//    @POST("posts")
//    fun uploadData(@Body item:Item)


}