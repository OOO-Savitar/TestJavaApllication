package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        findViewById(R.id.buttonSetName).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView clickerTextView = findViewById(R.id.textViewAnonimous);
                EditText editText = findViewById(R.id.editTextAnonimous);
                clickerTextView.setText("Привет, " + editText.getText());
            }
        });

        findViewById(R.id.buttonBackToMain).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}