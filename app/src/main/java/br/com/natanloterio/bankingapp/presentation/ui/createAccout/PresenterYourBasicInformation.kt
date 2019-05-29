package br.com.natanloterio.bankingapp.presentation.ui.createAccout

import br.com.natanloterio.bankingapp.presentation.ui.welcome.FragmentYourBasicInformationContract
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.EYourBasicInformationFields.*

class PresenterYourBasicInformation(override val view: FragmentYourBasicInformationContract.View) : FragmentYourBasicInformationContract.Presenter {
    lateinit var viewModel : YourBasicInformationViewModel

    override fun onClickNextField() {

        when(viewModel.fieldInFocus){

            NAME -> viewModel.fieldInFocus = BIRTHDAY

            BIRTHDAY -> viewModel.fieldInFocus = PHONE

            else -> NAME

        }

        view.updateView(viewModel)
    }

    override fun init() {
        viewModel = YourBasicInformationViewModel()
        viewModel.fieldInFocus = NAME
        view.setupViewListeners()
    }

    override fun onClickDoneField() {
        viewModel.fieldCompleted = true

        view.updateView(viewModel)

        view.nofityStakeHolders()
    }


}