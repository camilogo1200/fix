package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CodigoIngreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_ingreso);

        iniciarSesionPaginaPrincipa();
    }

    private void iniciarSesionPaginaPrincipa(){
        Button buttonIniciarSesionPA = (Button) findViewById(R.id.btnIniciarSesion_is2);

        buttonIniciarSesionPA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CodigoIngreso.this, PaginaPrincipal.class));
            }
        });
    }
}