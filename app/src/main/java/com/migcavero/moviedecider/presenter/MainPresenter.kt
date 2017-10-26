package com.migcavero.moviedecider.presenter

interface MainPresenter {

    /**
     * Passes the name of the movie to its interactor
     *
     * @property movie name of movie
     */
    fun onAddButtonClick(movie: String)

    /**
     * Calls its interactor to perform deciding action
     */
    fun onDecideButtonClick()
}