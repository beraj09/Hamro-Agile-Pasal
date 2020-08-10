package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class homepagetest {
    @Rule
    public ActivityTestRule<MainActivity> SigninFragmentTestRule = new ActivityTestRule<>(MainActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void homepagetest() {
        onView(withId(R.id.main_cart_icon)).perform(click());
    }
}


