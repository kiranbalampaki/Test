package com.example.test;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MyInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> testRule =
            new ActivityTestRule<>(MainActivity.class);
    public String result = "10.0";

    @Test
    public void TestAddition(){
        onView(withId(R.id.etNumOne))
                .perform(typeText("6"));

        onView(withId(R.id.etNumTwo))
                .perform(typeText("4"));

        onView(withId(R.id.btnSum)).perform(click());

        onView(withId(R.id.tvResult))
                .check(matches(withText(result)));
    }
}
