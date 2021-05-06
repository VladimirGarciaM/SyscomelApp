package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.syscomelapp.Cliente.DAOException;
import com.example.syscomelapp.Cliente.UsuarioClienteDAO;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void RegistroCliente(View view) {

        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText apellido = (EditText) findViewById(R.id.apellido);
        EditText correoelectronico = (EditText) findViewById(R.id.correoelectronico);
        EditText empresa = (EditText) findViewById(R.id.empresa);
        EditText direccion = (EditText) findViewById(R.id.direccion);
        EditText telefono = (EditText) findViewById(R.id.telefono);
        EditText contrasena = (EditText) findViewById(R.id.contrasena);

        UsuarioClienteDAO dao = new UsuarioClienteDAO(getBaseContext());
        try {

            String unombre, uapellido, ucorreoelectronico, uempresa, udireccion,utelefono, ucontrasena;

            unombre = nombre.getText().toString();
            uapellido = apellido.getText().toString();
            ucorreoelectronico = correoelectronico.getText().toString();
            uempresa = correoelectronico.getText().toString();
            udireccion = direccion.getText().toString();
            utelefono = telefono.getText().toString();
            ucontrasena = contrasena.getText().toString();

            if (!unombre.isEmpty() && !uapellido.isEmpty() && !ucorreoelectronico.isEmpty() && !uempresa.isEmpty() &&  !udireccion.isEmpty() &&  !utelefono.isEmpty()  && !ucontrasena.isEmpty()) {
            //dao.eliminarTodos();
            dao.insertar(nombre.getText().toString(), apellido.getText().toString(), correoelectronico.getText().toString(), empresa.getText().toString(), direccion.getText().toString(), telefono.getText().toString(), contrasena.getText().toString());

            Toast toast= Toast.makeText(getApplicationContext(), "Se registró correctamente", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER|Gravity.CENTER_HORIZONTAL, 0, 0);
            toast.show();

            nombre.setText("");
            apellido.setText("");
            correoelectronico.setText("");
            empresa.setText("");
            direccion.setText("");
            telefono.setText("");
            contrasena.setText("");

            Intent i = new Intent (this,Login.class);
            startActivity(i);
            }
            else {
                Toast.makeText(getBaseContext(),"Por favor ingrese los datos correctamente", Toast.LENGTH_LONG).show();
            }
        } catch (DAOException e) {
            Log.i("UsuarioClienteNuevoActi", "====> " + e.getMessage());
        }

    }

}