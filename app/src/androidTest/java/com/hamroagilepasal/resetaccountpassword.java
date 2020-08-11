package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withSpinnerText;


public class resetaccountpassword {
    @Rule
    public ActivityTestRule<UpdateUserInfoActivity> SigninFragmentTestRule = new ActivityTestRule<>(UpdateUserInfoActivity.class);

    @Test
    public void resetpassword() {


        onView(withId(R.id.email_et)).perform(typeText("tashitest@tashi.com"));
        closeSoftKeyboard();
        onView(withId(R.id.update_info_button)).perform(click());
    }
}
