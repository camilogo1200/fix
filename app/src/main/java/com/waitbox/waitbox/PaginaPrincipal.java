package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        accionarBotones();
    }

    private void accionarBotones(){
        Button buttonIniciarSesionPA = (Button) findViewById(R.id.btnChatHome6);
        Button buttonCHATPA = (Button) findViewById(R.id.btnChatHome);
        Button buttonPQRPA = (Button) findViewById(R.id.btnPQRHome);
        Button buttonBoxPA = (Button) findViewById(R.id.btnBoxHome);
        Button buttonPerfilPA = (Button) findViewById(R.id.btnPerfilHome);
        Button BTNgps = (Button) findViewById(R.id.btnCambiarContrasenaPerfil2);

        BTNgps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, UbicacionPaquete.class));
            }
        });

        buttonIniciarSesionPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, Index.class));
            }
        });

        buttonCHATPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, Index.class));
            }
        });

        buttonPQRPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, PQR.class));
            }
        });


        buttonBoxPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, Index.class));
            }
        });

        buttonPerfilPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PaginaPrincipal.this, Perfil.class));
            }
        });
    }
}