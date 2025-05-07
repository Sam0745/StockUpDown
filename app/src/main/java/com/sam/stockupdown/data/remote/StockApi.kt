package com.sam.stockupdown.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import okhttp3.ResponseBody

interface StockApi {


    @GET("query?functions=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey") apiKey: String = API_KEY
    ): ResponseBody

    companion object{
        const val API_KEY ="YBHKPD6Q90NM45TB"
        const val BASE_URL = "https://alphavantage.co"
    }
}