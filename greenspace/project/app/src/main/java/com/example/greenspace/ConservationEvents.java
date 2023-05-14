package com.example.greenspace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ConservationEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conservation_events);

        ImageView homebutton = findViewById(R.id.homebtn);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();

            }
        });


        ImageView groupsbutton = findViewById(R.id.groupsbtn);
        groupsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, GroupsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();

            }
        });

        ImageView searchbutton = findViewById(R.id.searchbtn);
        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, SearchFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // name can be null
                        .commit();

            }
        });
    }
}