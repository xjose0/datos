
package com.example.intent3febrero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;
    private EditText txtNombre;
    private EditText txtCarrera;
    private EditText txtGrado;
    private EditText txtGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();

        Intent intent = new Intent(this, MainActivity2.class);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("nombre", txtNombre.getText().toString());
                intent.putExtra("carrera", txtCarrera.getText().toString());
                intent.putExtra("grado", txtGrado.getText().toString());
                intent.putExtra("grupo", txtGrupo.getText().toString());
                startActivity(intent);

            }
        });
    }

    public void initComponents(){
        txtNombre = findViewById(R.id.txtNombre);
        txtCarrera = findViewById(R.id.txtCarrera);
        txtGrado = findViewById(R.id.txtGrado);
        txtGrupo = findViewById(R.id.txtGrupo);
        btnEnviar = findViewById(R.id.btnEnviar);
    }
}