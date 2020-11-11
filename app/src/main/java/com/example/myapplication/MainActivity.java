package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
//import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDiv, btnMult, btnSub, btnClear, btnEqual, btnAdd;
    TextView textView;
    String mathExpresion;
    Integer value1 = 0, value2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);
        btnEqual = findViewById(R.id.btnEqual);
        btnClear = findViewById(R.id.btnClear);

        textView = findViewById(R.id.textView);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                value1 = 0;
                value2 = 0;
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "0");
                if (value1 != 0){
                    value1 = (value1 * 10) + 0;
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "1");
                if (value1 != 0){
                    value1 = (value1 * 10) + 1;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "2");
                if (value1 != 0){
                    value1 = (value1 * 10) + 2;
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "3");
                if (value1 != 0){
                    value1 = (value1 * 10) + 3;
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "4");
                if (value1 != 0){
                    value1 = (value1 * 10) + 4;
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "5");
                if (value1 != 0){
                    value1 = (value1 * 10) + 5;
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "6");
                if (value1 != 0){
                    value1 = (value1 * 10) + 6;
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "7");
                if (value1 != 0){
                    value1 = (value1 * 10) + 7;
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "8");
                if (value1 != 0){
                    value1 = (value1 * 10) + 8;
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + "9");
                if (value1 != 0){
                    value1 = (value1 * 10) + 9;
                }
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + " + ");
                value2 = value2 + value1;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + " - ");
                value2 = value2 - value1;
            }
        });

       /* btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + " * ")
            }
        });
         btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mathExpresion = textView.getText().toString();
                textView.setText(mathExpresion + " / ");
            }
        });
        */

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("answer : " + value2);
                value1 = 0;
                value2 = 0;
            }
        });




    }
    public void btnZero (View view){

    }
    public void btnOne (View view){

    }
    public void btnTwo (View view){

    }
    public void btnThree (View view){

    }
    public void btnFour (View view){

    }
    public void btnFive (View view){

    }
    public void btnSix (View view){

    }
    public void btnSeven (View view){

    }
    public void btnEight (View view){

    }
    public void btnNine (View view){

    }
    public void btnAdd (View view){

    }
    public void btnSub (View view){
        //kalispera
    }
    public void btnMult (View view){

    }
    public void btnDiv (View view){

    }
    public void btnClear (View view){
        //kalispera
        //oxi lol

    }

    // re mlkes... XD tosh wra grafame se allou fakelous... XDDDDDDDDDDDDDDDDDDDDDDDD
    // egw egrafa ekei pou o mike iexe kanei tis prwtes allages... sthn MainActivity tou project... terma katw me ton portokalokafeti kuklo...


    //TextView textElement;
   // setContentView(R.layout.activity_main)
   // newtext = (TextView) findViewById(R.id.TextView);



   // public void nine (View view){
      //  textView.setText(TextView + "9");
    //}

}