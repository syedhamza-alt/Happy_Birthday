package com.example.happybirthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Thread thread=new Thread(){
                public void run() {
                    try {
                        sleep(3000);
                        Intent intent = new Intent(MainActivity.this, birthday2_activity.class);
                        startActivity(intent);
                        finish();
                    } catch (Exception e) {

                    }
                    super.run();
                }
            };
                thread.start();
    }
}