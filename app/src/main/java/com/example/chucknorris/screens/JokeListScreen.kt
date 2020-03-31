package com.example.chucknorris.screens

import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.presenters.Presenter

interface JokeListScreen {
    fun getJokes() : List<JokeDto>
    fun navigateToJokeDetails(id: Int)
}