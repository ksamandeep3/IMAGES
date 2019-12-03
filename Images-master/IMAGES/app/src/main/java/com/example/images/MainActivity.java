package com.example.images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText et1,et2;
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etuser);
        et2 = findViewById(R.id.etpass);
        bt1 = findViewById(R.id.btnlog);
       //click listener on button
        bt1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (et1.getText().toString().equals("admin") || et2.getText().toString().equals("admin")) {
            Intent act = new Intent(getApplicationContext(),Main2Activity.class);
            //starting an intent
            startActivity(act);

            //correcct password
        } else {
            Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            //wrong password
        }
    }}