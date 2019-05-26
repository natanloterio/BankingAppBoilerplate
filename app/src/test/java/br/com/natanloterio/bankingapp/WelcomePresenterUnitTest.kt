package br.com.natanloterio.bankingapp

import android.view.View
import br.com.natanloterio.bankingapp.presentation.ui.welcome.WelcomeContract
import br.com.natanloterio.bankingapp.presentation.ui.welcome.WelcomePresenter
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class WelcomePresenterUnitTest {

    @Mock
    lateinit var welcomeView: WelcomeContract.View

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
        var welcomeView2 = welcomeView
    }

    @Test
    fun call_login_screen(){

        var welcomePresenter = WelcomePresenter(welcomeView)
        welcomePresenter.onClickLogin()
    }


}