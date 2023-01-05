package com.example.wireframe;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {
    private EditText userEdt, passwordEdt;
    private Spinner typeSpinner;
    private DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        userEdt = findViewById(R.id.idEditUserName);
        passwordEdt = findViewById(R.id.idEdtPassword);
        Button userAdd = findViewById(R.id.idBtnAddUser);

        dbHandler = new DBHandler(AdminActivity.this);

        userAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String userName = userEdt.getText().toString();
                String userPassword = passwordEdt.getText().toString();

                if (userName.isEmpty() && userPassword.isEmpty()){
                    Toast.makeText(AdminActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                }
                dbHandler.addNewUser(userName, userPassword);

                Toast.makeText(AdminActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();
                userEdt.setText("");
                passwordEdt.setText("");
            }
        });
    }
}
