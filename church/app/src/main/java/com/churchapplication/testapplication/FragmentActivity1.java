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

public class FragmentActivity1 extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public FragmentActivity1(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment,container,false);

    btn1 =v.findViewById(R.id.mday1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day1.class));
            }
        });

        btn2 =v.findViewById(R.id.mday2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day2.class));
            }
        });
        btn3 =v.findViewById(R.id.mday3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day3.class));
            }
        });
        btn4 =v.findViewById(R.id.mday4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day4.class));
            }
        });
        btn5 =v.findViewById(R.id.mday5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day5.class));
            }
        });
        btn6 =v.findViewById(R.id.mday6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day6.class));
            }
        });
        btn7 =v.findViewById(R.id.mday7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), day7.class));
            }
        });
        btn8 = v.findViewById(R.id.mday8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day8.class));
            }
        });
        btn9 =v.findViewById(R.id.mday9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day9.class));
            }
        });
        btn10 =v.findViewById(R.id.mday10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day10.class));
            }
        });
        btn11 =v.findViewById(R.id.mday11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day11.class));
            }
        });
        btn12 =v.findViewById(R.id.mday12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day12.class));
            }
        });
        btn13 =v.findViewById(R.id.mday13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day13.class));
            }
        });
        btn14 =v.findViewById(R.id.mday14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day14.class));
            }
        });
        btn15 =v.findViewById(R.id.mday15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day15.class));
            }
        });
        btn16 =v.findViewById(R.id.mday16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day16.class));
            }
        });
        btn17 =v.findViewById(R.id.mday17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day17.class));
            }
        });
        btn18 =v.findViewById(R.id.mday18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day18.class));
            }
        });
        btn19 =v.findViewById(R.id.mday19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day19.class));
            }
        });
        btn20=v.findViewById(R.id.mday20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day20.class));
            }
        });
        btn21 =v.findViewById(R.id.mday21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day21.class));
            }
        });
        btn22=v.findViewById(R.id.mday22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day22.class));
            }
        });
        btn23 =v.findViewById(R.id.mday23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day23.class));
            }
        });
        btn24 =v.findViewById(R.id.mday24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day24.class));
            }
        });
        btn25 =v.findViewById(R.id.mday25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day25.class));
            }
        });
        btn26 =v.findViewById(R.id.mday26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day26.class));
            }
        });
        btn27 = v.findViewById(R.id.mday27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day27.class));
            }
        });
        btn28 =v.findViewById(R.id.mday28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day28.class));
            }
        });
        btn29 =v.findViewById(R.id.mday29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day29.class));
            }
        });
        btn30 =v.findViewById(R.id.mday30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day30.class));
            }
        });
        btn31 =v.findViewById(R.id.mday31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), day31.class));
            }
        });

        return v;
    }
}
