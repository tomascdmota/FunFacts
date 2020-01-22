package com.example.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class FunFacts extends Activity {

    private FactBook mFactbok = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declaring variables and assigning them to their views
        final ConstraintLayout constraintLayout = findViewById(R.id.constraintlayout);
        final Button button = findViewById(R.id.button);
        final TextView facts = findViewById(R.id.Facts);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactbok.getFact();
                facts.setText(fact);

                int color = mColorWheel.getColor();
                constraintLayout.setBackgroundColor(color);
                button.setTextColor(color);
            }
        };
        button.setOnClickListener(listener);

    }

    @Override
    protected void onStart() {
        super.onStart();
        final TextView facts = findViewById(R.id.Facts);
        String fact = mFactbok.getFact();
        facts.setText(fact);
    }
}
