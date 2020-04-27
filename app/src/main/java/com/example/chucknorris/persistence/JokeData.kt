package com.example.chucknorris.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import io.swagger.client.models.Joke

@Entity(tableName = "joke")
data class JokeData(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "joke") val joke: String?
)
