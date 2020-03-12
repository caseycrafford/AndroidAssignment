package com.example.androidassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    public static final String PASS_MESSAGE3="com.example.application.example.androidassignment.PASS_MESSAGE3";
    EditText messageIn3;
    String message3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button= (Button) findViewById(R.id.button);

        messageIn3 =(EditText) findViewById(R.id.editText);

        Intent intent= getIntent();
        final String message=intent.getStringExtra(MainActivity2.PASS_MESSAGE2);

        TextView textView =  (TextView) findViewById(R.id.textView2);

        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message3 = message+","+messageIn3.getText().toString();
                openMainAct4();
            }
        });
    }

    public void openMainAct4(){
        Intent intent= new Intent(this, MainActivity4.class);
        intent.putExtra(PASS_MESSAGE3,message3);
        startActivity(intent);
    }
}