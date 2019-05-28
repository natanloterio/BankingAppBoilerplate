package br.com.natanloterio.bankingapp.presentation.ui.welcome

import android.content.Intent
import android.os.Bundle
import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.base.BaseActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity(), WelcomeContract.View {

    lateinit var presenter: WelcomeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        presenter = WelcomePresenter(this)
        presenter.init()
    }

    override fun setupViewListeners() {

        btnCreateAccount.setOnClickListener {
            presenter.onClickLogin()
        }
    }



    override fun openMainScreen() {
        val intent = Intent(this,CreateAccountActivity::class.java)
        startActivity(intent)
    }


}