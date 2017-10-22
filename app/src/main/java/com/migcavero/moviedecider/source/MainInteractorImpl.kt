package com.migcavero.moviedecider.source

import java.util.*

class MainInteractorImpl : MainInteractor {

    val mMovieArrayList = arrayListOf<String>()

    override fun addMovie(movie: String, onFinishedListener: MainInteractor.OnFinishedListener) {
        if (!movie.isEmpty()){
            mMovieArrayList.add(movie)
            onFinishedListener.onAddSuccess(mMovieArrayList.size)
        } else {
            onFinishedListener.onAddFail()
        }
    }

    override fun decideMovie(onFinishedListener: MainInteractor.OnFinishedListener) {
        val random = Random()
        val randomMovie = random.nextInt(mMovieArrayList.count())
        onFinishedListener.onDecideMovie(mMovieArrayList[randomMovie])
    }
}