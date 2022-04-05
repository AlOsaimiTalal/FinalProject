package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jobs_books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_books);
        getSupportActionBar().hide();

        Button buyB1= findViewById(R.id.button5);
        Button buyB2= findViewById(R.id.button);
        Button buyB3= findViewById(R.id.button3);
        Button buyB4= findViewById(R.id.button4);
        Button buyB5 = findViewById(R.id.button96);
        Button buyB6 = findViewById(R.id.button94);


        buyB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/dp/1573225517?tag=mostrecommendedbooks-20&geniuslink=true");
            }
        });

        buyB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/dp/0226458121?tag=mostrecommendedbooks-20&geniuslink=true");

            }
        });

        buyB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/dp/0385483821?tag=mostrecommendedbooks-20&geniuslink=true");
            }
        });

        buyB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/dp/1884772005?tag=mostrecommendedbooks-20&geniuslink=true");
            }
        });
        buyB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/dp/0375705104?tag=mostrecommendedbooks-20&geniuslink=true");
            }
        });
        buyB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Meditation-Shambhala-Library-Chogyam-2004-11-16/dp/B01K3HQ72Y/ref=tmm_hrd_swatch_0?_encoding=UTF8&qid=&sr=");
            }
        });
    }

    private void gotUr1(String s) {

        Uri uri = Uri.parse(s);
        Intent amazonB1 = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(amazonB1);
    }
}

