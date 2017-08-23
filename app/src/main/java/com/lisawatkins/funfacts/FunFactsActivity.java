package com.lisawatkins.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout factLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign views from layout file to corresponding variables
        factTextView = (TextView)findViewById(R.id.factTextView);
        showFactButton = (Button) findViewById(R.id.showFactButton);
        factLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = ColorWheel.getColor();
                factTextView.setText(FactBook.getRandomFact());
                factLayout.setBackgroundColor(color);
                factTextView.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
        // Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging form the onCreate method");
    }
}
