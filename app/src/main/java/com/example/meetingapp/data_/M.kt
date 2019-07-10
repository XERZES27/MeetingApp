package com.example.meetingapp.data_


import com.google.gson.annotations.SerializedName

data class M(
    val description: String,
    val id: Int,
    val title: String,
    val users: List<User>
)