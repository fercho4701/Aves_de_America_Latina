package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void pasar_pagina2(View view){

        Intent i = new Intent(this,ventana_paises.class);
        startActivity(i);



    }



}