package com.example.basicmvvm.data.api

class ApiHelper(private val apiService: ApiService) {
    fun getUsers()= apiService.getUsers()
}