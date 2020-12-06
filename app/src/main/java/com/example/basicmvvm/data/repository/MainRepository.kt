package com.example.basicmvvm.data.repository

import com.example.basicmvvm.data.api.ApiHelper
import com.example.basicmvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>>{
        return apiHelper.getUsers()
    }
}