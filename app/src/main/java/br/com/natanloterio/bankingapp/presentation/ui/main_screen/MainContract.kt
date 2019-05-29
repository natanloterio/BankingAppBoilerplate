package br.com.natanloterio.bankingapp.presentation.ui.welcome

import br.com.natanloterio.bankingapp.presentation.base.BasePresenterInterface
import br.com.natanloterio.bankingapp.presentation.base.BaseViewInterface

interface MainContract{


    interface View : BaseViewInterface{
        fun openMainScreen()

    }

    interface Presenter : BasePresenterInterface {
        val view: View
    }
}