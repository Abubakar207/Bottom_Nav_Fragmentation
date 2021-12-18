package com.example.assignment_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.assignment_3.Fragment.CoursesFragment;
import com.example.assignment_3.Fragment.HomeFragment;
import com.example.assignment_3.Fragment.SectionsFragment;
import com.example.assignment_3.Fragment.StudentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.Home) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.main,new HomeFragment());
                    ft.commit();
        } else if (item.getItemId() == R.id.Courses) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.main,new CoursesFragment());
                    ft.commit();
        } else if (item.getItemId() == R.id.Sections) {
                    Intent intent = new Intent(MainActivity.this, SectionAct.class);
                    startActivity(intent);
        } else if (item.getItemId() == R.id.Student) {
                    FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.main,new StudentFragment());
                    ft.commit();
        }
            }
        });
    }

}