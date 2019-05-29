package br.com.natanloterio.bankingapp


import android.app.Application
import android.content.Context
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import br.com.natanloterio.bankingapp.presentation.ui.welcome.CreateAccountActivity
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class CreateNewAccountInstrumentedTest {


    private val PACKAGE = "br.com.natanloterio.bankingapp"

    @get:Rule
    val activity = ActivityTestRule(CreateAccountActivity::class.java)

    var _context: Context? = null

    @Before fun setup(){
    }

    @Test fun userCanClickOnNextButton() {
        onView(withId(R.id.btnNextStep)).perform(click())
    }

    @Test fun first_screen_should_have_next_button(){
        onView(withId(R.id.btnNextStep)).check(matches(withText(R.string.next_step)))
    }

    @Test fun second_screen_should_have_next_button(){
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).check(matches(withText(R.string.next_step)))
    }

    @Test fun third_screen_should_have_next_button(){
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).check(matches(withText(R.string.next_step)))
    }

    @Test fun fourth_screen_should_have_next_button(){
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).perform(click())
        onView(withId(R.id.btnNextStep)).check(matches(withText(R.string.ok_i_understood)))
    }

}
