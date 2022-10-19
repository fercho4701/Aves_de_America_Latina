package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class propiedades_de_aves_venezuela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propiedades_de_aves_venezuela);
    }

    public void canto_cotua_olivacea(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.cotua_olivacea);
        mp.start();



    }



    public void canto_aruco(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.aruco);
        mp.start();



    }




}