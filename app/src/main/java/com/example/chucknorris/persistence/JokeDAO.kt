package com.example.chucknorris.persistence

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface JokeDAO {
    @Query("SELECT * FROM joke")
    fun getAll(): List<JokeData>

    @Insert
    fun insertAll(vararg jokes: JokeData)

    @Query("DELETE FROM joke")
    fun emptyTable()
}
