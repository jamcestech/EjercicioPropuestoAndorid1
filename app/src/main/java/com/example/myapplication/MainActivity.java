package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberInput;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberInput = findViewById(R.id.numberInput);
        resultado = findViewById(R.id.textResult);

    }

    public void checkNumber(View view) {
        final int number = 5;

        int numberInputInteger = Integer.parseInt(numberInput.getText().toString());

        if(number == numberInputInteger) {
            resultado.setText("Acertado");
            resultado.setTextColor(Color.GREEN);
            resultado.setTextSize(30);
        } else {
            resultado.setText("Vuelve a intentarlo");
            resultado.setTextColor(Color.RED);
            resultado.setTextSize(30);
        }
        resultado.setVisibility(View.VISIBLE);
    }
}
