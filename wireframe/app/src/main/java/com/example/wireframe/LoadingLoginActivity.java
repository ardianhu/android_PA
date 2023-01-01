package com.example.wireframe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingLoginActivity extends AppCompatActivity {
    TextView ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_login);
        startNewActivity();
        ed = findViewById(R.id.textsuccess);
        ed.bringToFront();
        Button ly = (Button)findViewById(R.id.button);
        Animation anm =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        ly.startAnimation(anm);
    }
    private void startNewActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent newAct = new Intent(LoadingLoginActivity.this, HomeActivity.class);
                startActivity(newAct);
                finish();
            }
        }, 1500);
    }
}
