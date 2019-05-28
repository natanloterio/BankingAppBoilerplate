package br.com.natanloterio.bankingapp.presentation.ui.welcome

import br.com.natanloterio.bankingapp.presentation.base.BasePresenterInterface
import br.com.natanloterio.bankingapp.presentation.base.BaseViewInterface

interface CreateAccountContract{


    interface View : BaseViewInterface{
        fun openMainScreen()
        fun initAdapters()

    }

    interface Presenter : BasePresenterInterface {
        val view: View
        fun onClickLogin()
    }
}