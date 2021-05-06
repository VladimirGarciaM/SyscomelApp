package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaBasicoActivity extends AppCompatActivity implements OnMapReadyCallback {

    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_basico);

        mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.setTrafficEnabled(true);
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-12.1220844, -77.0113738))
                .title("Oficina Syscomel SAC"));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-12.1219336, -77.0121056))
                .title("Almacén 1 Syscomel SAC"));

        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(-12.1220613, -77.0110971))
                .title("Almacén 2 Syscomel SAC"));


        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(-12.1220844, -77.0113738), 16));

    }

}

