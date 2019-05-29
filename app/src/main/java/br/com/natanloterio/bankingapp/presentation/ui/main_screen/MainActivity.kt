package br.com.natanloterio.bankingapp.presentation.ui.welcome

import android.content.Intent
import android.os.Bundle
import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class MainActivity : BaseActivity(), MainContract.View {

    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        presenter.init()
    }

    override fun setupViewListeners() {

    }

    override fun openMainScreen() {

    }

}