package br.com.natanloterio.bankingapp

import br.com.natanloterio.bankingapp.presentation.ui.welcome.CreateAccountContract
import br.com.natanloterio.bankingapp.presentation.ui.welcome.CreateAccountPresenter
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import br.com.natanloterio.bankingapp.presentation.ui.createAccout.ECreateAccountSteps.*
import org.junit.Assert.assertEquals

class CreateAccountPresenterUnitTest {

    @Mock
    lateinit var view: CreateAccountContract.View

    lateinit var presenter : CreateAccountPresenter

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
        resetPresenter()
    }

    private fun resetPresenter() {
        presenter = CreateAccountPresenter(view)
        presenter.init()
    }


    @Test fun first_screen_should_be_presentation(){
        assertEquals(PRESENTATION,presenter.viewModel.showingScreen)
    }


    @Test fun first_screen_should_have_next_button(){
        resetPresenter()
        assertEquals(R.string.next_step,presenter.viewModel.nextStepStringResourceID)
    }


    @Test fun second_screen_should_be_what_you_will_have(){
        resetPresenter()
        presenter.onClickNextStep()
        assertEquals(WHAT_YOU_WILL_HAVE,presenter.viewModel.showingScreen)
    }


    @Test fun second_screen_should_have_next_button(){
        resetPresenter()
        presenter.onClickNextStep()
        assertEquals(R.string.next_step,presenter.viewModel.nextStepStringResourceID)
    }


    @Test fun third_screen_should_be_orientations_before_we_go(){
        resetPresenter()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        assertEquals(ORIENTATIONS_BEFORE_WE_GO,presenter.viewModel.showingScreen)
    }


    @Test fun third_screen_should_have_next_button(){
        resetPresenter()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        assertEquals(R.string.next_step,presenter.viewModel.nextStepStringResourceID)
    }

    @Test fun fourth_screen_should_be_just_a_friendly_note(){
        resetPresenter()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        assertEquals(JUST_A_FRIENDLY_NOTE,presenter.viewModel.showingScreen)
    }


    @Test fun fourth_screen_should_have_ok_button(){
        resetPresenter()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        presenter.onClickNextStep()
        assertEquals(R.string.ok_i_understood,presenter.viewModel.nextStepStringResourceID)
    }


}