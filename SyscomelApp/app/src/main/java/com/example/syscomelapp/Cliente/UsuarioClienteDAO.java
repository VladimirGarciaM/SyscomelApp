package com.example.syscomelapp.Cliente;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class UsuarioClienteDAO {

    private DbHelper _dbHelper;

    public UsuarioClienteDAO(Context c) {

        _dbHelper = new DbHelper(c);
    }

    public void insertar(String nombre, String apellido, String correoelectronico, String empresa, String direccion, String telefono, String contrasena) throws DAOException {
        Log.i("UsuarioClienteDAO", "insertar()");
        SQLiteDatabase db = _dbHelper.getWritableDatabase();
        try {
            String[] args = new String[]{nombre, apellido, correoelectronico, empresa, direccion, telefono, contrasena};
            db.execSQL("INSERT INTO usuario(nombre, apellido, correoelectronico, empresa, direccion, telefono, contrasena) VALUES(?,?,?,?,?,?,?)", args);
            Log.i("UsuarioClienteDAO", "Se insertó");
        } catch (Exception e) {
            throw new DAOException("UsuarioClienteDAO: Error al insertar: " + e.getMessage());
        } finally {
            if (db != null) {
                db.close();
            }
        }
    }
}
