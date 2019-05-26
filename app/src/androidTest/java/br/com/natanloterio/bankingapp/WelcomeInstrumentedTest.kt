package br.com.natanloterio.bankingapp


import androidx.test.InstrumentationRegistry
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.RootMatchers.withDecorView
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import br.com.natanloterio.bankingapp.presentation.ui.welcome.WelcomeActivity
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.core.internal.deps.guava.collect.Iterables
import android.content.Intent
import android.provider.ContactsContract
import androidx.core.content.MimeTypeFilter.matches
import androidx.test.espresso.intent.Intents
import androidx.test.espresso.intent.Intents.*
import androidx.test.espresso.intent.matcher.ComponentNameMatchers
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import org.hamcrest.CoreMatchers
import org.hamcrest.Matchers.allOf


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

    @get:Rule
    val intentsTestRule = IntentsTestRule(WelcomeActivity::class.java)

//    @Test
//    fun useAppContext() {
//        // Context of the app under test.
//        val appContext = InstrumentationRegistry.getTargetContext()
//        assertEquals(PACKAGE, appContext.packageName)
//    }

    @Test
    fun userCanOpenLoginScreen() {
        onView(withId(R.id.btnLogin)).perform(click())

        //val receivedIntent = Iterables.getOnlyElement(Intents.getIntents())

       // onView(withId(R.id.btnLogin)).perform(click())
//        intended(allOf(
//            toPackage(PACKAGE),
//            hasType(WelcomeActivity::class),
//            hasData(ContactsContract.Contacts.CONTENT_URI)))

    }
}
