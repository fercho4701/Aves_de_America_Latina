package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class propiedades_de_aves_colombia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.propiedades_de_aves_colombia);


    }


    public void canto_barranquero(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.barranquero);
        mp.start();



    }


    public void canto_colonia_colonus(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.colonia_colonus);
        mp.start();



    }

}