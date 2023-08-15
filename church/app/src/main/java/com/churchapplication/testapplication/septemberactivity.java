package com.churchapplication.testapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class septemberactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public septemberactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.september,container,false);

    btn1 =v.findViewById(R.id.september1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday1.class));
            }
        });

        btn2 =v.findViewById(R.id.september2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday2.class));
            }
        });
        btn3 =v.findViewById(R.id.september3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday3.class));
            }
        });
        btn4 =v.findViewById(R.id.september4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday4.class));
            }
        });
        btn5 =v.findViewById(R.id.september5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday5.class));
            }
        });
        btn6 =v.findViewById(R.id.september6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday6.class));
            }
        });
        btn7 =v.findViewById(R.id.september7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), septemberday7.class));
            }
        });
        btn8 = v.findViewById(R.id.september8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday8.class));
            }
        });
        btn9 =v.findViewById(R.id.september9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday9.class));
            }
        });
        btn10 =v.findViewById(R.id.september10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday10.class));
            }
        });
        btn11 =v.findViewById(R.id.september11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday11.class));
            }
        });
        btn12 =v.findViewById(R.id.september12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday12.class));
            }
        });
        btn13 =v.findViewById(R.id.september13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday13.class));
            }
        });
        btn14 =v.findViewById(R.id.september14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday14.class));
            }
        });
        btn15 =v.findViewById(R.id.september15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday15.class));
            }
        });
        btn16 =v.findViewById(R.id.september16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday16.class));
            }
        });
        btn17 =v.findViewById(R.id.september17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday17.class));
            }
        });
        btn18 =v.findViewById(R.id.september18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday18.class));
            }
        });
        btn19 =v.findViewById(R.id.september19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday19.class));
            }
        });
        btn20=v.findViewById(R.id.september20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday20.class));
            }
        });
        btn21 =v.findViewById(R.id.september21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday21.class));
            }
        });
        btn22=v.findViewById(R.id.september22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday22.class));
            }
        });
        btn23 =v.findViewById(R.id.september23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday23.class));
            }
        });
        btn24 =v.findViewById(R.id.september24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday24.class));
            }
        });
        btn25 =v.findViewById(R.id.september25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday25.class));
            }
        });
        btn26 =v.findViewById(R.id.september26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday26.class));
            }
        });
        btn27 = v.findViewById(R.id.september27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday27.class));
            }
        });
        btn28 =v.findViewById(R.id.september28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday28.class));
            }
        });
        btn29 =v.findViewById(R.id.september29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday29.class));
            }
        });
        btn30 =v.findViewById(R.id.september30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), septemberday30.class));
            }
        });


        return v;
    }
}
