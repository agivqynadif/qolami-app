package com.test.qolami.viewnodel

import android.os.Build.VERSION_CODES.P
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.qolami.model.data.Data
import com.test.qolami.model.data.DataLoginItem
import com.test.qolami.model.data.LoginUserResponse
import com.test.qolami.model.data.NewUser
import com.test.qolami.model.network.RestfulApi
import dagger.hilt.android.lifecycle.HiltViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val Client:RestfulApi): ViewModel() {
    //Untuk Mengatur Register Response api
    private var liveDataUser: MutableLiveData<NewUser> = MutableLiveData()
    val dataPostUser : LiveData<NewUser> get() = liveDataUser
        fun registerPost(dataNewUser: Data){
            Client.postRegister(dataNewUser).enqueue(object :Callback<NewUser>{
                override fun onResponse(call: Call<NewUser>, response: Response<NewUser>) {
                    if (response.isSuccessful){
                        liveDataUser.postValue(response.body())

                    }else{
                        liveDataUser.postValue(null)
                        Log.e("Error", "onFailure: ${response.body()?.message}")
                    }
                }

                override fun onFailure(call: Call<NewUser>, t: Throwable) {
                    Log.e("Error: ", "onFailure : ${t.message}")
                }

            })
        }
    //Untuk mengatur Login Response Api
    private var liveDataLogin : MutableLiveData<LoginUserResponse> = MutableLiveData()
    val dataPostLogin : LiveData<LoginUserResponse> get() = liveDataLogin
    private val liveLoadData = MutableLiveData<Boolean>()
    fun loginPost(email:String, password:String){
        liveLoadData.value = true
        Client.postLogin(email,password).enqueue(object :Callback<LoginUserResponse>{
            override fun onResponse(call: Call<LoginUserResponse>, response: Response<LoginUserResponse>) {
                if (response.isSuccessful){
                    liveLoadData.value = false
                    liveDataLogin.postValue(response.body())
                }else{
                    liveLoadData.value = false
                    liveDataLogin.postValue(null)
                    Log.e("Error", "onFailure 1: ${response.body()?.message}")
                }
            }

            override fun onFailure(call: Call<LoginUserResponse>, t: Throwable) {
                liveDataLogin.postValue(null)
                Log.e("Error: ", "onFailure : ${t.message}")
            }

        })
    }

}