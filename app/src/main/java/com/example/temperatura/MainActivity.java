package com.example.temperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //public static  final String TEMPERATURA = "pt.ipg.farenheit.TEMPERATURA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraTemperatura(View view){
        EditText editText = findViewById(R.id.editTextTemperatura);
        String s = editText.getText().toString();

        RadioButton radioButtonCelcius = findViewById(R.id.radioButtonCelsius);

        RadioButton radioButtonFahrenheit = findViewById(R.id.radioButtonFah);


        double temperatura;

        try{
            temperatura = Double.parseDouble(s);
        }catch (NumberFormatException e){

            e.printStackTrace();
            editText.setError("Introduza uma temperatura valida");
            editText.requestFocus();
            return;
        }

        if(radioButtonCelcius.isChecked()) {
            DadosApp.temperatura = new TemperaturaCelsius(temperatura);
        }else if(radioButtonFahrenheit.isChecked()) {
            DadosApp.temperatura = new TemperaturaFahrenheit(temperatura);
        }else{
            radioButtonCelcius.setError("Indique as unidades da temperadtura");
            radioButtonFahrenheit.setError("Indique as unidades da temperadtura");

            Toast.makeText(this, "Indique as unidades da temperadtura", Toast.LENGTH_LONG).show();
            return;

        }

        Intent intent = new Intent(this, ConsultarTemperaturaActivity.class);
        startActivity(intent);

    }


}