package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Servicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);

        Button btCall = findViewById(R.id.btCall);

        btCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String phone = "tel:(511)5570874";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(phone));
                startActivity(intent);
            }
        });
    }


    public void VServicioContrato(View v){
        Intent i = new Intent (this, ServicioContrato.class);
        startActivity(i);
    }

    public void VServicioNuevo(View v){
        Intent i = new Intent (this, ServicioNuevo.class);
        startActivity(i);
    }
}