package com.example.syscomelapp.Equipo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class EquipoClienteDAO {

    private DbHelper _dbHelper;

    public EquipoClienteDAO(Context c) {
        _dbHelper = new DbHelper(c);
    }

    public void insertar(String tipo, String marca, String modelo, String serie, String ubicacion, String contador) throws com.example.syscomelapp.Equipo.DAOException {
        Log.i("EquipoClienteDAO", "insertar()");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();
        try {
            String[] args = new String[]{tipo, marca, modelo, serie, ubicacion, contador};
            db.execSQL("INSERT INTO equipo(tipo, marca, modelo, serie, ubicacion, contador) VALUES(?,?,?,?,?,?)", args);
            Log.i("EquipoClienteDAO", "Se insertó");
        } catch (Exception e) {
            throw new DAOException("EquipoClienteDAO: Error al insertar: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }
}
