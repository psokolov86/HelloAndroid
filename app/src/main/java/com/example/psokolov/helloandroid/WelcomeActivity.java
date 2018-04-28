package com.example.psokolov.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        //Declaration Button

        Button btnClickMe  = (Button) findViewById(R.id.GO_TO_SECOND_SCREEN);
        btnClickMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // click handling code
                startActivity(new Intent(WelcomeActivity.this, SecondActivity.class));
            }
        });
    }
}
