package com.example.meetingapp.data_


import com.example.meetingapp.data.Pivot

data class User(
    val email: String,
    val id: Int,
    val name: String,
    val pivot: Pivot
)