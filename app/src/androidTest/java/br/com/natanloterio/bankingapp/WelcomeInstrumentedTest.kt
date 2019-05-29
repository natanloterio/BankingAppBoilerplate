package br.com.natanloterio.bankingapp


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import br.com.natanloterio.bankingapp.presentation.ui.welcome.MainActivity
import br.com.natanloterio.bankingapp.presentation.ui.welcome.WelcomeActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class WelcomeInstrumentedTest {


    private val PACKAGE = "br.com.natanloterio.bankingapp"

    @get:Rule
    val activity = ActivityTestRule(WelcomeActivity::class.java)

    @Test
    fun userCanOpenLoginScreen() {
        onView(withId(R.id.btnLogin)).perform(click())
    }

    @Test
    fun userCanOpenCreateAccountScreen() {
        onView(withId(R.id.btnCreateAccount)).perform(click())
    }

}
