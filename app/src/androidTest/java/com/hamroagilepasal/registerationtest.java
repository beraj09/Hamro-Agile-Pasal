package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class registerationtest {
    @Rule
    public ActivityTestRule<RegisterActivity> SigninFragmentTestRule = new ActivityTestRule<>(RegisterActivity.class);

    @Test
    public void registerationtest() {
        onView(withId(R.id.sign_in_register_here)).perform(click());
        onView(withId(R.id.sign_up_email)).perform(typeText("tashi@tashi.com"));
        closeSoftKeyboard();
        onView(withId(R.id.sign_up_name)).perform(typeText("tashitest"));
        closeSoftKeyboard();
        onView(withId(R.id.sign_up_password)).perform(typeText("qwertyui"));
        closeSoftKeyboard();
        onView(withId(R.id.sign_up_confirm_password)).perform(typeText("qwertyui"));
        closeSoftKeyboard();
        onView(withId(R.id.sign_up_btn)).perform(click());
    }
}
