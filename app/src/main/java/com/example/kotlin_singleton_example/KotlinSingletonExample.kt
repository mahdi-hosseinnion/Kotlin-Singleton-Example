package com.example.kotlin_singleton_example

import com.example.kotlin_singleton_example.model.User

object KotlinSingletonExample {

    val user:User by lazy {
        User("Yea iam ","fake","fake image")
    }
}