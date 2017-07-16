package com.example.nitishsingh.bundlepassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // declaration
    Button nextActivity;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // here we are creating the main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);

        nextActivity=(Button)findViewById(R.id.button2);
        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//here we are creating the onclick method
                //here we are creating the bundle
                //for passing the data from one activity to another activity
                Bundle bundle = new Bundle();
                bundle.putString("UserName",username.getText().toString());
                bundle.putString("Password",password.getText().toString());
                //here we are using intent to show the second string
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(bundle);
                //here we are starting the activity
                startActivity(intent);

            }
        });
    }
}
