package com.migcavero.moviedecider.source

interface MainInteractor {

    fun addMovie(movie: String, onFinishedListener: OnFinishedListener)

    fun decideMovie(onFinishedListener: OnFinishedListener)

    interface OnFinishedListener{

        fun onAddSuccess(arraySize: Int)

        fun onAddFail()

        fun onDecideMovie(movie: String)

    }

}