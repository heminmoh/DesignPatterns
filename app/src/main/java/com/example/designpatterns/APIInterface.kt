/**
 * an interface to provide HTTP request
 *  HTTP annotation  provides the request method and relative URL
 * 2022-06-17 12:00
 */

package com.example.designpatterns


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


  interface APIInterface {

    @GET("?key=28064425-bf298584527deb9f5f55f7fe7&q=search_id&image_type=photo&pretty=true")
    fun getAffectedHitsList(@Query("q") search_id : String ) : Call<String>

}