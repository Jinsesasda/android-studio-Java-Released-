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

public class juneactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public juneactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.june,container,false);

    btn1 =v.findViewById(R.id.june1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday1.class));
            }
        });

        btn2 =v.findViewById(R.id.june2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday2.class));
            }
        });
        btn3 =v.findViewById(R.id.june3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday3.class));
            }
        });
        btn4 =v.findViewById(R.id.june4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday4.class));
            }
        });
        btn5 =v.findViewById(R.id.june5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday5.class));
            }
        });
        btn6 =v.findViewById(R.id.june6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday6.class));
            }
        });
        btn7 =v.findViewById(R.id.june7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), juneday7.class));
            }
        });
        btn8 = v.findViewById(R.id.june8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday8.class));
            }
        });
        btn9 =v.findViewById(R.id.june9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday9.class));
            }
        });
        btn10 =v.findViewById(R.id.june10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday10.class));
            }
        });
        btn11 =v.findViewById(R.id.june11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday11.class));
            }
        });
        btn12 =v.findViewById(R.id.june12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday12.class));
            }
        });
        btn13 =v.findViewById(R.id.june13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday13.class));
            }
        });
        btn14 =v.findViewById(R.id.june14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday14.class));
            }
        });
        btn15 =v.findViewById(R.id.june15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday15.class));
            }
        });
        btn16 =v.findViewById(R.id.june16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday16.class));
            }
        });
        btn17 =v.findViewById(R.id.june17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday17.class));
            }
        });
        btn18 =v.findViewById(R.id.june18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday18.class));
            }
        });
        btn19 =v.findViewById(R.id.june19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday19.class));
            }
        });
        btn20=v.findViewById(R.id.june20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday20.class));
            }
        });
        btn21 =v.findViewById(R.id.june21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday21.class));
            }
        });
        btn22=v.findViewById(R.id.june22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday22.class));
            }
        });
        btn23 =v.findViewById(R.id.june23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday23.class));
            }
        });
        btn24 =v.findViewById(R.id.june24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday24.class));
            }
        });
        btn25 =v.findViewById(R.id.june25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday25.class));
            }
        });
        btn26 =v.findViewById(R.id.june26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday26.class));
            }
        });
        btn27 = v.findViewById(R.id.june27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday27.class));
            }
        });
        btn28 =v.findViewById(R.id.june28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday28.class));
            }
        });
        btn29 =v.findViewById(R.id.june29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday29.class));
            }
        });
        btn30 =v.findViewById(R.id.june30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), juneday30.class));
            }
        });


        return v;
    }
}
