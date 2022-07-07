package com.example.designpatterns

import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.math.BigDecimal

object SingletonImplementation {
        init
        {
            println("Singleton object invoked.")
        }
        var DataInAccess = "All Attributes accessible"


    fun operation(firstNum: Int, secondNum:Int )
    {
        println(firstNum.plus(secondNum))
        println(firstNum.minus(secondNum))
        println(firstNum * secondNum)
        println( String.format("%.3f",  firstNum.toDouble() / secondNum).toDouble())

    }


//   private var checkForInternet :Boolean = true //// Check Internet
//    private const val url ="https://pixabay.com/api/"
//    private val okHttp =OkHttpClient.Builder().addInterceptor{
//            chain ->  var request = chain.request()
//
//        request = if (checkForInternet)
//            request.newBuilder().header("Cache-Control", "public, max-age=" + 4).build()
//        else
//            request.newBuilder().header(
//                "Cache-Control",
//                "public, only-if-cached, max-stale=" + 60 * 60 * 24 * 7
//            ).build()
//        chain.proceed(request)
//    }
//
//    private val builder =Retrofit.Builder().baseUrl(url)
//        .addConverterFactory(GsonConverterFactory.create())
//        .client(okHttp.build())
//
//    private val retrofit = builder.build()
//
//    fun <T> buildService (serviceType :Class<T>):T{
//        return retrofit.create(serviceType)
//    }


}