package com.udacity.gradle.builditbigger;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;


@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTest{
    String TAG = EndpointsAsyncTask.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void NoEmptyJokeTest() throws ExecutionException, InterruptedException, TimeoutException {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        String joke = endpointsAsyncTask.execute(InstrumentationRegistry.getTargetContext()).get(5, TimeUnit.SECONDS);
        Assert.assertTrue(!joke.equals(""));
    }

        @Test
        public void verifyResponse() {
            onView(withId(R.id.joke_button)).perform(click());
            onView(withId(R.id.display_text)).check(matches(not(withText(""))));

    }
    }


