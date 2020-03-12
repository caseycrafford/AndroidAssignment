package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    public static final String PASS_MESSAGE2="com.example.application.example.androidassignment.PASS_MESSAGE2";
    EditText messageIn2;
    String message2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button= (Button) findViewById(R.id.button);

        messageIn2 =(EditText) findViewById(R.id.editText);

        Intent intent= getIntent();
        final String message=intent.getStringExtra(MainActivity.PASS_MESSAGE);

        TextView textView =  (TextView) findViewById(R.id.textView2);

        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message2 = message+","+messageIn2.getText().toString();
                openMainAct3();
            }
        });
    }

    public void openMainAct3(){
        Intent intent= new Intent(this, MainActivity3.class);
        intent.putExtra(PASS_MESSAGE2,message2);
        startActivity(intent);
    }
}