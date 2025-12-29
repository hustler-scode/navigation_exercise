package com.example.navigation_drawer;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    TextView contentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        contentText = findViewById(R.id.contentText);

        navigationView.setNavigationItemSelectedListener(item -> {

            if (item.getItemId() == R.id.nav_home) {
                contentText.setText("Home Screen");
            } else if (item.getItemId() == R.id.nav_profile) {
                contentText.setText("Profile Screen");
            } else if (item.getItemId() == R.id.nav_settings) {
                contentText.setText("Settings Screen");
            }

            drawerLayout.closeDrawers();
            return true;
        });
    }
}
