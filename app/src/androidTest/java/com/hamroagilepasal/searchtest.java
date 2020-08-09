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
    public ActivityTestRule<SearchActivity> SigninFragmentTestRule = new ActivityTestRule<>(SearchActivity.class);
    //    public ActivityTestRule<Activity_login> activityTestRule = new ActivityTestRule<>(Activity_login.class);
//
    @Test
    public void search() {
        onView(withId(R.id.search_view)).perform(typeText("samsung"));
        closeSoftKeyboard();
        onView(withId(R.id.search_view)).perform(click());
    }

}


