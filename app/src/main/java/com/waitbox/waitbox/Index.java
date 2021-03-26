package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        iniciarSesion();
        registrar();
    }

    private void iniciarSesion(){
        Button buttonIniciarSesion = (Button) findViewById(R.id.inciarSesionButton);

        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Index.this, IniciarSesion.class));
            }
        });
    }

    private void registrar(){
        Button buttonRegistrar = (Button) findViewById(R.id.registrarButton);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Index.this, Registrar.class));
            }
        });
    }
}