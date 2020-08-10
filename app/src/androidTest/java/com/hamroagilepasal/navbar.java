package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class navbar {
    @Rule
    public ActivityTestRule<MainActivity> SigninFragmentTestRule = new ActivityTestRule<>(MainActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void navbar() {
        onView(withId(R.id.action_bar_logo)).perform(click());
    }

}


