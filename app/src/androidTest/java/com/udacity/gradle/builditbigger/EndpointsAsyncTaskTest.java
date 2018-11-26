package com.udacity.gradle.builditbigger;

import android.app.Instrumentation;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.jokedisplay.JokeActivity;
import com.example.jokesource.JokeProvider;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class EndpointsAsyncTaskTest{
    String TAG = EndpointsAsyncTask.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void NoEmptyJokeTest(){
        JokeProvider jokeProvider = new JokeProvider();
        String joke = jokeProvider.getJoke();
        Assert.assertTrue(!joke.equals(" "));
        onView(withId(R.id.joke_button)).perform(click());
        onView(withId(R.id.display_text)).check(matches(isDisplayed()));

    }
    }


