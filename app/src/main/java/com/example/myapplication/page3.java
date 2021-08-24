package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        ImageView n =findViewById(R.id.btRegister1);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ety = new Intent(page3.this, login.class);
                //intent.putExtra("EXTRA_SESSION_ID", count);
                startActivity(ety);
            }
        });
    }
    }
