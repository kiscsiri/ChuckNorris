package com.example.chucknorris

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.presenters.JokeDetailsPresenter
import com.example.chucknorris.presenters.JokeListPresenter
import com.example.chucknorris.screens.JokeDetailsScreen
import kotlinx.android.synthetic.main.activity_main.*

class DetailsActivity : AppCompatActivity(), JokeDetailsScreen {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onStart() {
        super.onStart()
        JokeDetailsPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        JokeDetailsPresenter.detachScreen()
    }

    override fun getJoke(id: Int): JokeDto {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
