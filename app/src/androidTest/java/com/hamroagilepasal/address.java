package com.hamroagilepasal;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class address {
    @Rule
    public ActivityTestRule<AddAddressActivity> SigninFragmentTestRule = new ActivityTestRule<>(AddAddressActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void addaddress() {
        onView(withId(R.id.city)).perform(typeText( "kathmandu" ));
        closeSoftKeyboard();
        onView(withId(R.id.locality)).perform(typeText( "tokha" ));
        closeSoftKeyboard();
        onView(withId(R.id.flat_no)).perform(typeText( "1001" ));
        closeSoftKeyboard();
        onView(withId(R.id.pincode)).perform(typeText( "46600" ));
        closeSoftKeyboard();
        onView(withId(R.id.name)).perform(typeText( "gaurav" ));
        closeSoftKeyboard();
        onView(withId(R.id.mobile_no)).perform(typeText( "7894561230" ));
        closeSoftKeyboard();
        onView(withId(R.id.save_btn)).perform(click());
    }
}


