package com.migcavero.moviedecider.source

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

    override fun decideMovie() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}