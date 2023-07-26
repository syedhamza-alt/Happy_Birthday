package com.example.happybirthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class birthday2_activity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday2);
        editText=(EditText) findViewById(R.id.etx1);
        editText2=(EditText) findViewById(R.id.etx2);
        btn=(Button) findViewById(R.id.button1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st1=editText.getText().toString();
                String st2=editText2.getText().toString();
                if (TextUtils.isEmpty(st1) ){
                    Toast.makeText(birthday2_activity.this,"Enter your name first", Toast.LENGTH_LONG).show();
                }
                else if (TextUtils.isEmpty(st2) ){
                    Toast.makeText(birthday2_activity.this,"Enter your age first", Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent=new Intent(birthday2_activity.this,birthday3.class);
                    intent.putExtra("Name",st1);
                    intent.putExtra("Age",st2);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}