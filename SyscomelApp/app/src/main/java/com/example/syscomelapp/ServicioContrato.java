package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServicioContrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio_contrato);
    }

    public void VInsertaImagen(View v){
        Intent i = new Intent (this, InsertaImagen.class);
        startActivity(i);
    }
    public void VCrearEquipo(View v){
        Intent i = new Intent (this, CrearEquipo.class);
        startActivity(i);
    }

}