package com.example.assignment_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.assignment_3.Fragment.CoursesFragment;
import com.example.assignment_3.Fragment.HomeFragment;
import com.example.assignment_3.Fragment.StudentFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SectionAct extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        bottomNavigationView = findViewById(R.id.nav);


    }

}
