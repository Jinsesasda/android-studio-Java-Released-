package com.churchapplication.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31;

    private FirebaseAuth mfirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mfirebaseAuth = FirebaseAuth.getInstance();

        Button january = findViewById(R.id.mjanuary);
        Button feburary = findViewById(R.id.mfeburay);
        Button march = findViewById(R.id.mmarch);
        Button april = findViewById(R.id.mapril);
        Button june = findViewById(R.id.june);
        Button may = findViewById(R.id.may);
        Button july = findViewById(R.id.july);
        Button august = findViewById(R.id.august);
        Button september = findViewById(R.id.september);
        Button october = findViewById(R.id.october);
        Button november = findViewById(R.id.november);
        Button december = findViewById(R.id.december);
        final LinearLayout ln = (LinearLayout)findViewById(R.id.monthlayout);
        final LinearLayout ln1 = (LinearLayout)findViewById(R.id.monthlayout1);
        final LinearLayout ln2 = (LinearLayout)findViewById(R.id.monthlayout2);
        final LinearLayout ln3 = (LinearLayout)findViewById(R.id.monthlayout3);
        final LinearLayout ln4 = (LinearLayout)findViewById(R.id.monthlayout4);
        final LinearLayout ln5 = (LinearLayout)findViewById(R.id.monthlayout5);
        final LinearLayout ln6 = (LinearLayout)findViewById(R.id.monthlayout6);
        final LinearLayout ln7 = (LinearLayout)findViewById(R.id.monthlayout7);
        final LinearLayout ln8 = (LinearLayout)findViewById(R.id.monthlayout8);
        final LinearLayout ln9 = (LinearLayout)findViewById(R.id.monthlayout9);
        final LinearLayout ln10 = (LinearLayout)findViewById(R.id.monthlayout10);



        january.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);

                january.setBackgroundColor(getResources().getColor(R.color.teal_700));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                januaryactivity januaryactivity = new januaryactivity();
                transaction.replace(R.id.frame, januaryactivity);

                transaction.commit();
            }
        });

        feburary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_700));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                feburaryactivity feburaryactivity = new feburaryactivity();
                transaction.replace(R.id.frame, feburaryactivity);

                transaction.commit();
            }
        });
        march.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_700));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                marchactivity marchactivity = new marchactivity();
                transaction.replace(R.id.frame, marchactivity);

                transaction.commit();
            }
        });
        april.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_700));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
               aprilactivity aprilactivity = new aprilactivity();
                transaction.replace(R.id.frame, aprilactivity);

                transaction.commit();
            }
        });
        june.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_700));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));



                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragmentActivity1 fragment1 = new FragmentActivity1();
                transaction.replace(R.id.frame, fragment1);

                transaction.commit();
            }
        });


        may.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_700));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                juneactivity juneactivity = new juneactivity();
                transaction.replace(R.id.frame, juneactivity);

                transaction.commit();
            }
        });


        july.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_700));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                julyactivity julyactivity = new julyactivity();
                transaction.replace(R.id.frame, julyactivity);

                transaction.commit();
            }
        });

        august.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_700));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                augustactivity augustactivity = new augustactivity();
                transaction.replace(R.id.frame, augustactivity);

                transaction.commit();
            }
        });

        september.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_700));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                septemberactivity septemberactivity = new septemberactivity();
                transaction.replace(R.id.frame, septemberactivity);

                transaction.commit();
            }
        });

        october.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_700));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                octoberactivity octoberactivity = new octoberactivity();
                transaction.replace(R.id.frame, octoberactivity);

                transaction.commit();
            }
        });

        november.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_700));
                december.setBackgroundColor(getResources().getColor(R.color.teal_200));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                novemberactivity novemberactivity = new novemberactivity();
                transaction.replace(R.id.frame, novemberactivity);

                transaction.commit();
            }
        });

        december.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ln.setVisibility(View.GONE);
                ln1.setVisibility(View.GONE);
                ln2.setVisibility(View.GONE);
                ln3.setVisibility(View.GONE);
                ln4.setVisibility(View.GONE);
                ln5.setVisibility(View.GONE);
                ln6.setVisibility(View.GONE);
                ln7.setVisibility(View.GONE);
                ln8.setVisibility(View.GONE);
                ln9.setVisibility(View.GONE);
                ln10.setVisibility(View.GONE);
                january.setBackgroundColor(getResources().getColor(R.color.teal_200));
                feburary.setBackgroundColor(getResources().getColor(R.color.teal_200));
                march.setBackgroundColor(getResources().getColor(R.color.teal_200));
                april.setBackgroundColor(getResources().getColor(R.color.teal_200));
                june.setBackgroundColor(getResources().getColor(R.color.teal_200));
                may.setBackgroundColor(getResources().getColor(R.color.teal_200));
                july.setBackgroundColor(getResources().getColor(R.color.teal_200));
                august.setBackgroundColor(getResources().getColor(R.color.teal_200));
                september.setBackgroundColor(getResources().getColor(R.color.teal_200));
                october.setBackgroundColor(getResources().getColor(R.color.teal_200));
                november.setBackgroundColor(getResources().getColor(R.color.teal_200));
                december.setBackgroundColor(getResources().getColor(R.color.teal_700));
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                decemberactivity decemberactivity = new decemberactivity();
                transaction.replace(R.id.frame, decemberactivity);

                transaction.commit();
            }
        });


 btn1 =findViewById(R.id.january1);

        btn3 =findViewById(R.id.january3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january3.class));
            }
        });
        btn4 =findViewById(R.id.january4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january4.class));
            }
        });
        btn5 =findViewById(R.id.january5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january5.class));
            }
        });
        btn6 =findViewById(R.id.january6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january6.class));
            }
        });
        btn7 =findViewById(R.id.january7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, january7.class));
            }
        });
        btn8 = findViewById(R.id.january8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january8.class));
            }
        });
        btn9 =findViewById(R.id.january9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january9.class));
            }
        });
        btn10 =findViewById(R.id.january10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january10.class));
            }
        });
        btn11 =findViewById(R.id.january11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january11.class));
            }
        });
        btn12 =findViewById(R.id.january12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january12.class));
            }
        });
        btn13 =findViewById(R.id.january13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january13.class));
            }
        });
        btn14 =findViewById(R.id.january14);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january14.class));
            }
        });
        btn15 =findViewById(R.id.january15);
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january15.class));
            }
        });
        btn16 =findViewById(R.id.january16);
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january16.class));
            }
        });
        btn17 =findViewById(R.id.january17);
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january17.class));
            }
        });
        btn18 =findViewById(R.id.january18);
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january18.class));
            }
        });
        btn19 =findViewById(R.id.january19);
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january19.class));
            }
        });
        btn20=findViewById(R.id.january20);
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january20.class));
            }
        });
        btn21 =findViewById(R.id.january21);
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january21.class));
            }
        });
        btn22=findViewById(R.id.january22);
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january22.class));
            }
        });
        btn23 =findViewById(R.id.january23);
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january23.class));
            }
        });
        btn24 =findViewById(R.id.january24);
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january24.class));
            }
        });
        btn25 =findViewById(R.id.january25);
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january25.class));
            }
        });
        btn26 =findViewById(R.id.january26);
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january26.class));
            }
        });
        btn27 = findViewById(R.id.january27);
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january27.class));
            }
        });
        btn28 =findViewById(R.id.january28);
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january28.class));
            }
        });
        btn29 =findViewById(R.id.january29);
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january29.class));
            }
        });
        btn30 =findViewById(R.id.january30);
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january30.class));
            }
        });
        btn31 =findViewById(R.id.january31);
        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, january31.class));
            }
        });

    }
}

        /*btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //로그아웃하기
                mfirebaseAuth.signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}

         */

