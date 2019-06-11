package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    public static String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  s =editText.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Hi , " +s, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this , Hi.class);
                startActivity( intent);
            }
        });
    }
}
