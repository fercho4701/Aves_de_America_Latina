package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class propiedades_de_aves_peru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propiedades_de_aves_peru);
    }

    public void canto_martin_vencejo(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.vencejo);
        mp.start();



    }

    public void canto_martin_pescador(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.martin_pescador);
        mp.start();



    }



}