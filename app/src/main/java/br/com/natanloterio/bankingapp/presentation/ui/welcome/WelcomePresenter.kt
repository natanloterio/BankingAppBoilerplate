package br.com.natanloterio.bankingapp.presentation.ui.welcome

class WelcomePresenter(override val view: WelcomeContract.View) : WelcomeContract.Presenter {
    override fun init() {
        view.setupViewListeners()
    }

    override fun onClickLogin() {
        view.openMainScreen()
    }

    override fun onClickCreateAccount() {
        view.openCreateAccount()
    }


}
