package com.example.wireframe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private MenuItem item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        this.item = item;
        int id = item.getItemId();
        if (id == R.id.action_overflow){
            Toast.makeText(this, "menu pengaturan", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (id == R.id.action_search){
            Toast.makeText(this, "menu akun", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
    public void proses(View view){
        AlertDialog dialogbox = createDialogBox();
        dialogbox.show();
    }

    private AlertDialog createDialogBox() {
        AlertDialog dialogbox=new AlertDialog.Builder(this)
                .setTitle("Beli")
                .setMessage("Yakin udah mau beli nih?")
                .setPositiveButton("Iya Dong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), BeliActivity.class));
                    }
                })
                .setNeutralButton("Ga jadi deh", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int wich) {
                        Toast.makeText(getApplicationContext(), "yey ga jadi", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
        return dialogbox;
    }

}