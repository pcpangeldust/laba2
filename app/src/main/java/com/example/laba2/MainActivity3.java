package com.example.laba2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        int screenHeight = getResources().getDisplayMetrics().heightPixels;
        int screenWidth = getResources().getDisplayMetrics().widthPixels;
        int buttonWidth45 = (int) (screenWidth * 0.45);
        int buttonWidth20 = (int) (screenWidth * 0.2);
        int buttonWidth35 = (int) (screenWidth * 0.35);
        int buttonWidth100 = (int) (screenWidth * 1.0);

        // Button left
        Button left50Button = createButton("Left 50%", buttonWidth45);
        RelativeLayout.LayoutParams left50Params = new RelativeLayout.LayoutParams(
                buttonWidth45,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        left50Params.addRule(RelativeLayout.ALIGN_PARENT_START);
        left50Params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        left50Params.setMargins(16, 16, 0, 0);
        left50Button.setLayoutParams(left50Params);
        layout.addView(left50Button);

        // Button right
        Button right50Button = createButton("Right 50%", buttonWidth45);
        RelativeLayout.LayoutParams right50Params = new RelativeLayout.LayoutParams(
                buttonWidth45,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        right50Params.addRule(RelativeLayout.ALIGN_PARENT_END);
        right50Params.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        right50Params.setMargins(0, 16, 16, 0);
        right50Button.setLayoutParams(right50Params);
        layout.addView(right50Button);

        // Button center_left
        Button centerLeftButton = createButton("Center_left", buttonWidth35);
        RelativeLayout.LayoutParams centerLeftParams = new RelativeLayout.LayoutParams(
                buttonWidth35,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        centerLeftParams.addRule(RelativeLayout.CENTER_VERTICAL);
        centerLeftParams.addRule(RelativeLayout.ALIGN_PARENT_START);
        centerLeftButton.setLayoutParams(centerLeftParams);
        layout.addView(centerLeftButton);

        // Button center
        Button centerButton = createButton("Center", buttonWidth20);
        RelativeLayout.LayoutParams centerParams = new RelativeLayout.LayoutParams(
                buttonWidth20,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        centerParams.addRule(RelativeLayout.CENTER_VERTICAL);
        centerParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        centerParams.setMargins(0, 0, 0, 0);
        centerButton.setLayoutParams(centerParams);
        layout.addView(centerButton);

        // Button center_right
        Button centerRightButton = createButton("Center_right", buttonWidth35);
        RelativeLayout.LayoutParams centerRightParams = new RelativeLayout.LayoutParams(
                buttonWidth35,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        centerRightParams.addRule(RelativeLayout.CENTER_VERTICAL);
        centerRightParams.addRule(RelativeLayout.ALIGN_PARENT_END);
        centerRightButton.setLayoutParams(centerRightParams);
        layout.addView(centerRightButton);

        // Button bottom
        Button bottomButton = createButton("Bottom", buttonWidth100);
        RelativeLayout.LayoutParams bottomParams = new RelativeLayout.LayoutParams(
                buttonWidth100,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        bottomParams.setMargins(16, 0, 16, 30);
        bottomParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        bottomButton.setLayoutParams(bottomParams);
        layout.

        addView(bottomButton);

        setContentView(layout);
    }

    private Button createButton(String text, int width) {
        Button button = new Button(this);
        button.setText(text);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                width,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        return button;
    }
}