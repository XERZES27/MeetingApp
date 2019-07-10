package com.example.meetingapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "messages")
data class Message(@PrimaryKey(autoGenerate = true) val id :Long,
                   val body:String,
                   @ColumnInfo(name = "meeting_id") val meeting: Meeting,
                   val sender:User
)