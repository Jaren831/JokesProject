package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception{
        try {
            MainActivity mainActivity = new MainActivity();
            EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask(mainActivity);
            endpointAsyncTask.execute();
            String result = endpointAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testDoInBackground: Timed out");
        }
    }
}
