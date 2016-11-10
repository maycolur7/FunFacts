package com.whatscode.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String TAG  = MainActivity.class.getSimpleName();
    private FactBook mFactsBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private TextView factText;
    private Button showFactBotton;
    private RelativeLayout mRelativLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factText = (TextView) findViewById(R.id.second_text);
        showFactBotton = (Button) findViewById(R.id.showFactBotton);
        mRelativLayout = (RelativeLayout) findViewById(R.id.relativLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = mColorWheel.getColor();
                String fact = mFactsBook.getFact();

                mRelativLayout.setBackgroundColor(color);
                factText.setText(fact);
                showFactBotton.setTextColor(color);
            }
        };
        showFactBotton.setOnClickListener(listener);

        // Toast.makeText(this, "Yeyyy!! it is our first toast", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the onCreate() methond!" );
    }
}
