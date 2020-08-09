package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class searchtest {
    @Rule
    public ActivityTestRule<RegisterActivity> SigninFragmentTestRule = new ActivityTestRule<>(RegisterActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void wallarttest() {
        onView(withId(R.id.search_view)).perform(typeText( "samsung" ));
        closeSoftKeyboard();
        onView(withId(R.id.search_view)).perform(click());
    }
}


