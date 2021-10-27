package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView tv1;
    private EditText et1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.b1);
        tv1=findViewById(R.id.v1);
        et1=findViewById(R.id.t1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=et1.getText().toString();
                int a=Integer.parseInt(s);
                double pound=2.205*a;
                tv1.setText("Ans:" +pound);
            }
        });
    }
}