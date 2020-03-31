package com.example.chucknorris.presenters

<<<<<<< HEAD
import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.screens.JokeListScreen
import java.util.*
=======
import com.example.chucknorris.screens.JokeListScreen
>>>>>>> dev

object JokeListPresenter : Presenter<JokeListScreen>() {
    override fun attachScreen(screen: JokeListScreen)
    {
        super.attachScreen(screen)
    }

    override fun detachScreen() {
        super.detachScreen()
    }

<<<<<<< HEAD
    fun refreshItems() : List<JokeDto>? {
        return screen?.getJokes();
=======
    fun refreshItems() {
        screen?.getJokes();
>>>>>>> dev
    }

    fun navigateToDetails(id: Int)
    {
        screen?.navigateToJokeDetails(id);
    }
}