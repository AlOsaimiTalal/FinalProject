package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class billPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_page);

        Button buyB1= findViewById(R.id.button5);
        Button buyB2= findViewById(R.id.button);
        Button buyB3= findViewById(R.id.button3);
        Button buyB4= findViewById(R.id.button4);
        Button buyB5 = findViewById(R.id.button96);
        Button buyB6 = findViewById(R.id.button94);


        buyB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Thousand-Brains-New-Theory-Intelligence/dp/1541675819");
            }
        });

        buyB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Code-Breaker-Jennifer-Doudna-Editing/dp/1982115858");

            }
        });

        buyB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Klara-Sun-novel-Kazuo-Ishiguro/dp/059331817X");
            }
        });

        buyB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Hamnet-Maggie-OFarrell/dp/1984898876/ref=tmm_pap_swatch_0?_encoding=UTF8&qid=&sr=");
            }
        });
        buyB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Project-Hail-Mary-Andy-Weir/dp/0593135202/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=1648910440&sr=8-1");
            }
        });
        buyB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Range-Generalists-Triumph-Specialized-World/dp/0735214484/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=1648910549&sr=8-1");
            }
        });
    }

    private void gotUr1(String s) {

        Uri uri = Uri.parse(s);
        Intent amazonB1 = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(amazonB1);
    }
}