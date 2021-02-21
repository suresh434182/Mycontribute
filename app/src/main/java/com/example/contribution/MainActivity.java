package com.example.contribution;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.razorpay.Checkout;

public class MainActivity extends AppCompatActivity  {
    private Button btn;
    private TextView paytext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Checkout.preload(getApplicationContext());
        btn = (Button) findViewById(R.id.Paybtn);
        paytext = (TextView) findViewById(R.id.Paytext);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Basic_form.class);

                startActivity(intent);
            }
        });
    }


}