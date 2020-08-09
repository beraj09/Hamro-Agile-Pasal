package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class forgetpasswordtest {
    @Rule
    public ActivityTestRule<RegisterActivity> SigninFragmentTestRule = new ActivityTestRule<>(RegisterActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void forgetpasswordtest() {
        onView(withId(R.id.sign_in_forgot_pass)).perform(click());
        onView(withId(R.id.forgot_pass_email)).perform(typeText( "beraj@beraj.com" ));
        closeSoftKeyboard();
        onView(withId(R.id.reset_pass_button)).perform(click());
    }
}


