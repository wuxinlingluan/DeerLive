package com.github.deerlive.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.deerlive.R;

public class WelcomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
      Handler    handler = new Handler()
        {
            @Override
            public void handleMessage(Message msg)
            {
                Intent ss = new Intent(WelcomActivity.this, MainActivity.class);
                startActivity(ss);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(1, 1500);
    };
}

