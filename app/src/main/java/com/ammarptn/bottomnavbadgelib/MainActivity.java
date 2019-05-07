package com.ammarptn.bottomnavbadgelib;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.ammarptn.bottomnavbadge.Badge;
import com.ammarptn.bottomnavbadge.NotificationBadge;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private TextView title;
    private BottomNavigationView bottomNavMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        bottomNavMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.home) {
                    title.setText("This is home");
                } else if (item.getItemId() == R.id.notification) {
                    title.setText("This is notification");
                } else if (item.getItemId() == R.id.mail) {
                    title.setText("This is mail");
                }
                return true;
            }
        });

        Badge badge = NotificationBadge.getBadge(bottomNavMenu, 0);
        badge.setNumber(2);

        Badge badge2 = NotificationBadge.getBadge(bottomNavMenu, 1);
        badge2.setNumber(2);

        Badge badge3 = NotificationBadge.getBadge(bottomNavMenu, 2);
        badge3.setNumber(2);




    }


    private void initView() {
        title = findViewById(R.id.title);
        bottomNavMenu = findViewById(R.id.bottom_nav_menu);
    }
}
