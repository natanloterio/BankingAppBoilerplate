package br.com.natanloterio.bankingapp.presentation.ui.welcome

import br.com.natanloterio.bankingapp.presentation.base.BasePresenterInterface
import br.com.natanloterio.bankingapp.presentation.base.BaseViewInterface
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.YourBasicInformationViewModel

interface FragmentYourBasicInformationContract{


    interface View : BaseViewInterface{
        fun updateView(viewModel: YourBasicInformationViewModel)
        fun nofityStakeHolders()

    }

    interface Presenter : BasePresenterInterface {
        val view: View
        fun onClickNextField()
        fun onClickDoneField()
    }
}