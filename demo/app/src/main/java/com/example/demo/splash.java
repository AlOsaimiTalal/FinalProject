package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class splash extends AppCompatActivity {
    FragmentManager fragmentmanager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        BottomNavigationView bottomnav =findViewById(R.id.bottomNavigation);



        fragmentmanager =getSupportFragmentManager();
        Fragment frg = new HomeFragment();
        fragmentmanager.beginTransaction().replace(R.id.FragmentContainer,frg).commit();







       bottomnav.setOnNavigationItemSelectedListener(navlistiner);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navlistiner =
            new BottomNavigationView.OnNavigationItemSelectedListener(){
       public boolean onNavigationItemSelected(MenuItem item){
           Fragment selectedFragment = null;

           switch (item.getItemId()){
               case R.id.homeScreen:
                   selectedFragment = new HomeFragment();
                   fragmentmanager.beginTransaction().replace(R.id.FragmentContainer,
                           selectedFragment).commit();
                   return true;

               case R.id.whyScreen:
                   selectedFragment = new WhyFragment();
                   fragmentmanager.beginTransaction().replace(R.id.FragmentContainer,
                           selectedFragment).commit();
                   return true;

               case R.id.tipsScreen:
                   selectedFragment = new TipsFragment();
                   fragmentmanager.beginTransaction().replace(R.id.FragmentContainer,
                           selectedFragment).commit();
                   return true;

           }


           return false;
       }
            };

}