package com.example.chucknorris.screens

import com.example.chucknorris.models.JokeDto

interface JokeDetailsScreen {
    fun getJoke(id: Int) : JokeDto
}