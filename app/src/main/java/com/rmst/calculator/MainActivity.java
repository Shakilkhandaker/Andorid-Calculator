package com.rmst.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button point;


    private TextView operation;
    private TextView result;

    private Button sum;
    private Button sub;
    private Button mult;
    private Button divi;
    private Button equal;

    private double val1 = Double.NaN;
    private double val2 = Double.NaN ;

    private final char add = '+';
    private final char subs = '-';
    private final char multi = '*';
    private final char divis = '/';
    private char Action ;
    private final char Eq = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"0");


            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"1");


            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"2");


            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"3");


            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"4");


            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"5");


            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"6");


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"7");


            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"8");


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+"9");


            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operation.setText(operation.getText().toString()+".");


            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computing();
                Action = add;
                result.setText(String.valueOf(val1));
                operation.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computing();
                Action = subs;
                result.setText(String.valueOf(val1));
                operation.setText(null);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computing();
                Action = multi;
                result.setText(String.valueOf(val1));
                operation.setText(null);
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computing();
                Action = divis;
                result.setText(String.valueOf(val1));
                operation.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computing();
                Action = Eq;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+ String.valueOf(val1));
                operation.setText(null);
            }
        });


    }
    private void setupUIViews(){
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        zero = (Button)findViewById(R.id.btn10);
        point = (Button)findViewById(R.id.btn18);
        operation = (TextView)findViewById(R.id.textview);
        result = (TextView)findViewById(R.id.textview1);
        sum = (Button)findViewById(R.id.btn13);
        sub = ( Button)findViewById(R.id.btn14);
        mult = (Button)findViewById(R.id.btn15);
        divi = (Button)findViewById(R.id.btn16);
        equal = (Button)findViewById(R.id.btn17);





    }
    private void computing (){
        if (!Double.isNaN(val1)){
            switch (Action){
                case add:
                    val1 = val1+val2;
                    break;
                case subs:
                    val1 = val1-val2;
                    break;
                case multi:
                    val1 = val1*val2;
                    break;
                case divis:
                    val1 = val1/val2;
                    break;
                case Eq:
                    break;
            }

        }
        else{
            val1 = Double.parseDouble(operation.getText().toString());
        }

    }

}
