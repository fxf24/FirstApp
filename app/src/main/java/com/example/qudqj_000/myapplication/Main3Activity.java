package com.example.qudqj_000.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1, e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("나이 계산기");
        program();
    }

    void program(){
        b1 = (Button)findViewById(R.id.ageCalc);
        b2 = (Button)findViewById(R.id.yearCalc);
        e1 = (EditText)findViewById(R.id.birthYear);
        e2 = (EditText)findViewById(R.id.age);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String birthyear = e1.getText().toString();
                int age = 2017 - Integer.parseInt(birthyear) +1;
                Toast.makeText(Main3Activity.this, "당신의 나이는 " + age + "세 입니다.", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int birthyear = 2017 - Integer.parseInt(age) +1;
                Toast.makeText(Main3Activity.this, "당신이 태어난 해는" + birthyear + "년입니다.", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
