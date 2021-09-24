package it.mapo.indie.koinexample.api

import it.mapo.indie.koinexample.model.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>
}