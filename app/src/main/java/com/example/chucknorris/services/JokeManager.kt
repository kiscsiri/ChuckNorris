package com.example.chucknorris.services

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

class JokeManager : ContentProvider() {
    var CONTENT_URI: Uri = Uri.parse("http://api.icndb.com/jokes");

    override fun onCreate(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int {
        TODO("not needed") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
        TODO("not needed") //To change body of created functions use File | Settings | File Templates.
    }

    override fun insert(uri: Uri, values: ContentValues?): Uri? {
        TODO("not needed")
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getType(uri: Uri): String? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}