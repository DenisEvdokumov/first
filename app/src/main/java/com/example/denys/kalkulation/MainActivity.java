package com.example.denys.kalkulation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    EditText editText1;
    EditText editText2;
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        editText1 = (EditText) findViewById(R.id.editText3);
        editText2 = (EditText) findViewById(R.id.editText4);
        textView = (TextView) findViewById(R.id.textView2);


//        button1.setOnClickListener(this);
//        button2.setOnClickListener(this);
//        button3.setOnClickListener(this);
//        button4.setOnClickListener(this);

    }

        @Override
        public void onClick(View v) {
            if (TextUtils.isEmpty(editText1.getText().toString())
              ||TextUtils.isEmpty(editText2.getText().toString())){
                return;
            }
            String oper = "";
            float res = 0;
            float num1 = 1;
            float num2 = 2;
            num1 = Float.parseFloat(editText1.getText().toString());
            num2 = Float.parseFloat(editText2.getText().toString());
            switch (v.getId()){
                case R.id.button1:
                    oper = "-";
                    res = num1 -num2;
                    break;
                case R.id.button2:
                    oper = "+";
                    res =num1 + num2;
                    break;
                case R.id.button3:
                    oper = "*";
                    res =num1 * num2;
                    break;
                case R.id.button4:
                    oper = "/";
                    res =num1 / num2;
                    break;

        }
             textView.setText(num1 + " " + oper + " " + num2 + "=" + res);


        }
    }
