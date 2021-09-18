package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mResetButton;
    private Button mCountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.showCount);
        mResetButton = findViewById(R.id.zeroCount);
        mCountButton = findViewById(R.id.button_count);
    }

    public void showtoast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        mResetButton.setClickable(true);

        switch (mCount % 2){
//            if mCount mod 2 is 0, number is even otherwise odd
            case 0: view.setBackgroundColor(Color.MAGENTA);
                break;
            case 1: view.setBackgroundColor(Color.GREEN);
                break;
            default: break;
        }


    }
    public void setZero(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        view.setClickable(false);
        view.setBackgroundColor(Color.GRAY);
        mResetButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
    }
}