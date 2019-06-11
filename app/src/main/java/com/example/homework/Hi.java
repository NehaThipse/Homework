package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.homework.MainActivity.s;

public class Hi extends AppCompatActivity {

    Button button;
    TextView textViewtest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi);
        textViewtest = findViewById(R.id.testtext);
        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Hi.this, "Bye", Toast.LENGTH_SHORT).show();
                textViewtest.setText(s);
               Intent intent = new Intent(Hi.this, Bye.class);
                startActivity(intent);
            }
        });
    }
}
