package com.example.chucknorris.presenters

import com.example.chucknorris.screens.JokeListScreen

object JokeListPresenter : Presenter<JokeListScreen>() {
    override fun attachScreen(screen: JokeListScreen)
    {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

    fun refreshItems() {
        screen?.getJokes();
    }

    fun navigateToDetails(id: Int)
    {
        screen?.navigateToJokeDetails(id);
    }
}