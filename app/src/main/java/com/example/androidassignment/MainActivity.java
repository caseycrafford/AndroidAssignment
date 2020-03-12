package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PASS_MESSAGE="com.example.application.example.androidassignment.PASS_MESSAGE";
    String message;

    EditText messageIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.button);

        messageIn =(EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = messageIn.getText().toString();
                openMainAct2();
            }
        });
    }

    public void openMainAct2(){
        Intent intent= new Intent(this, MainActivity2.class);
        intent.putExtra(PASS_MESSAGE,message);
        startActivity(intent);
    }
}