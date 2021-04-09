package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditarPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        accionarBotones();
    }

    private void accionarBotones(){
        Button buttonActualizarInfo = (Button) findViewById(R.id.btnEditarPerfil);
        Button buttonCambiarContrasenaPerfil = (Button) findViewById(R.id.btnCambiarContrasenaPerfil);

        buttonActualizarInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditarPerfil.this, Perfil.class));
            }
        });

        buttonCambiarContrasenaPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditarPerfil.this, EditarPerfilCambiarContrasena.class));
            }
        });
    }
}