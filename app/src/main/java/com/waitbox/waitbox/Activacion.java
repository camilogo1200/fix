package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activacion);

        accionarBoton();
    }

    private void accionarBoton(){
        Button buttonAceptar2 = (Button) findViewById(R.id.button6);
        Button buttonRch = (Button) findViewById(R.id.button5);

        buttonAceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activacion.this, ConfirmacionGPS.class));
            }
        });

        buttonRch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activacion.this, ActivarGPS.class));
            }
        });
    }
}