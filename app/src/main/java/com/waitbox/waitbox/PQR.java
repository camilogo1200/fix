package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PQR extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_q_r);
        accionarBoton();

    }

    private void accionarBoton(){
        Button buttonGrd = (Button) findViewById(R.id.button2);

        buttonGrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PQR.this, PaginaPrincipal.class));
            }
        });
    }
}