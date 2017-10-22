package com.migcavero.moviedecider.presenter

import com.migcavero.moviedecider.source.MainInteractor
import com.migcavero.moviedecider.source.MainInteractorImpl
import com.migcavero.moviedecider.view.MainView

class MainPresenterImpl constructor(mainView: MainView) : MainPresenter, MainInteractor.OnFinishedListener{

    val mMainView = mainView
    val mMainInteractor = MainInteractorImpl()

    override fun onAddButtonClick(movie: String) {
        mMainInteractor.addMovie(movie, this)
    }

    override fun onDecideButtonClick() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onAddSuccess(arraySize: Int) {
        mMainView.clearInputFields()
        mMainView.displayInputSuccessMessage()
        if (arraySize > 1) {
            mMainView.enableDecideButton()
        } else {
            mMainView.disableDecideButton()
        }
    }

    override fun onAddFail() {
        mMainView.displayInputErrorMessage()
    }

}