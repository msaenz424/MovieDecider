package com.migcavero.moviedecider.view

interface MainView {

    fun clearInputFields()

    fun displayInputSuccessMessage()

    fun displayInputErrorMessage()

    fun enableDecideButton()

    fun disableDecideButton()

    fun showDecidedMovie(movie: String)
}