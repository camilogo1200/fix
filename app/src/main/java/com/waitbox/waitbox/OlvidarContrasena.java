package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OlvidarContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olvidar_contrasena);

        enviarEmailOlvidarContrasena();
    }

    private void enviarEmailOlvidarContrasena(){
        Button buttonIniciarSesion = (Button) findViewById(R.id.btnContinuar);

        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OlvidarContrasena.this, CambiarContrasenaIndex.class));
            }
        });
    }
}