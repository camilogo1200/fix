package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditarPerfilCambiarContrasena extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil_cambiar_contrasena);

        accionarBotones();
    }

    private void accionarBotones(){
        Button buttonCambiarContrasenaPerfil2 = (Button) findViewById(R.id.btnCambiarContPerfil);

        buttonCambiarContrasenaPerfil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditarPerfilCambiarContrasena.this, Perfil.class));
            }
        });

    }
}