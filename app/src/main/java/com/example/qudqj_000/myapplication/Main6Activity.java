package com.example.qudqj_000.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2 ,b3 ,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        setTitle("계산기");
        program();
    }
    void program(){
        e1 = (EditText)findViewById(R.id.firstInt);
        e2 = (EditText)findViewById(R.id.secondInt);
        b1 = (Button)findViewById(R.id.add);
        b2 = (Button)findViewById(R.id.subtract);
        b3 = (Button)findViewById(R.id.multiply);
        b4 = (Button)findViewById(R.id.divide);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||
                        e1.getText().toString().equals(null)||e2.getText().toString().equals(null)){
                    Toast.makeText(Main6Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(e1.getText().toString().equals("")||e1.getText().toString().equals(null)){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }
                }
                else{
                    String fint = e1.getText().toString();
                    String sint = e2.getText().toString();
                    int first = Integer.parseInt(fint);
                    int second = Integer.parseInt(sint);
                    Toast.makeText(Main6Activity.this,
                            "더하기 계산 결과는 "+(first + second)+"입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||
                        e1.getText().toString().equals(null)||e2.getText().toString().equals(null)){
                    Toast.makeText(Main6Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(e1.getText().toString().equals("")||e1.getText().toString().equals(null)){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }
                }
                else{
                    String fint = e1.getText().toString();
                    String sint = e2.getText().toString();
                    int first = Integer.parseInt(fint);
                    int second = Integer.parseInt(sint);
                    Toast.makeText(Main6Activity.this,
                            "빼기 계산 결과는 "+(first - second)+"입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||
                        e1.getText().toString().equals(null)||e2.getText().toString().equals(null)){
                    Toast.makeText(Main6Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(e1.getText().toString().equals("")||e1.getText().toString().equals(null)){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }
                }
                else{
                    String fint = e1.getText().toString();
                    String sint = e2.getText().toString();
                    int first = Integer.parseInt(fint);
                    int second = Integer.parseInt(sint);
                    Toast.makeText(Main6Activity.this,
                            "곱하기 계산 결과는 "+(first * second)+"입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")||
                        e1.getText().toString().equals(null)||e2.getText().toString().equals(null)){
                    Toast.makeText(Main6Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                    if(e1.getText().toString().equals("")||e1.getText().toString().equals(null)){
                        e1.requestFocus();
                    }
                    else{
                        e2.requestFocus();
                    }
                }
                else{
                    String fint = e1.getText().toString();
                    String sint = e2.getText().toString();
                    int first = Integer.parseInt(fint);
                    int second = Integer.parseInt(sint);
                    Toast.makeText(Main6Activity.this,
                            "나누기 계산 결과는 "+(first / second)+"입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
