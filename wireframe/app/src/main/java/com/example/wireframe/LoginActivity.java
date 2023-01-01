package com.example.wireframe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageView image = (ImageView)findViewById(R.id.logo);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation1);
        RelativeLayout ly = (RelativeLayout)findViewById(R.id.relativeLayout);
        Animation anm =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        ly.startAnimation(anm);

        b1 = findViewById(R.id.button);
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);


        b1.setOnClickListener(v -> {
            if(ed1.getText().toString().equals("ardian") &&
                    ed2.getText().toString().equals("praktikum")) {
                Toast.makeText(getApplicationContext(),
                        "Yeyy..Berhasil...",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), LoadingLoginActivity.class));
            }else if(ed1.getText().toString().equals("admin") &&
                    ed2.getText().toString().equals("admin")) {
                Toast.makeText(getApplicationContext(),
                        "Admin Mode...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), AdminActivity.class));
            }else{
                Toast.makeText(getApplicationContext(), "Gagal ygy, coba lagi anda kurang beruntung",Toast.LENGTH_SHORT).show();

            }
        });



    }

}