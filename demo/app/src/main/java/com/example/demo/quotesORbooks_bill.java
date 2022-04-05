package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class quotesORbooks_bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_orbooks_bill);

        ImageView recBB = findViewById(R.id.buttonRecB);
        ImageView QuoB = findViewById(R.id.QuotesB);


        recBB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recB = new Intent(quotesORbooks_bill.this,billPage.class);
                startActivity(recB);
            }
        });

        QuoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent qouB = new Intent(quotesORbooks_bill.this,qoutes_bill.class);
                startActivity(qouB);
            }
        });


    }
}