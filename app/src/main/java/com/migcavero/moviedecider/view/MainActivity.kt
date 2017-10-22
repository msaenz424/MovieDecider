package com.migcavero.moviedecider.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.migcavero.moviedecider.R
import com.migcavero.moviedecider.presenter.MainPresenterImpl
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.ads.InterstitialAd

class MainActivity : AppCompatActivity(), MainView {

    lateinit var mInterstitialAd: InterstitialAd
    lateinit var mMainPresenter: MainPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = resources.getString(R.string.ad_unit_id)
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        mInterstitialAd.adListener = object : AdListener(){
            override fun onAdClosed() {
                mMainPresenter.onDecideButtonClick()
            }
        }

        mMainPresenter = MainPresenterImpl(this)

        add_button.setOnClickListener {
            mMainPresenter.onAddButtonClick(movie_edit_text.text.toString())
        }

        decide_button.setOnClickListener {
            if (mInterstitialAd.isLoaded){
                mInterstitialAd.show()
            } else {
                mMainPresenter.onDecideButtonClick()
            }
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
        movie_name_text_view.text = movie
    }

}
