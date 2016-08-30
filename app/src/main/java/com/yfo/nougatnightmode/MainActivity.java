package com.yfo.nougatnightmode;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent();
        i.setComponent(new ComponentName("com.android.systemui", "com.android.systemui.tuner.TunerActivity"));
        i.putExtra("show_night_mode",true);
        try {
            startActivity(i);
        }catch(ActivityNotFoundException e){
            enableTunerActivity();
        }
        finish();



    }

    private void enableTunerActivity(){
        startActivity(new Intent(this, TunerSettingActivity.class));
    }
}
