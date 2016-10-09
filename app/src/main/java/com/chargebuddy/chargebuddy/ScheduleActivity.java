package com.chargebuddy.chargebuddy;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;

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


    public void clickTime(String timeStr) {
//        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder1 = new AlertDialog.Builder(ScheduleActivity.this);
        builder1.setMessage("Confirm reservation at\n\nMission Charging\n\nat\n\n" + timeStr);
        builder1.setCancelable(true);


        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
        TextView messageText = (TextView)alert11.findViewById(android.R.id.message);
        messageText.setGravity(Gravity.CENTER);
    }


    public void clickTen(View view) {
        clickTime("10:00 AM");
    }

    public void clickThree(View view) {
        clickTime("3:00 PM");
    }

    public void clickFour(View view) {
        clickTime("4:15 PM");
    }
}
