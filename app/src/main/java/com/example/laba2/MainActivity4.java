package com.example.laba2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button dynamicButton = findViewById(R.id.Button);

        dynamicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dynamicButton.setBackgroundColor(getResources().getColor(R.color.light_green));
            }
        });
    }
}