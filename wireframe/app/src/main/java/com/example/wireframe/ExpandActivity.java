package com.example.wireframe;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ExpandActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(v ->{
            finish();
        });
    }
}
