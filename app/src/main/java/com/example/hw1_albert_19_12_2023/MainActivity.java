package com.example.hw1_albert_19_12_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    Button btn;
    int num = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
    }

    public void lol(View view) {
        num++;
                if(num<=1)
                {

                    tv.setVisibility(1);

                }
         tv.setText("Oh, yea, I’ve been clicked!");
    }
}