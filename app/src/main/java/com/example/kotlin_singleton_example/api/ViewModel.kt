package com.example.kotlin_singleton_example.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.kotlin_singleton_example.model.User
import com.example.kotlin_singleton_example.repositories.Repository

class ViewModel :ViewModel(){
    private val _userId:MutableLiveData<String> = MutableLiveData<String>()

    val user:LiveData<User> =Transformations
        .switchMap(_userId){
            Repository.getUser(it)
        }

    fun setUserId(userId:String){
        if (_userId.value== userId)
            return
        _userId.value= userId
    }
    fun cancelJob(){
        Repository.cancelJobs()
    }
}