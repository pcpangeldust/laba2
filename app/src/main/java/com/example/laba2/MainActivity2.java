package com.example.laba2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT));

        int screenHeight = getResources().getDisplayMetrics().heightPixels;
        int screenWidth = getResources().getDisplayMetrics().widthPixels;

        int buttonHeight = (int) (screenHeight * 0.1);
        int buttonWidth34 = (int) (screenWidth * 0.34);
        int buttonWidth40 = (int) (screenWidth * 0.4);
        int buttonWidth22_5 = (int) (screenWidth * 0.225);

        // Button 1
        Button button1 = createButton("Button 1", buttonWidth34, buttonHeight);
        RelativeLayout.LayoutParams params1 = new RelativeLayout.LayoutParams(
                buttonWidth34,
                buttonHeight
        );
        params1.addRule(RelativeLayout.ALIGN_PARENT_START);
        params1.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        button1.setLayoutParams(params1);
        layout.addView(button1);

        // Button 2
        Button button2 = createButton("Button 2", buttonWidth34, buttonHeight);
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(
                buttonWidth34,
                buttonHeight
        );
        params2.addRule(RelativeLayout.END_OF, button1.getId());
        params2.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        button2.setLayoutParams(params2);
        layout.addView(button2);

        // Button 3
        Button button3 = createButton("Button 3", buttonWidth34, buttonHeight);
        RelativeLayout.LayoutParams params3 = new RelativeLayout.LayoutParams(
                buttonWidth34,
                buttonHeight
        );
        params3.addRule(RelativeLayout.END_OF, button2.getId());
        params3.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        button3.setLayoutParams(params3);
        layout.addView(button3);

        // Button 4
        Button button4 = createButton("Button 4", buttonWidth40, buttonHeight);
        RelativeLayout.LayoutParams params4 = new RelativeLayout.LayoutParams(
                buttonWidth40,
                buttonHeight
        );
        params4.addRule(RelativeLayout.ALIGN_PARENT_START);
        params4.addRule(RelativeLayout.CENTER_VERTICAL);
        button4.setLayoutParams(params4);
        layout.addView(button4);

        // Button 5
        Button button5 = createButton("Button 5", buttonWidth40, buttonHeight);
        RelativeLayout.LayoutParams params5 = new RelativeLayout.LayoutParams(
                buttonWidth40,
                buttonHeight

        );
        params5.addRule(RelativeLayout.ALIGN_PARENT_END);
        params5.addRule(RelativeLayout.CENTER_VERTICAL);
        button5.setLayoutParams(params5);
        layout.addView(button5);

        // Button 6
        Button button6 = createButton("Button 6", buttonWidth22_5, buttonHeight);
        RelativeLayout.LayoutParams params6 = new RelativeLayout.LayoutParams(
                buttonWidth22_5,
                buttonHeight
        );
        params6.addRule(RelativeLayout.ALIGN_PARENT_START);
        params6.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        button6.setLayoutParams(params6);
        layout.addView(button6);

        // Button 7
        Button button7 = createButton("Button 7", buttonWidth22_5, buttonHeight);
        RelativeLayout.LayoutParams params7 = new RelativeLayout.LayoutParams(
                buttonWidth22_5,
                buttonHeight
        );
        params7.addRule(RelativeLayout.END_OF, button6.getId());
        params7.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        button7.setLayoutParams(params7);
        layout.addView(button7);// Button 8
        Button button8 = createButton("Button 8", buttonWidth40, buttonHeight);
        RelativeLayout.LayoutParams params8 = new RelativeLayout.LayoutParams(
                buttonWidth40,
                buttonHeight
        );
        params8.addRule(RelativeLayout.END_OF, button7.getId());
        params8.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        button8.setLayoutParams(params8);
        layout.addView(button8);

        setContentView(layout);
    }

    private Button createButton(String text, int width, int height) {
        Button button = new Button(this);
        button.setId(View.generateViewId());
        button.setText(text);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                width,
                height
        );
        return button;
    }
}