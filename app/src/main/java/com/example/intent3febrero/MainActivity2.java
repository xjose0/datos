package com.example.intent3febrero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblCarrera;
    private TextView lblGrado;
    private TextView lblGrupo;
    private String nombre;
    private String carrera;
    private String grado;
    private String grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initComponents();

        Bundle extras = getIntent().getExtras();
        nombre = (String) extras.get("nombre");
        carrera = (String) extras.get("carrera");
        grado = (String) extras.get("grado");
        grupo = (String) extras.get("grupo");

        lblNombre.setText(nombre);
        lblCarrera.setText(carrera);
        lblGrado.setText(grado);
        lblGrupo.setText(grupo);
    }

    public void initComponents(){
        lblNombre = findViewById(R.id.lblNombre);
        lblCarrera = findViewById(R.id.lblCarrera);
        lblGrado = findViewById(R.id.lblGrado);
        lblGrupo = findViewById(R.id.lblGrupo);
    }
}