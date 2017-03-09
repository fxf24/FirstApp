package com.example.qudqj_000.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    EditText e1, e2, e3;
    Button b1;
    TextView t1, t2;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        setTitle("레스토랑 메뉴 주문");
        program();
    }
    void program(){
        e1 = (EditText)findViewById(R.id.pizza);
        e2 = (EditText)findViewById(R.id.spaghetti);
        e3 = (EditText)findViewById(R.id.salad);
        b1 = (Button)findViewById(R.id.foodCalc);
        t1 = (TextView)findViewById(R.id.orders);
        t2 = (TextView)findViewById(R.id.orderPrice);
        c1 = (CheckBox)findViewById(R.id.membership);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                int pizzaNum = Integer.parseInt(pizza);
                String spaghetti = e2.getText().toString();
                int spaghettiNum = Integer.parseInt(spaghetti);
                String salad = e3.getText().toString();
                int saladNum = Integer.parseInt(salad);
                int orderNum = pizzaNum + spaghettiNum + saladNum;
                int orderprice = pizzaNum*15000 + spaghettiNum*13000 + saladNum*9000;

                if(c1.isChecked()){
                    orderprice = orderprice - (orderprice/10);
                }

                t1.setText(orderNum + "개");
                t2.setText(orderprice + "원");
            }
        });

    }
}
