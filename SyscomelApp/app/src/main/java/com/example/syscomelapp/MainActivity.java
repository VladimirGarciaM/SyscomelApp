package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Siguiente(View v){
        Intent i = new Intent (this, Login.class);
        startActivity(i);
    }

    public void Mapa(View v){
        Intent i = new Intent (this, MapaBasicoActivity.class);
        startActivity(i);
    }

}