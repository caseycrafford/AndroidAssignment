package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        EditText messageIn;

        Intent intent= getIntent();
        final String message=intent.getStringExtra(MainActivity3.PASS_MESSAGE3);

        TextView textView =  (TextView) findViewById(R.id.finalTextView);

        textView.setText(message);
    }
}