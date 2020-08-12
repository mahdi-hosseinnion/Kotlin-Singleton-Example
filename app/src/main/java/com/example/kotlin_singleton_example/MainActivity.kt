package com.example.kotlin_singleton_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("DEBUG: ${KotlinSingletonExample.user.toString()} ")
        println("DEBUG: ${KotlinSingletonExample.user.hashCode()} ")
    }
}