package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class splash extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_action, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();






        Button gatesBooks= findViewById(R.id.button2);
        Button jobsBooks= findViewById(R.id.button);

        gatesBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gatesLib = new Intent(splash.this,quotesORbooks_bill.class);
                startActivity(gatesLib);
            }
        });

        jobsBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent jobsLib = new Intent(splash.this,jobsPage.class);
                startActivity(jobsLib);
            }
        });



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
            case R.id.menu2:
            case R.id.menu3:
            case R.id.menu4:

                return true;
            default:return super.onOptionsItemSelected(item);
        }



    }
}