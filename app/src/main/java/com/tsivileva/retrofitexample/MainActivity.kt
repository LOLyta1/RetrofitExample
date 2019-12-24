package com.tsivileva.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsivileva.retrofitexample.Model.MyModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class MainActivity : AppCompatActivity(),Callback<List<MyModel>> {
    override fun onFailure(call: Call<List<MyModel>>, t: Throwable) {

    }

    override fun onResponse(call: Call<List<MyModel>>, response: Response<List<MyModel>>) {
       
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var mRetrofit=Retrofit.Builder().
                        baseUrl("https://news.yandex.ru/").
                        addConverterFactory(SimpleXmlConverterFactory.create()).
                        build()


        val networkApi=mRetrofit.create(INetwork::class.java)



    }




}
