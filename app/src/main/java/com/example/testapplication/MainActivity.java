package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonIncrementCounter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView clickerTextView = findViewById(R.id.clickerTextView);
                clickerTextView.setText(String.valueOf(counter));
                counter++;
            }
        });

        findViewById(R.id.buttonClearCounter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView clickerTextView = findViewById(R.id.clickerTextView);
                clickerTextView.setText(R.string.empty_text);
                counter = 1;
            }
        });
    }
}