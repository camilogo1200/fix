package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CambiarContrasenaIndex extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cambiar_contrasena_index);

        accionarBotones();
    }

    private void accionarBotones(){
        Button buttonCambiarCont = (Button) findViewById(R.id.btnGuardarCont);

        buttonCambiarCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CambiarContrasenaIndex.this, IniciarSesion.class));
            }
        });
    }
}