package com.test.qolami.model.network

import com.test.qolami.model.data.latihan.BankSoalImageResponse
import com.test.qolami.model.data.latihan.DataXX
import com.test.qolami.model.data.latihan.LatihanHijaiyah
import com.test.qolami.model.data.user.Data
import com.test.qolami.model.data.user.LoginUserResponse
import com.test.qolami.model.data.user.LupaPasswordResponse
import com.test.qolami.model.data.user.NewUser
import retrofit2.Call
import retrofit2.http.*

interface RestfulApi {
    @POST("auth/register")
    fun postRegister(@Body request: Data): Call<NewUser>

    @FormUrlEncoded
    @POST("auth/login")
    fun postLogin(
        @Field("username") username: String,
        @Field("password") password: String): Call<LoginUserResponse>

    @FormUrlEncoded
    @PUT("auth/forgot-password")
    fun putLupaPassword(
        @Field("username") username: String,
        @Field("newPassword") newPassword:String,
        @Field("repeatNewPassword") repeatNewPassword:String
    ): Call<LupaPasswordResponse>

    @GET("images-practice/hijaiyah")
    fun getSoalImage(): Call<BankSoalImageResponse>
}