package com.example.wireframe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    GridView gridView;

    int[] iconList = new int[]{
            R.drawable.ah, R.drawable.at,
            R.drawable.rs, R.drawable.sb,
            R.drawable.ah, R.drawable.at,
            R.drawable.rs, R.drawable.sb
    };

    String[] Headline = {"Al-Hakim", "At-Tirmidzi",
            "Riyadhus Sholihin", "Shohih Bukhori",
            "Al-Hakim", "At-Tirmidzi",
            "Riyadhus Sholihin", "Shohih Bukhori"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridViewCustom gridViewCustom = new GridViewCustom(HomeActivity.this, iconList, Headline);
        gridView = findViewById(R.id.grid_view);
        gridView.setAdapter(gridViewCustom);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(HomeActivity.this, "" + Headline[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}