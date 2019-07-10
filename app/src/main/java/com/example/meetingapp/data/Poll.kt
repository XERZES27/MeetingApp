package com.example.meetingapp.data

import androidx.room.*

@Entity(tableName = "polls",
    foreignKeys = [ForeignKey(entity = Meeting::class, parentColumns = ["id"], childColumns = ["meeting_id"]), ForeignKey(entity = User::class, parentColumns = ["id"], childColumns = ["creator"])],
    indices = [Index("meeting_id")])
data class Poll (
    @PrimaryKey val id : Long,
    val question:String,
    val yes :Int,
    val no : Int,
    val status : String,
    @ColumnInfo(name = "creator_id") val creator_id : Long,
    @ColumnInfo(name = "meeting_id") val meeting_id: Long
                 )

