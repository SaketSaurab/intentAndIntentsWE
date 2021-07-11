package com.example.emailvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        view=findViewById(R.id.Homeview);
        Intent intent=getIntent();
        String data=intent.getStringExtra("email");
        view.setText(data);

    }
}