package br.com.natanloterio.bankingapp

import br.com.natanloterio.bankingapp.presentation.ui.welcome.CreateAccountContract
import br.com.natanloterio.bankingapp.presentation.ui.welcome.CreateAccountPresenter
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class CreateAccountPresenterUnitTest {

    @Mock
    lateinit var createAccountView: CreateAccountContract.View

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
        var welcomeView2 = createAccountView
    }

    @Test
    fun call_login_screen(){

        var welcomePresenter = CreateAccountPresenter(createAccountView)

        verify(welcomePresenter).onClickLogin()
    }


}