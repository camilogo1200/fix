package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ValidacionGPS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validacion_g_p_s);
        accionarBoton();
    }

    private void accionarBoton(){
        Button buttonAceptar2 = (Button) findViewById(R.id.btnEnviarAut2);

        buttonAceptar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ValidacionGPS.this, PaginaPrincipal.class));
            }
        });
    }
}