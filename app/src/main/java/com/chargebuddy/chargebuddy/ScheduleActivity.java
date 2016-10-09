package com.chargebuddy.chargebuddy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by henrylau on 10/8/16.
 */
public class ScheduleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_activity);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
    }

}
