package com.example.chucknorris.presenters

import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.screens.JokeDetailsScreen
import com.example.chucknorris.screens.JokeListScreen

object JokeDetailsPresenter : Presenter<JokeDetailsScreen>() {
    override fun attachScreen(screen: JokeDetailsScreen)
    {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun getDetails(id: Int) : JokeDto?
    {
        return screen?.getJoke(id);
    }
}