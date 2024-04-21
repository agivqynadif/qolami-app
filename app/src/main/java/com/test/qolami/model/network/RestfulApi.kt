package com.test.qolami.model.network

import com.test.qolami.model.data.Data
import com.test.qolami.model.data.DataLoginItem
import com.test.qolami.model.data.LoginUserResponse
import com.test.qolami.model.data.NewUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RestfulApi {
    @POST("auth/register")
    fun postRegister(@Body request: Data): Call<NewUser>

    @FormUrlEncoded
    @POST("auth/login")
    fun postLogin(
        @Field("username") username: String,
        @Field("password") password: String): Call<LoginUserResponse>
}