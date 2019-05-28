package br.com.natanloterio.bankingapp.presentation.ui.welcome

import br.com.natanloterio.bankingapp.R
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.CreateAccountViewModel
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.ECreateAccountSteps.*

class CreateAccountPresenter(override val view: CreateAccountContract.View) : CreateAccountContract.Presenter {

    lateinit var viewModel : CreateAccountViewModel

    override fun init() {

        viewModel = CreateAccountViewModel()

        viewModel.showingScreen = PRESENTATION
        viewModel.navigationButtonsVisibility = true
        viewModel.nextStepStringResourceID = R.string.next_step

        view.initAdapters()
        view.setupViewListeners()

    }

    override fun onClickLogin() {
        view.openMainScreen()
    }


    override fun onClickNextStep() {

        when(viewModel.showingScreen){
            PRESENTATION -> {viewModel.showingScreen = WHAT_YOU_WILL_HAVE}
            WHAT_YOU_WILL_HAVE -> {viewModel.showingScreen = ORIENTATIONS_BEFORE_WE_GO}
            ORIENTATIONS_BEFORE_WE_GO -> {
                viewModel.showingScreen = JUST_A_FRIENDLY_NOTE
                viewModel.nextStepStringResourceID = R.string.ok_i_understood
                }
            JUST_A_FRIENDLY_NOTE -> { viewModel.showingScreen = YOUR_BASIC_INFO}
            else -> { viewModel.showingScreen = PRESENTATION}
        }

        view.updateView(viewModel)
    }


}
