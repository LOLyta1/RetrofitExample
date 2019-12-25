package com.tsivileva.retrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tsivileva.retrofitexample.Model.Channel
import com.tsivileva.retrofitexample.Model.MyModel
import com.tsivileva.retrofitexample.Model.Rss
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class MainActivity : AppCompatActivity(),Callback<List<Rss>> {


    override fun onResponse(call: Call<List<Rss>>, response: Response<List<Rss>>) {
        response_text_view.text=response.body().toString()
    }

    override fun onFailure(call: Call<List<Rss>>, t: Throwable) {


    }



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        send_request_button.setOnClickListener {
           MyClient().sendRequest(this)
        }

    }




}
