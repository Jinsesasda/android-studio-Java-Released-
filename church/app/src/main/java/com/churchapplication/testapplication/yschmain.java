package com.churchapplication.testapplication;


import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class yschmain extends AppCompatActivity {



    
    ImageButton imageView, imageview1,imageview2,imageview3,imageView6,imageView7,imageView8,imageview9,imageview4,imageView5,button,hiel;
    ImageButton imageButton;





    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yschmain);


        textView2 = findViewById(R.id.homepage);
        imageView = findViewById(R.id.jubo);
        imageview1 = findViewById(R.id.churchttime);
        imageview2 = findViewById(R.id.carrtime);
        imageview3 = findViewById(R.id.jojikdo);
        imageview4 = findViewById(R.id.mallsumm);
        imageView5 = findViewById(R.id.seungkyoungil);
        imageView6 = findViewById(R.id.nanumto);
        imageView7 = findViewById(R.id.dailyqt);
        imageView8 = findViewById(R.id.churchschool);
        imageview9 = findViewById(R.id.thismonthsermon);
        button = findViewById(R.id.qrcode);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yschmain.this, qrcode.class);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/main.html"));

                startActivity(intent);
            }
        });


        imageview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCK17C2htBb9laMfQQuPpodQ/videos"));

                startActivity(intent);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=29"));

                startActivity(intent);
            }
        });

        imageview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=70"));

                startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=66"));

                startActivity(intent);
            }
        });

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=9"));

                startActivity(intent);
            }
        });



        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=7"));

                startActivity(intent);
            }
        });



        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yschmain.this, MainActivity.class);
                startActivity(intent);

            }
        });


        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button testbutton;
                ViewGroup viewGroup = findViewById(android.R.id.content);
                AlertDialog.Builder builder = new AlertDialog.Builder(yschmain.this);
                View view = LayoutInflater.from(yschmain.this).inflate(R.layout.custompopup, viewGroup, false);
                builder.setView(view);

                TextView textView1 = view.findViewById(R.id.testview3);
                TextView textView2 = view.findViewById(R.id.testtext4);
                TextView textView3 = view.findViewById(R.id.testtext5);
                TextView textView4 = view.findViewById(R.id.testtext6);
                TextView textView5 = view.findViewById(R.id.testtext7);
                TextView textView6 = view.findViewById(R.id.testtext8);
                TextView textView7 = view.findViewById(R.id.testtext9);
                TextView hiel = view.findViewById(R.id.hiel);



                TextView close = view.findViewById(R.id.closepop);
                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });

                textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UCu86KS27OWleV12STKYYD2g/featured"));

                        startActivity(intent);
                    }
                });
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UCzzTRx3ewadEOlazQ4e8SCw/videos"));

                        startActivity(intent);
                    }
                });
                textView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/watch?v=tvQ4fjhDKJQ&list=PLOIFcH-jWL05Qr_tVmN77R5NPs1y1TlI7"));

                        startActivity(intent);
                    }
                });
                textView4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UCd2ouTvXUjAdP8mALNLQrUg/videos"));

                        startActivity(intent);
                    }
                });
                textView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UC5SYegcXq8pGXdPKcrJ-krg/videos"));

                        startActivity(intent);
                    }
                });
                textView6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UCTjqb3oqGVq__6vaZM0Gc9g/videos"));

                        startActivity(intent);
                    }
                });
                textView7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UC0XdJU57X6jJubkWQjfFlEw/videos"));

                        startActivity(intent);
                    }
                });


                hiel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/channel/UC6vE3s0l6vJDNZWhn_ta-KQ"));

                        startActivity(intent);
                    }
                });

                alertDialog.show();

            }
        });




        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button testbutton;
                ViewGroup viewGroup = findViewById(android.R.id.content);
                AlertDialog.Builder builder = new AlertDialog.Builder(yschmain.this);
                View view = LayoutInflater.from(yschmain.this).inflate(R.layout.chchurchpop, viewGroup, false);
                builder.setView(view);
                TextView textView = view.findViewById(R.id.gongji);
                TextView textView1 = view.findViewById(R.id.gousoosik);
                TextView textView2 = view.findViewById(R.id.gousaummjang);

                TextView close = view.findViewById(R.id.closepop);
                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=25"));

                        startActivity(intent);
                    }
                });
                textView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=29"));

                        startActivity(intent);
                    }
                });
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=30"));

                        startActivity(intent);
                    }
                });




                alertDialog.show();

            }
        });


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=47"));

                startActivity(intent);
            }
        });

        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.ysch.or.kr/main/sub.html?pageCode=46"));

                startActivity(intent);
            }
        });


    }



}