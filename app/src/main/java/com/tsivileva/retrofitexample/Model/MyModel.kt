package com.tsivileva.retrofitexample.Model

import org.simpleframework.xml.Element


//САЙТ https://news.yandex.ru/realty.rss
class MyModel {
       @Element(required = false,name ="myModel" )
        var myModel: MyModel? = null


        override fun toString(): String {
            return "ClassPojo [myModel = $myModel]"
        }

}