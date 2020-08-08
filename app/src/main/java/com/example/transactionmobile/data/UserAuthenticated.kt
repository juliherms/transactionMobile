package com.example.transactionmobile.data

/**
 * Object responsible to crontrol user authenticated
 */
object UserAuthenticated {

    lateinit var user: User

    fun isUserAuthenticated() = this::user.isInitialized

    fun isUserNotAuthenticated() = !isUserAuthenticated()
}