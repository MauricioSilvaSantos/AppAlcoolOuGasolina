package com.example.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private TextView editResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referenciando
        editAlcool = findViewById(R.id.editAlcool);
        editGasolina = findViewById(R.id.editGasolina);
        editResultado = findViewById(R.id.editResultado);

    }
    public void calcularPreco(View view){

        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());

        /*Faz calculo (precoAlcool / precoGasolina)
            se ressultado >= 0,7 melhor utilizar gasolina
            Senão melhor usar Alcool,
         */
        Double resultado = precoAlcool/precoGasolina;

        if (resultado >= 0.7){
            editResultado.setText("Melhor Ultilizar gasolina");
        }
        else{
            editResultado.setText("Melhor ultilizar Alcool");
        }


    }
}
