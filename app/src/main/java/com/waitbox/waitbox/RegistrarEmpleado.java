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

public class RegistrarEmpleado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_empleado);

        accionarBotones();

        Spinner spTiposId2 = (Spinner) findViewById(R.id.sp_TipoIdentificacion2);
        String[] tiposId2 = {"Tipo de identificación", "CC", "CE"};

        spTiposId2.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, tiposId2));

        spTiposId2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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

    private void accionarBotones(){
        Button buttonRegistrarEmp = (Button) findViewById(R.id.btnRegistrarEmp);
        Button buttonCHATRE = (Button) findViewById(R.id.btnChatRE);

        buttonRegistrarEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrarEmpleado.this, PaginaPrincipal.class));
            }
        });

        buttonCHATRE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrarEmpleado.this, PaginaPrincipal.class));
            }
        });
    }
}