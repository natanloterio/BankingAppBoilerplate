package br.com.natanloterio.bankingapp.presentation.ui.welcome

import br.com.natanloterio.bankingapp.presentation.base.BasePresenterInterface
import br.com.natanloterio.bankingapp.presentation.base.BaseViewInterface
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewModel

interface CreateAccountContract{


    interface View : BaseViewInterface{
        fun openMainScreen()
        fun initAdapters()
        fun updateView(viewModel: CreateAccountViewModel)

    }

    interface Presenter : BasePresenterInterface {
        val view: View
        fun onClickLogin()
        fun onClickNextStep()
        fun onFormIsDone()
    }
}