package com.example.syscomelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Contrasena extends AppCompatActivity{

    EditText receiverEmail;

    Button BtnSendEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contrasena);

        receiverEmail=(EditText)findViewById(R.id.receiverEmail);

        BtnSendEmail=(Button) findViewById(R.id.SendEmail);

        BtnSendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String receiver=receiverEmail.getText().toString();


                sendEmail("syscomelapp@gmail.com","Syscomel123.",receiver,"Recuperar Contaseña","Su contraseña es: 12345");
            }
        });

    }

    private void sendEmail(final String Sender,final String Password,final String Receiver,final String Title,final String Message)
    {

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    GMailSender sender = new GMailSender("syscomelapp@gmail.com","Syscomel123.");
                    sender.sendMail(Title, "<b>"+"Su contraseña temporal es: 12345"+"</b>", Sender, Receiver);
                    makeAlert();

                } catch (Exception e) {
                    Log.e("SendMail", e.getMessage(), e);
                }
            }

        }).start();
    }
    private void makeAlert(){
        this.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(Contrasena.this, "Correo enviado exitosamente!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

