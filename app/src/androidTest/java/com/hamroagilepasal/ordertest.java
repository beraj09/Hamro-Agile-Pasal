package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.Delayed;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class ordertest {
    @Rule
    public ActivityTestRule<DeliveryActivity> SigninFragmentTestRule = new ActivityTestRule<>(DeliveryActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void COD() {

        onView(withId(R.id.cod_btn)).perform(click());
    }

}


