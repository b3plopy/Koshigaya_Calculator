package com.example.koshigaya_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText num1;
    EditText num2;
    Button add;
    Button subt;
    Button multi;
    Button divide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result =(TextView) findViewById(R.id.textView2);
        num1 = (EditText) findViewById(R.id.editTextText);
        num2 = (EditText) findViewById(R.id.editTextText2);
        add = (Button) findViewById(R.id.button);
        subt = (Button) findViewById(R.id.button3);
        multi = (Button) findViewById(R.id.button4);
        divide = (Button) findViewById(R.id.button5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double sum = myNum1 + myNum2;

                result.setText(String.valueOf(sum));
            }
        });
        subt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double dif = myNum1 - myNum2;

                result.setText(String.valueOf(dif));

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double product = myNum1 * myNum2;

                result.setText(String.valueOf(product));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myNum1 = Double.parseDouble(num1.getText().toString());
                double myNum2 = Double.parseDouble(num2.getText().toString());
                double quotient = myNum1 / myNum2;

                result.setText(String.valueOf(quotient));

            }
        });


    }
}