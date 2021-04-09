package com.waitbox.waitbox;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        registrar();

        Spinner spinner = (Spinner) findViewById(R.id.sp_TipoIdentificacion);
        Spinner spTorre = (Spinner) findViewById(R.id.sp_Torre);
        Spinner spApt = (Spinner) findViewById(R.id.sp_Apt);
        String[] valores = {"Tipo de identificación", "CC"};
        String[] apts = {"Apt", "101", "102", "201"};
        String[] torres = {"Torre", "1", "2"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, valores));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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

        spTorre.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, apts));
        spTorre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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
        spApt.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, torres));
        spApt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

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
    private void registrar(){
        Button buttonRegistrar = (Button) findViewById(R.id.btnRegistrar);

        buttonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registrar.this, Index.class));
            }
        });
    }
}