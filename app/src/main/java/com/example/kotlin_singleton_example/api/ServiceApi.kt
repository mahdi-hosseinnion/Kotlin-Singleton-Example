package com.example.kotlin_singleton_example.api

import com.example.kotlin_singleton_example.model.User
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceApi {

    ///placeholder/user/1
    @GET("placeholder/user/{userId}")
    suspend fun getUser(
        @Path("userId") userId: String
    ): User
}