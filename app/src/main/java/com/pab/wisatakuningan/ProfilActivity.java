package com.pab.wisatakuningan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        name = findViewById(R.id.userabout);
        email = findViewById(R.id.email);
        String username = getIntent().getStringExtra("keyname");
        name.setText(username);
        email.setText(username+"@gmail.com");
    }
}