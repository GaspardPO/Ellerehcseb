package eu.gaspard.ellerehcseb

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
@LargeTest
class UITest {

    @Suppress("MemberVisibilityCanPrivate") // ActivityTestRule needs to be public
    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun checkButton() {
        onView(withId(R.id.text))
            .check(matches(withText("rien")))
        onView(withId(R.id.button))
            .check(matches(withText("Button")))

        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.text))
            .check(matches(withText("lalalala")))
        onView(withId(R.id.button))
            .check(matches(withText("lalalala")))
    }

    @Test
    fun shouldFail() {
        onView(withId(R.id.text))
            .check(matches(withText("rien")))
        onView(withId(R.id.button))
            .check(matches(withText("Button")))

        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.text))
            .check(matches(withText("Nop")))
        onView(withId(R.id.button))
            .check(matches(withText("Nop")))
    }

}