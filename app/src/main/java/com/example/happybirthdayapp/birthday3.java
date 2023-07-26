package com.example.happybirthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class birthday3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView;
        setContentView(R.layout.activity_birthday3);
        textView=(TextView) findViewById(R.id.tv1);
        Intent intent=getIntent();
        String st3=intent.getStringExtra("Name");
        String st4=intent.getStringExtra("Age");
        textView.setText("Happy birth Day\n Dear "+st3+"\n"+"You are now "+st4);


    }
}