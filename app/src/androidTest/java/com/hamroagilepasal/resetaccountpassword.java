package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


public class resetaccountpassword {
    @Rule
    public ActivityTestRule<UpdateUserInfoActivity> SigninFragmentTestRule = new ActivityTestRule<>(UpdateUserInfoActivity.class);

    @Test
    public void resetpassword() {
        onView(withId(R.id.old_password)).perform(typeText("qwertyui"));
        closeSoftKeyboard();
        onView(withId(R.id.new_password)).perform(typeText("tashitest"));
        closeSoftKeyboard();
        onView(withId(R.id.confirm_new_password)).perform(typeText("tashitest"));
        closeSoftKeyboard();
        onView(withId(R.id.update_pass_btn)).perform(click());
    }
}
