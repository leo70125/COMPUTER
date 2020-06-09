package com.example.happy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();//查log
    private TextView tv1;
    private Button bt;//+
    private Button bt1;//-
    private Button bt2;//*
    private Button bt3;// /
    private Button bt4;//=
    private Button button;//0
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button spot;//.
    private Button ac;//AC
    private Button percentage; //%
    String a = "";
    String b = "";
    static int q = 1;
    static int w = 2;
    static int e = 3;
    static int r = 4;
    static int x = 5;
    int z;
    String g = "";
    String l = "0.01";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        bt = findViewById(R.id.bt);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        spot = findViewById(R.id.spot);
        ac = findViewById(R.id.ac);
//        percentage =findViewById(R.id.percentage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button.getText().toString();
                tv1.setText(a);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button1.getText().toString();
                tv1.setText(a);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button2.getText().toString();
                tv1.setText(a);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button3.getText().toString();
                tv1.setText(a);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button4.getText().toString();
                tv1.setText(a);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button5.getText().toString();
                tv1.setText(a);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button6.getText().toString();
                tv1.setText(a);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button7.getText().toString();
                tv1.setText(a);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button8.getText().toString();
                tv1.setText(a);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += button9.getText().toString();
                tv1.setText(a);
            }
        });

        spot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a += spot.getText().toString() ;
                tv1.setText(a);
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = g;
                a = g;
                tv1.setText(g);
            }
        });


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = "";
                z = q;

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = "";
                z = w;
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = "";
                z = e;
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = a;
                a = "";
                z = r;
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.w(TAG, "z = " + z);//查log
                double c = 0;
                double k = 100;
                switch (z) {
                    case 1:
                        c = Double.parseDouble(b) + Double.parseDouble(a);
                        b = String.valueOf(c);
                        a = "";
                        break;
                    case 2:
                        Log.v(TAG, "a = " + a);//查log
                        Log.i(TAG, "b = " + b);//查log
                        c = Double.parseDouble(b) - Double.parseDouble(a);
                        b = String.valueOf(c);
                        a = "";
                        break;
                    case 3:
                        c = Double.parseDouble(b) * Double.parseDouble(a);
                        b = String.valueOf(c);
                        a = "";
                        break;
                    case 4:
                        c = Double.parseDouble(b) / Double.parseDouble(a);
                        b = String.valueOf(c);
                        a = "";
                        break;

                }
                if (o(c)) {
                    tv1.setText(String.valueOf((int) c));
                } else {
                    tv1.setText(String.valueOf(c));
                }


                Log.e(TAG, "ans = " + c);//查log
            }


        });

    }

    private static boolean o(Double x) {
        double j = 1e-10;
        return x - Math.floor(x) < j;//判斷是否整數
    }
}