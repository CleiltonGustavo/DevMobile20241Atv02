package com.example.calculadoraecontador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contador extends AppCompatActivity {

    TextView contadorValor;
    Button btnIncrementarContador;
    int valor_contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        contadorValor = findViewById(R.id.contadorValor);
        btnIncrementarContador = findViewById(R.id.btnIncrementarContador);

        Intent dado_enviado = getIntent(); //Pega os dados passados pela intent na tela MainActivity
        valor_contador = dado_enviado.getIntExtra("valorPassado", 0); //Coloca um int pegada numa variável string
        contadorValor.setText("" + valor_contador); //O valor do campo de texto é setado para ser igual ao valor passado
        TextView contadorValor = findViewById(R.id.contadorValor);

        btnIncrementarContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor_contador++;
                contadorValor.setText("" + valor_contador);

            }
        });
    }
}