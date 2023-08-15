package com.churchapplication.testapplication;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class julyday14 extends AppCompatActivity {
    Button btn1,btn2;
    TextView textView;
    int i = 25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.july14);

        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.zoom);
        btn2 = findViewById(R.id.zoomout);

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