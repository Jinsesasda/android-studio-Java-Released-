package com.churchapplication.testapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class day3 extends AppCompatActivity {


    int i = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day3);
        TextView textView = findViewById(R.id.textView);
        Button btn1 = findViewById(R.id.zoom);
        Button btn2 = findViewById(R.id.zoomout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i= i+2;
                textView.setTextSize(i);
                if(i > 40){
                    i = 40;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i-2;
                textView.setTextSize(i);
                if(i < 18){
                    i=18;
                }
            }
        });

    }

}