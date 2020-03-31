package com.example.chucknorris.presenters

import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.screens.JokeListScreen
import java.util.*

object JokeListPresenter : Presenter<JokeListScreen>() {
    override fun attachScreen(screen: JokeListScreen)
    {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun refreshItems() : List<JokeDto>? {
        return screen?.getJokes();
    }

    fun navigateToDetails(id: Int)
    {
        screen?.navigateToJokeDetails(id);
    }
}