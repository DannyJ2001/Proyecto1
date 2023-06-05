package com.danny.javier.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    TextView textomostrado1;
    TextView textomostrado2;
    TextView textomostrado3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Intent intent1=getIntent();
        textomostrado1 = findViewById(R.id.textMensajeA2);
        textomostrado2 = findViewById(R.id.textMensaje2A2);
        textomostrado3 = findViewById(R.id.textMensaje3A2);

        String textingre = intent1.getStringExtra("Texto1");
        String textingre1 = intent1.getStringExtra("Texto2");
        String textingre2= intent1.getStringExtra("Texto3");
        textomostrado1.setText(textingre);
        textomostrado2.setText(textingre1);
        textomostrado3.setText(textingre2);







    }
}