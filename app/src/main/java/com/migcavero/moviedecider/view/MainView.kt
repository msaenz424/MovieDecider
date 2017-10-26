package com.migcavero.moviedecider.view

interface MainView {

    /**
     * Clears input fields
     */
    fun clearInputFields()

    /**
     * Displays a message that movie was added
     */
    fun displayInputSuccessMessage()

    /**
     * Displays a message that input is invalid
     */
    fun displayInputErrorMessage()

    /**
     * Enables Decide button
     */
    fun enableDecideButton()

    /**
     * Disables Decide button
     */
    fun disableDecideButton()

    /**
     * Displays the output on field
     */
    fun showDecidedMovie(movie: String)
}