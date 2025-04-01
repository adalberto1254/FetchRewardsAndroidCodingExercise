package com.example.fetchrewardsandroidcodingexcercise.model

import retrofit2.http.GET

interface ListApiService {
    @GET("hiring.json")
    suspend fun fetchListData(): List<ListItem>
}