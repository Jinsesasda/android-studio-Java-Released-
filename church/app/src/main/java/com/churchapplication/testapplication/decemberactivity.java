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

public class decemberactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public decemberactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.december,container,false);

    btn1 =v.findViewById(R.id.december1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday1.class));
            }
        });

        btn2 =v.findViewById(R.id.december2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday2.class));
            }
        });
        btn3 =v.findViewById(R.id.december3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday3.class));
            }
        });
        btn4 =v.findViewById(R.id.december4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday4.class));
            }
        });
        btn5 =v.findViewById(R.id.december5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday5.class));
            }
        });
        btn6 =v.findViewById(R.id.december6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday6.class));
            }
        });
        btn7 =v.findViewById(R.id.december7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), decemberday7.class));
            }
        });
        btn8 = v.findViewById(R.id.december8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday8.class));
            }
        });
        btn9 =v.findViewById(R.id.december9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday9.class));
            }
        });
        btn10 =v.findViewById(R.id.december10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday10.class));
            }
        });
        btn11 =v.findViewById(R.id.december11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday11.class));
            }
        });
        btn12 =v.findViewById(R.id.december12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday12.class));
            }
        });
        btn13 =v.findViewById(R.id.december13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday13.class));
            }
        });
        btn14 =v.findViewById(R.id.december14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday14.class));
            }
        });
        btn15 =v.findViewById(R.id.december15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday15.class));
            }
        });
        btn16 =v.findViewById(R.id.december16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday16.class));
            }
        });
        btn17 =v.findViewById(R.id.december17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday17.class));
            }
        });
        btn18 =v.findViewById(R.id.december18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday18.class));
            }
        });
        btn19 =v.findViewById(R.id.december19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday19.class));
            }
        });
        btn20=v.findViewById(R.id.december20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday20.class));
            }
        });
        btn21 =v.findViewById(R.id.december21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday21.class));
            }
        });
        btn22=v.findViewById(R.id.december22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday22.class));
            }
        });
        btn23 =v.findViewById(R.id.december23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday23.class));
            }
        });
        btn24 =v.findViewById(R.id.december24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday24.class));
            }
        });
        btn25 =v.findViewById(R.id.december25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday25.class));
            }
        });
        btn26 =v.findViewById(R.id.december26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday26.class));
            }
        });
        btn27 = v.findViewById(R.id.december27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday27.class));
            }
        });
        btn28 =v.findViewById(R.id.december28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday28.class));
            }
        });
        btn29 =v.findViewById(R.id.december29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday29.class));
            }
        });
        btn30 =v.findViewById(R.id.december30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday30.class));
            }
        });

        btn31 =v.findViewById(R.id.december31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), decemberday31.class));
            }
        });


        return v;
    }
}
