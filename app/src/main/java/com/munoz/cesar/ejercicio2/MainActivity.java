package com.munoz.cesar.ejercicio2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private int inicial = 0;
    private int ultima = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void Color(View v){
        EditText txt = (EditText) findViewById(R.id.editText);


        txt.setTextColor(Color.GREEN);

    }

    public void Negrita(View v){
        EditText txt = (EditText) findViewById(R.id.editText);

        txt.setTypeface(null, Typeface.BOLD);
    }

    public void Seleccion(View v){

    }

    public void Tamaño(View v){

    }
}
