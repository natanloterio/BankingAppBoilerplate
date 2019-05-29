package br.com.natanloterio.bankingapp.presentation.ui.welcome

class MainPresenter(override val view: MainContract.View) : MainContract.Presenter {

    override fun init() {
        view.setupViewListeners()
    }


}