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

public class julyactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public julyactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.july,container,false);

    btn1 =v.findViewById(R.id.july1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday1.class));
            }
        });

        btn2 =v.findViewById(R.id.july2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday2.class));
            }
        });
        btn3 =v.findViewById(R.id.july3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday3.class));
            }
        });
        btn4 =v.findViewById(R.id.july4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday4.class));
            }
        });
        btn5 =v.findViewById(R.id.july5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday5.class));
            }
        });
        btn6 =v.findViewById(R.id.july6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday6.class));
            }
        });
        btn7 =v.findViewById(R.id.july7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), julyday7.class));
            }
        });
        btn8 = v.findViewById(R.id.july8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday8.class));
            }
        });
        btn9 =v.findViewById(R.id.july9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday9.class));
            }
        });
        btn10 =v.findViewById(R.id.july10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday10.class));
            }
        });
        btn11 =v.findViewById(R.id.july11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday11.class));
            }
        });
        btn12 =v.findViewById(R.id.july12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday12.class));
            }
        });
        btn13 =v.findViewById(R.id.july13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday13.class));
            }
        });
        btn14 =v.findViewById(R.id.july14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday14.class));
            }
        });
        btn15 =v.findViewById(R.id.july15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday15.class));
            }
        });
        btn16 =v.findViewById(R.id.july16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday16.class));
            }
        });
        btn17 =v.findViewById(R.id.july17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday17.class));
            }
        });
        btn18 =v.findViewById(R.id.july18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday18.class));
            }
        });
        btn19 =v.findViewById(R.id.july19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday19.class));
            }
        });
        btn20=v.findViewById(R.id.july20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday20.class));
            }
        });
        btn21 =v.findViewById(R.id.july21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday21.class));
            }
        });
        btn22=v.findViewById(R.id.july22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday22.class));
            }
        });
        btn23 =v.findViewById(R.id.july23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday23.class));
            }
        });
        btn24 =v.findViewById(R.id.july24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday24.class));
            }
        });
        btn25 =v.findViewById(R.id.july25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday25.class));
            }
        });
        btn26 =v.findViewById(R.id.july26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday26.class));
            }
        });
        btn27 = v.findViewById(R.id.july27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday27.class));
            }
        });
        btn28 =v.findViewById(R.id.july28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday28.class));
            }
        });
        btn29 =v.findViewById(R.id.july29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday29.class));
            }
        });
        btn30 =v.findViewById(R.id.july30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday30.class));
            }
        });

        btn31 =v.findViewById(R.id.july31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), julyday31.class));
            }
        });



        return v;
    }
}
