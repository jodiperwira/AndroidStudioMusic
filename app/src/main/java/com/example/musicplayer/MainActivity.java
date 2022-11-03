package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;
    MediaPlayer music2;
    MediaPlayer music3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.stanza1);
        music2 = MediaPlayer.create(this, R.raw.stanza3);
        music3 = MediaPlayer.create(this, R.raw.harmoni);
    }

    public void musicPlay(View view) {
        if(music2.isPlaying() || music3.isPlaying()){
            music2.stop();
            music3.stop();
            music.start();
        }
        else{
            music.start();
        }

    }

    public void musicStop(View view) {
        music.stop();
        music = MediaPlayer.create(this, R.raw.stanza1);
    }

    

    public void musicPlay2(View view) {
        if(music.isPlaying() || music3.isPlaying()){
            music.stop();
            music3.stop();
            music2.start();
        }else{
            music2.start();
        }
    }

    public void musicStop2(View view) {
        music2.stop();
        music2 = MediaPlayer.create(this, R.raw.stanza3);
    }

    public void musicPlay3(View view) {
        if(music.isPlaying() || music2.isPlaying()){
            music.stop();
            music2.stop();
            music3.start();
        }else{
            music3.start();
        }
    }

    public void musicStop3(View view) {
        music3.stop();
        music3 = MediaPlayer.create(this, R.raw.harmoni);
    }
}