package com.test.qolami.model.network

import com.test.qolami.model.data.latihan.BankSoalImageResponse
import com.test.qolami.model.data.latihan.BankSoalVideoResponse
import com.test.qolami.model.data.latihan.DataSoalDhammah
import com.test.qolami.model.data.latihan.DataSoalKasrah
import com.test.qolami.model.data.score.GetScoreResponse
import com.test.qolami.model.data.score.ScoreResponse
import com.test.qolami.model.data.score.UserId
import com.test.qolami.model.data.user.*
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
    @FormUrlEncoded
    @PUT("user/reset-password/{id}")
    fun putGantiPassword(
        @Path("id") id:String,
        @Field("newPassword") newPassword: String,
        @Field("repeatNewPassword")repeatNewPassword: String
    ):Call<GantiPasswordResponse>
    @FormUrlEncoded
    @PATCH("user/profile-name/{userId}")
    fun patchUser(
        @Path("userId") userId: String,
        @Field("profileName") profileName:String
    ):Call<GantiProfileNameResponse>
    @GET("images-practice/hijaiyah")
    fun getSoalImage(): Call<BankSoalImageResponse>
    @GET("images-practice/fathah")
    fun getSoalImageFathah(): Call<BankSoalImageResponse>
    @GET("images-practice/kasrah")
    fun getSoalImageKasrah(): Call<BankSoalImageResponse>
    @GET("images-practice/dhammah")
    fun getSoalImageDhammah(): Call<BankSoalImageResponse>

    @GET("videos-practice/fathah")
    fun getSoalVideosFathah(): Call<BankSoalVideoResponse>
    @GET("videos-practice/kasrah")
    fun getSoalVideosKasrah(): Call<DataSoalKasrah>
    @GET("videos-practice/dhammah")
    fun getSoalVideosDhammah(): Call<DataSoalDhammah>
    @PATCH("user/score/{userId}")
    fun patchScore(
        @Path ("userId") userId: String,
        @Body request: com.test.qolami.model.data.score.Data
    ):Call<ScoreResponse>
    @GET("user/score/{userId}")
    fun getScore(
        @Path ("userId") userId: String
    ):Call<GetScoreResponse>
}