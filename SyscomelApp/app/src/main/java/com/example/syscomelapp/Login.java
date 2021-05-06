package com.example.syscomelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void VContrasena(View v){
        Intent i = new Intent (this, Contrasena.class);
        startActivity(i);
    }

    public void VRegistro(View v){
        Intent i = new Intent (this, registro.class);
        startActivity(i);
    }

    public void Vservicio(View v){
        Intent i = new Intent (this, Servicio.class);
        startActivity(i);
    }

}

