package com.example.chucknorris

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.chucknorris.models.JokeDto
import com.example.chucknorris.presenters.JokeListPresenter
import com.example.chucknorris.screens.JokeListScreen

import kotlinx.android.synthetic.main.activity_main.*

class ListActivity : AppCompatActivity(), JokeListScreen {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onStart() {
        super.onStart()
        JokeListPresenter.attachScreen(this)
    }

    override fun onStop() {
        super.onStop()
        JokeListPresenter.detachScreen()
    }

    override fun getJokes(): List<JokeDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun navigateToJokeDetails(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
