package com.danny.javier.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    EditText text3;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.txtMensaje1A1);
        text2 = findViewById(R.id.txtMensaje2A1);
        text3 = findViewById(R.id.txtMensaje3A1);
        boton = findViewById(R.id.buttonAceptarA1);

        boton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String texto1= text1.getText().toString();
                String texto2= text2.getText().toString();
                String texto3= text3.getText().toString();
                Intent intent1 = new Intent(MainActivity.this,SegundoActivity.class);
                intent1.putExtra( "Texto1", texto1);
                intent1.putExtra( "Texto2", texto2);
                intent1.putExtra( "Texto3", texto3);
                startActivity(intent1);//iniciamos el segundo activity
                finish();



            }
        });







    }




}


