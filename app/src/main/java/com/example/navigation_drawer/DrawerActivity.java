package com.example.navigation_drawer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class DrawerActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TextView contentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        contentText = findViewById(R.id.contentText);

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            if (id == R.id.nav_home) {
                contentText.setText("Home Screen");

            } else if (id == R.id.nav_profile) {
                contentText.setText("Profile Screen");

            } else if (id == R.id.nav_settings) {
                contentText.setText("Settings Screen");

            } else if (id == R.id.nav_logout) {
                contentText.setText("Logout Clicked");
            }

            drawerLayout.closeDrawers();
            return true;
        });
    }
}
