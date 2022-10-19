package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ventana_paises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_paises);



    }


    public void propiedades_colombia(View view){

        Intent i = new Intent(this, propiedades_de_aves_colombia.class);
        startActivity(i);



    }

    public void propiedades_venezuela(View view){

        Intent i = new Intent(this,propiedades_de_aves_venezuela.class);
        startActivity(i);



    }

    public void propiedades_peru(View view){

        Intent i = new Intent(this, propiedades_de_aves_peru.class);
        startActivity(i);



    }

    public void propiedades_ecuador(View view){

        Intent i = new Intent(this, propiedades_de_aves_ecuador.class);
        startActivity(i);



    }

    public void propiedades_mexico(View view){

        Intent i = new Intent(this, propiedades_de_aves_mexico.class);
        startActivity(i);



    }


}