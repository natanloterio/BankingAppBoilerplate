package br.com.natanloterio.bankingapp.presentation.ui.welcome

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.base.BaseActivity
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewModel
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewPagerAdapter
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.ECreateAccountSteps
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.FragmentYourBasicInformation
import kotlinx.android.synthetic.main.activity_create_account.*


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

        registerFormIsDoneReceiver()
    }

    private fun registerFormIsDoneReceiver() {
        var intentFilter = IntentFilter(FragmentYourBasicInformation.FORM_IS_DONE)
        var formDoneReceiver = object : BroadcastReceiver() {
            override fun onReceive(contxt: Context?, intent: Intent?) {

                when (intent?.action) {
                    FragmentYourBasicInformation.FORM_IS_DONE -> presenter.onFormIsDone()
                }
            }
        }

        registerReceiver(formDoneReceiver, intentFilter)
    }

    override fun openMainScreen() {
        val intent = Intent(this,MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }

    override fun updateView(viewModel: CreateAccountViewModel) {
        gotoPage(viewModel.showingScreen)
        btnNextStep.setText(viewModel.nextStepStringResourceID)

        if (viewModel.navigationButtonsVisibility) {
            btnNextStep.visibility = View.VISIBLE
        } else {
            btnNextStep.visibility = View.INVISIBLE
        }
    }

    private fun gotoPage(showingScreen: ECreateAccountSteps) {
        caViewPager.setCurrentItem(showingScreen.ordinal)
    }




}