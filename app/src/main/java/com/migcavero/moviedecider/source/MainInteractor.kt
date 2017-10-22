package com.migcavero.moviedecider.source

interface MainInteractor {

    fun addMovie(movie: String, onFinishedListener: OnFinishedListener)

    fun decideMovie()

    interface OnFinishedListener{

        fun onAddSuccess(arraySize: Int)

        fun onAddFail()

    }

}