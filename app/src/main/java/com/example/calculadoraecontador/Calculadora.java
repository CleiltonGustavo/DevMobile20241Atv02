package com.example.calculadoraecontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    EditText valor1, valor2;
    TextView resultado;
    Button soma, subtracao, multiplicacao, divisao;
    double resultadoOp, primeiroValor, segundoValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultado);
        soma = findViewById(R.id.soma);
        subtracao = findViewById(R.id.subtracao);
        multiplicacao = findViewById(R.id.multiplicacao);
        divisao = findViewById(R.id.divisao);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(valor1.getText().toString()) || TextUtils.isEmpty(valor2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Preencha ambos os valores!", Toast.LENGTH_SHORT).show();
                } else {
                    primeiroValor = Integer.parseInt(valor1.getText().toString());
                    segundoValor = Integer.parseInt(valor2.getText().toString());
                }
                resultadoOp = (primeiroValor + segundoValor);
                resultado.setText("" + resultadoOp);

            }
        });

        subtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(valor1.getText().toString()) || TextUtils.isEmpty(valor2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Preencha ambos os valores!", Toast.LENGTH_SHORT).show();
                } else {
                    primeiroValor = Integer.parseInt(valor1.getText().toString());
                    segundoValor = Integer.parseInt(valor2.getText().toString());
                }
                resultadoOp = (primeiroValor - segundoValor);
                resultado.setText("" + resultadoOp);

            }
        });

        multiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(valor1.getText().toString()) || TextUtils.isEmpty(valor2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Preencha ambos os valores!", Toast.LENGTH_SHORT).show();
                } else {
                    primeiroValor = Integer.parseInt(valor1.getText().toString());
                    segundoValor = Integer.parseInt(valor2.getText().toString());
                }
                resultadoOp = (primeiroValor * segundoValor);
                resultado.setText("" + resultadoOp);

            }
        });

        divisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(valor1.getText().toString()) || TextUtils.isEmpty(valor2.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Preencha ambos os valores!", Toast.LENGTH_SHORT).show();
                } else {
                    primeiroValor = Integer.parseInt(valor1.getText().toString());
                    segundoValor = Integer.parseInt(valor2.getText().toString());
                }
                resultadoOp = (  primeiroValor /  segundoValor);
                resultado.setText("" + resultadoOp);

            }
        });
    }
}