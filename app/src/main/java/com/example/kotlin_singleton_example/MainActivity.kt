package com.example.kotlin_singleton_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin_singleton_example.api.ViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel:ViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel=ViewModelProvider(this).get(ViewModel::class.java)
        viewModel.setUserId("1")
        viewModel.user.observe(this, Observer {user->
            user?.let {
                println("DEBUG: $it")
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.cancelJob()
    }
}