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

public class novemberactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public novemberactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.november,container,false);

    btn1 =v.findViewById(R.id.november1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday1.class));
            }
        });

        btn2 =v.findViewById(R.id.november2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday2.class));
            }
        });
        btn3 =v.findViewById(R.id.november3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday3.class));
            }
        });
        btn4 =v.findViewById(R.id.november4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday4.class));
            }
        });
        btn5 =v.findViewById(R.id.november5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday5.class));
            }
        });
        btn6 =v.findViewById(R.id.november6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday6.class));
            }
        });
        btn7 =v.findViewById(R.id.november7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), novemberday7.class));
            }
        });
        btn8 = v.findViewById(R.id.november8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday8.class));
            }
        });
        btn9 =v.findViewById(R.id.november9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday9.class));
            }
        });
        btn10 =v.findViewById(R.id.november10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday10.class));
            }
        });
        btn11 =v.findViewById(R.id.november11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday11.class));
            }
        });
        btn12 =v.findViewById(R.id.november12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday12.class));
            }
        });
        btn13 =v.findViewById(R.id.november13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday13.class));
            }
        });
        btn14 =v.findViewById(R.id.november14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday14.class));
            }
        });
        btn15 =v.findViewById(R.id.november15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday15.class));
            }
        });
        btn16 =v.findViewById(R.id.november16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday16.class));
            }
        });
        btn17 =v.findViewById(R.id.november17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday17.class));
            }
        });
        btn18 =v.findViewById(R.id.november18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday18.class));
            }
        });
        btn19 =v.findViewById(R.id.november19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday19.class));
            }
        });
        btn20=v.findViewById(R.id.november20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday20.class));
            }
        });
        btn21 =v.findViewById(R.id.november21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday21.class));
            }
        });
        btn22=v.findViewById(R.id.november22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday22.class));
            }
        });
        btn23 =v.findViewById(R.id.november23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday23.class));
            }
        });
        btn24 =v.findViewById(R.id.november24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday24.class));
            }
        });
        btn25 =v.findViewById(R.id.november25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday25.class));
            }
        });
        btn26 =v.findViewById(R.id.november26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday26.class));
            }
        });
        btn27 = v.findViewById(R.id.november27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday27.class));
            }
        });
        btn28 =v.findViewById(R.id.november28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday28.class));
            }
        });
        btn29 =v.findViewById(R.id.november29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday29.class));
            }
        });
        btn30 =v.findViewById(R.id.november30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), novemberday30.class));
            }
        });


        return v;
    }
}
