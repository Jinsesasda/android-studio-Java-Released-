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

public class octoberactivity extends Fragment {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;
    public octoberactivity(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.october,container,false);

    btn1 =v.findViewById(R.id.october1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday1.class));
            }
        });

        btn2 =v.findViewById(R.id.october2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday2.class));
            }
        });
        btn3 =v.findViewById(R.id.october3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday3.class));
            }
        });
        btn4 =v.findViewById(R.id.october4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday4.class));
            }
        });
        btn5 =v.findViewById(R.id.october5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday5.class));
            }
        });
        btn6 =v.findViewById(R.id.october6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday6.class));
            }
        });
        btn7 =v.findViewById(R.id.october7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), octoberday7.class));
            }
        });
        btn8 = v.findViewById(R.id.october8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday8.class));
            }
        });
        btn9 =v.findViewById(R.id.october9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday9.class));
            }
        });
        btn10 =v.findViewById(R.id.october10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday10.class));
            }
        });
        btn11 =v.findViewById(R.id.october11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday11.class));
            }
        });
        btn12 =v.findViewById(R.id.october12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday12.class));
            }
        });
        btn13 =v.findViewById(R.id.october13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday13.class));
            }
        });
        btn14 =v.findViewById(R.id.october14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday14.class));
            }
        });
        btn15 =v.findViewById(R.id.october15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday15.class));
            }
        });
        btn16 =v.findViewById(R.id.october16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday16.class));
            }
        });
        btn17 =v.findViewById(R.id.october17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday17.class));
            }
        });
        btn18 =v.findViewById(R.id.october18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday18.class));
            }
        });
        btn19 =v.findViewById(R.id.october19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday19.class));
            }
        });
        btn20=v.findViewById(R.id.october20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday20.class));
            }
        });
        btn21 =v.findViewById(R.id.october21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday21.class));
            }
        });
        btn22=v.findViewById(R.id.october22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday22.class));
            }
        });
        btn23 =v.findViewById(R.id.october23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday23.class));
            }
        });
        btn24 =v.findViewById(R.id.october24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday24.class));
            }
        });
        btn25 =v.findViewById(R.id.october25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday25.class));
            }
        });
        btn26 =v.findViewById(R.id.october26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday26.class));
            }
        });
        btn27 = v.findViewById(R.id.october27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday27.class));
            }
        });
        btn28 =v.findViewById(R.id.october28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday28.class));
            }
        });
        btn29 =v.findViewById(R.id.october29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday29.class));
            }
        });
        btn30 =v.findViewById(R.id.october30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday30.class));
            }
        });

        btn31 =v.findViewById(R.id.october31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), octoberday31.class));
            }
        });



        return v;
    }
}
