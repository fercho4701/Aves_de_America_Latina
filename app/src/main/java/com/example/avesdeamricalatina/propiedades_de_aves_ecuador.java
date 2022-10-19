package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class propiedades_de_aves_ecuador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propiedades_de_aves_ecuador);
    }

    public void canto_elaenia(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.elaenia);
        mp.start();



    }


    public void canto_Euphonia(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.euphonia);
        mp.start();



    }





}