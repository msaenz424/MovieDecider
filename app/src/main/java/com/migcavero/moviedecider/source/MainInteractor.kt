package com.migcavero.moviedecider.source

interface MainInteractor {

    /**
     * Adds a movie to a collection
     *
     * @property movie name of movie
     * @property onFinishedListener callback listener
     */
    fun addMovie(movie: String, onFinishedListener: OnFinishedListener)

    /**
     * Randomly selects a movie from a collection
     *
     * @property onFinishedListener callback listener
     */
    fun decideMovie(onFinishedListener: OnFinishedListener)

    /**
     * Callback listener
     */
    interface OnFinishedListener{

        /**
         * Callback when transaction is successful
         *
         * @property arraySize size of collection
         */
        fun onAddSuccess(arraySize: Int)

        /**
         * Callback when transaction failed due to invalid input
         */
        fun onAddFail()

        /**
         * Callback that returns name of selected movie
         *
         * @property movie name of movie
         */
        fun onDecideMovie(movie: String)

    }

}