package com.github.deerlive.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.github.deerlive.R;


public class MainActivity extends AppCompatActivity {


    private Button bt_anchor;
    private Button bt_watcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt_anchor = (Button) findViewById(R.id.bt_anchor); //主播
        bt_watcher = (Button) findViewById(R.id.bt_watcher);//观众
        bt_anchor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnchorActivity.class);  //跳转到主播界面
                startActivity(intent);
            }
        });
        bt_watcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,WatcherActivity.class)); //跳转到观众界面
            }
        });
    }


}
