package com.example.avesdeamricalatina;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class propiedades_de_aves_mexico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propiedades_de_aves_mexico);
    }


    public void canto_del_cernicalo_americano(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.cernicalo_americano);
        mp.start();



    }

    public void canto_del_carpintero_cheje(View view){

        MediaPlayer mp = MediaPlayer.create(this,R.raw.carpintero_cheje);
        mp.start();



    }



}