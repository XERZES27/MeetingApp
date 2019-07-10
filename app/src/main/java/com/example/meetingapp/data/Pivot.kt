package com.example.meetingapp.data


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "meeting_user")
data class Pivot(
    @SerializedName("meeting_id")
    val meetingId: Int,
    @SerializedName("user_id")
    val userId: Int
)