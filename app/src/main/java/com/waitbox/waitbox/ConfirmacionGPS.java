package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmacionGPS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_g_p_s);

        accionarBoton();
    }

    private void accionarBoton(){
        Button buttonAceptar = (Button) findViewById(R.id.btnEnviarAut);

        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConfirmacionGPS.this, ValidacionGPS.class));
            }
        });
    }
}