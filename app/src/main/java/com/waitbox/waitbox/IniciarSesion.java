package com.waitbox.waitbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        OlvidarContrasena();
        iniciarSesion();

        Spinner spTiposId = (Spinner) findViewById(R.id.sp_TipoIdentificacion_is);
        String[] tiposId = {"Tipo de identificación", "CC", "CE"};

        spTiposId.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tiposId));

        spTiposId.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
            {
                Toast.makeText(adapterView.getContext(), (String) adapterView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });

    }


    private void OlvidarContrasena(){
        Button buttonOC = (Button) findViewById(R.id.btnOC);

        buttonOC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IniciarSesion.this, OlvidarContrasena.class));
            }
        });
    }

    private void iniciarSesion(){
        Button buttonIniciarSesion = (Button) findViewById(R.id.btnIniciarSesion_is);

        buttonIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IniciarSesion.this, CodigoIngreso.class));
            }
        });
    }

}