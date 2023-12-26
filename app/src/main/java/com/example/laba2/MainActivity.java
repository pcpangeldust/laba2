package com.example.laba2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        int screenHeight = getResources().getDisplayMetrics().heightPixels;
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int buttonHeight = (int) (screenHeight * 0.2);
        int buttonMargin = (int) (screenHeight * 0.02);

        Button button1 = createButton("Button 1", buttonHeight);
        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.75),
                buttonHeight
        );
        params1.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params1.setMargins(0, buttonMargin, 0, 0);
        button1.setLayoutParams(params1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        layout.addView(button1);

        // Button 2
        Button button2 = new Button(this);
        button2.setId(View.generateViewId());
        button2.setText("Button 2");
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.75),
                buttonHeight
        );
        params2.addRule(RelativeLayout.BELOW, button1.getId());
        params2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params2.setMargins(0, buttonMargin, 0, 0);
        button2.setLayoutParams(params2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        layout.addView(button2);

        // Button 3
        Button button3 = new Button(this);
        button3.setId(View.generateViewId());
        button3.setText("Button 3");
        RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.75),
                buttonHeight
        );
        params3.addRule(RelativeLayout.BELOW, button2.getId());
        params3.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params3.setMargins(0, buttonMargin, 0, 0);
        button3.setLayoutParams(params3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
            }
        });

        layout.addView(button3);

        // Button 4
        Button button4 = new Button(this);
        button4.setId(View.generateViewId());
        button4.setText("Button 4");
        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(
                (int) (screenWidth * 0.75),
                buttonHeight
        );
        params4.addRule(RelativeLayout.BELOW, button3.getId());
        params4.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params4.setMargins(0, buttonMargin, 0, 0);
        button4.setLayoutParams(params4);
        layout.addView(button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        setContentView(layout);
    }

    private Button createButton(String text, int height) {
        Button button = new Button(this);
        button.setId(View.generateViewId());
        button.setText(text);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                height
        );
        return button;
    }
}