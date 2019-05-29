package br.com.natanloterio.bankingapp.presentation.ui.welcome

import android.content.Intent
import android.os.Bundle
import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.base.BaseActivity
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewModel
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewPagerAdapter
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.ECreateAccountSteps
import kotlinx.android.synthetic.main.activity_create_account.*
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.ECreateAccountSteps.*

class CreateAccountActivity : BaseActivity(), CreateAccountContract.View {
    lateinit var presenter: CreateAccountContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        presenter = CreateAccountPresenter(this)
        presenter.init()

        caViewPager.adapter = CreateAccountViewPagerAdapter(supportFragmentManager)
    }

    override fun initAdapters() {


    }

    override fun setupViewListeners() {
        btnNextStep.setOnClickListener { presenter.onClickNextStep() }
    }

    override fun openMainScreen() {
        val intent = Intent(this,CreateAccountActivity::class.java)
        startActivity(intent)
    }

    override fun updateView(viewModel: CreateAccountViewModel) {
        gotoPage(viewModel.showingScreen)
        btnNextStep.setText(viewModel.nextStepStringResourceID)
    }

    private fun gotoPage(showingScreen: ECreateAccountSteps) {
        caViewPager.setCurrentItem(showingScreen.ordinal)
    }


}