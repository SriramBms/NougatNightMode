package com.yfo.nougatnightmode;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TunerSettingActivity extends AppCompatActivity {
    private Button mTunerButton;
    private Button mNightModeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuner_setting);
        mTunerButton = (Button)findViewById(R.id.button_enable_tuner);
        mNightModeButton = (Button)findViewById(R.id.button_enable_nightmode);
        mTunerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.google.com/#q=enable+night+mode+nougat");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                /*Intent i = new Intent();
                i.putExtra("isNight", true);
                i.putExtra("amount", 0.6);
                i.setAction("android.intent.action.TWILIGHT_CHANGED");
                sendBroadcast(i);*/
            }
        });
        mNightModeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TunerSettingActivity.this, MainActivity.class));
            }
        });
    }


}
