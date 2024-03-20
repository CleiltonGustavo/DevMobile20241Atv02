package com.example.calculadoraecontador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvDigiteValorContador;
    EditText valorContador;
    Button btnContador;
    Button btnCalculadora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDigiteValorContador = findViewById(R.id.tvDigiteValorContador);
        valorContador = findViewById(R.id.valorContador);
        btnContador = findViewById(R.id.btnContador);
        btnCalculadora = findViewById(R.id.btnCalculadora);

        btnContador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorParaContador;
                if(TextUtils.isEmpty(valorContador.getText().toString())){
                    valorParaContador = 0;
                } else {
                    valorParaContador = Integer.parseInt(valorContador.getText().toString());
                }
                Intent chamaContador = new Intent(MainActivity.this, Contador.class);
                chamaContador.putExtra("valorPassado", valorParaContador);
                startActivity(chamaContador);
            }
        });

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chamaCalculadora = new Intent(MainActivity.this, Calculadora.class);
                startActivity(chamaCalculadora);
            }});
    }


}