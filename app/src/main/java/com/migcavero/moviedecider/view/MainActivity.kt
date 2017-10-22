package com.migcavero.moviedecider.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.migcavero.moviedecider.R
import com.migcavero.moviedecider.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mMainPresenter = MainPresenterImpl(this)

        add_button.setOnClickListener {
            mMainPresenter.onAddButtonClick(movie_edit_text.text.toString())
        }
    }

    override fun clearInputFields() {
        movie_edit_text.text.clear()
    }

    override fun displayInputSuccessMessage() {
        Snackbar.make(constraint_layout, R.string.input_success_message, Snackbar.LENGTH_SHORT).show()
    }

    override fun displayInputErrorMessage() {
        Snackbar.make(constraint_layout, R.string.empty_text_error_message, Snackbar.LENGTH_SHORT).show()
    }

    override fun enableDecideButton() {
        decide_button.isEnabled = true
    }

    override fun disableDecideButton() {
        decide_button.isEnabled = false
    }

    override fun showDecidedMovie(movie: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
