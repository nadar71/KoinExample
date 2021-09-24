package it.mapo.indie.koinexample.repository

import it.mapo.indie.koinexample.api.GithubApi

class UserRepository(private val api: GithubApi) {
    fun getAllUsers() = api.getUsers()
}