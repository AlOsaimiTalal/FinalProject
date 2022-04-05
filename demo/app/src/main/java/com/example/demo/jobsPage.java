package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class jobsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_page);

        ImageView recJJ = findViewById(R.id.buttonRecB);
        ImageView qoutesJJ = findViewById(R.id.QuotesB);

getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recJJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recBJ = new Intent(jobsPage.this,jobs_books.class);
                startActivity(recBJ);

            }
        });



    }
}