package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UbicacionPaquete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion_paquete);

        accionarBoton();
    }

    private void accionarBoton(){
        Button buttonAceptar2 = (Button) findViewById(R.id.button);

        buttonAceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UbicacionPaquete.this, ActivarGPS.class));
            }
        });
    }
}