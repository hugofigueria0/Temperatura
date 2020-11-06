package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ConsultarTemperaturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_temperatura);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

       /* Intent intent = getIntent();
        double temperatura = intent.getDoubleExtra("TEMPERATURA", 0.0);
*/
        TextView textViewCelsius = findViewById(R.id.textViewTemperaturaC);
        textViewCelsius.setText(decimalFormat.format(DadosApp.temperatura.GetCelsius()));

        TextView textViewFahrenheit = findViewById(R.id.textViewTemperaturaF);
        textViewFahrenheit.setText(decimalFormat.format(DadosApp.temperatura.GetFahrenheit()));
    }
}