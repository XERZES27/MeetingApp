package com.example.meetingapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "polls")
data class Poll (
    @PrimaryKey val id : Long,
    val question:String,
    val yes :Int,
    val no : Int,
    val status : String,
    val creator : User,
    val meeting: Meeting
                 )