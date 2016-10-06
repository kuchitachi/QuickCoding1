package com.example.eon.quickcoding1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText input3;
    private EditText input4;
    private EditText input5;

    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.et_input1);
        input2 = (EditText) findViewById(R.id.et_input2);
        input3 = (EditText) findViewById(R.id.et_input3);
        input4 = (EditText) findViewById(R.id.et_input4);
        input5 = (EditText) findViewById(R.id.et_input5);

        Button bt_Minimum = (Button) findViewById(R.id.bt_Min);

        Button bt_Average = (Button) findViewById(R.id.bt_Average);


        tv_result = (TextView) findViewById(R.id.tv_result);

        bt_Minimum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getMin();
            }
        });

        bt_Average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAvg();
            }
        });

    }

    private void getMin() {

        double n1 = Double.valueOf(input1.getText().toString());
        double n2 = Double.valueOf(input2.getText().toString());
        double n3 = Double.valueOf(input3.getText().toString());
        double n4 = Double.valueOf(input4.getText().toString());
        double n5 = Double.valueOf(input5.getText().toString());

        double arr[] = {n1, n2, n3, n4, n5};

        double min=arr[0];

        for(int i=0; i<5; i++) {
            if(min>arr[i])
                min=arr[i];
        }

        tv_result.setText("Minimum value is " + min);
    }

    private void getAvg() {

        double n1 = Double.valueOf(input1.getText().toString());
        double n2 = Double.valueOf(input2.getText().toString());
        double n3 = Double.valueOf(input3.getText().toString());
        double n4 = Double.valueOf(input4.getText().toString());
        double n5 = Double.valueOf(input5.getText().toString());

        double avg=(n1+n2+n3+n4+n5)/5;

        tv_result.setText("Average is " + avg);
    }

}

//QuickCoding1