package com.example.basicmvvm.data.api

import com.example.basicmvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers():Single<List<User>>
}