package com.tsivileva.retrofitexample

import android.content.Context
import com.tsivileva.retrofitexample.Model.Channel
import com.tsivileva.retrofitexample.Model.MyModel
import com.tsivileva.retrofitexample.Model.Rss
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.lang.Exception

class MyClient {

  fun sendRequest(mContext: Callback<List<Rss>>){
      val mRetrofit= Retrofit.Builder().
          baseUrl("https://news.yandex.ru/").
          addConverterFactory(SimpleXmlConverterFactory.create()).
          build()

      val networkApi=mRetrofit.create(INetwork::class.java)
      try {
          val call=networkApi.loadAllData()
          call.enqueue(mContext)
      }catch (ex:Exception){
       ex.printStackTrace()
      }



  }

}