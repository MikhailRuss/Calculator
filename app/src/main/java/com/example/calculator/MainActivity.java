package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText text;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPlus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initElements();
        clickButton();


    }
    private void clickButton(){

        btn0.setOnClickListener(view -> winEditText("0"));
        btn1.setOnClickListener(view -> winEditText("1"));
        btn2.setOnClickListener(view -> winEditText("2"));
        btn3.setOnClickListener(view -> winEditText("3"));
        btn4.setOnClickListener(view -> winEditText("4"));
        btn5.setOnClickListener(view -> winEditText("5"));
        btn6.setOnClickListener(view -> winEditText("6"));
        btn7.setOnClickListener(view -> winEditText("7"));
        btn8.setOnClickListener(view -> winEditText("8"));
        btn9.setOnClickListener(view -> winEditText("9"));
        btnPlus.setOnClickListener(view -> winEditText("+"));



    }
    private void initElements(){
        text = findViewById(R.id.calc_text);
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnPlus = findViewById(R.id.plus_button_view);


    }

    private void winEditText(String butNumber) {
        text.setText(text.getText().toString()+butNumber);

    }
}