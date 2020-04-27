package com.example.chucknorris.persistence

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(JokeData::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun jokeDao(): JokeDAO
}
