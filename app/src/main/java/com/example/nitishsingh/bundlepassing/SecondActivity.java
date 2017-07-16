package com.example.nitishsingh.bundlepassing;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {// here we are creating the second activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {// here we are creating the on create method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //here we are creating the string
        String message;
        Intent i=getIntent();
        Bundle bundle = i.getExtras();

        String userName=bundle.getString("UserName");
        String password=bundle.getString("Password");

        message="Welcome Username:"+userName;//here we are creating the message
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}

