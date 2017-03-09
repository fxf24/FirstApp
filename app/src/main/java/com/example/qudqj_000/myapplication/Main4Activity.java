package com.example.qudqj_000.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("온도변환기");
        program();
    }

    void program(){
        b1 = (Button)findViewById(R.id.FCalc);
        b2 = (Button)findViewById(R.id.CCalc);
        e1 = (EditText)findViewById(R.id.tempC);
        e2 = (EditText)findViewById(R.id.tempF);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String c = e1.getText().toString();
                double f = Float.parseFloat(c)*1.8 + 32.0;
                Toast.makeText(Main4Activity.this, "화씨 온도는 " + f + "도 입니다.", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f = e2.getText().toString();
                double c = (Float.parseFloat(f)-32.0)/1.8;
                Toast.makeText(Main4Activity.this, "섭씨 온도는 " + c + "도 입니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
