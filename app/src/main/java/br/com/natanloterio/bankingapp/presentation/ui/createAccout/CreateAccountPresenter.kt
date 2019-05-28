package br.com.natanloterio.bankingapp.presentation.ui.welcome

class CreateAccountPresenter(override val view: CreateAccountContract.View) : CreateAccountContract.Presenter {

    override fun init() {
        view.initAdapters()
        view.setupViewListeners()
    }


    override fun onClickLogin() {
        view.openMainScreen()
    }


}