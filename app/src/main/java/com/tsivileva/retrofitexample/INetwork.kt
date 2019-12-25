package com.tsivileva.retrofitexample

import com.tsivileva.retrofitexample.Model.Channel
import com.tsivileva.retrofitexample.Model.Item
import com.tsivileva.retrofitexample.Model.MyModel
import com.tsivileva.retrofitexample.Model.Rss
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface INetwork {

    //"https://news.yandex.ru/realty.rss"
    @GET("realty.rss")
    fun loadAllData(): Call<List<Rss>>


//    @POST("posts")
//    fun uploadData(@Body item:Item)


}