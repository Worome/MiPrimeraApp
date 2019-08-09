package com.trianacodes.script.miprimeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_suma1;
    private EditText et_suma2;
    private TextView txt_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_suma1 = findViewById(R.id.Sumando1);
        et_suma2 = findViewById(R.id.Sumando2);
        txt_Resultado = findViewById(R.id.txtResultado);
    }

    // Este método hace la suma.
    public void Sumar(View view){

        // Convierte a entero la información tecleada por el usuario en los EditText.
        int valor1 = Integer.parseInt(et_suma1.getText().toString());
        int valor2 = Integer.parseInt(et_suma2.getText().toString());

        int suma = valor1 + valor2;

        // Convertimos la variable suma de tipo entero a otra variable de tipo String.
        String resultado = String.valueOf(suma);

        // Se muestra el resultado en el dispositivo.
        txt_Resultado.setText(resultado);

    }

}
