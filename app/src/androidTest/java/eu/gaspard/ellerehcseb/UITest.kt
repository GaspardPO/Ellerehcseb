package eu.gaspard.ellerehcseb

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
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

    // TODO : dependency injection with koin
    // and mock with mockito ?

    @Test
    fun checkButton() {
       onView(withId(R.id.input_notes))
            .perform(typeText("C, E, G"))

        onView(withId(R.id.input_notes)).perform(closeSoftKeyboard())

        onView(withId(R.id.button))
            .perform(click())

        onView(withId(R.id.output_chord))
            .check(matches(withText("C")))
    }

    @Test
    fun checkButton_with_special_characters() {
        onView(withId(R.id.input_notes))
            .perform(typeText("c#g#f"))

        onView(withId(R.id.input_notes)).perform(closeSoftKeyboard())

        onView(withId(R.id.button))
            .perform(click())

        onView(withId(R.id.output_chord))
            .check(matches(withText("C#")))
    }
}