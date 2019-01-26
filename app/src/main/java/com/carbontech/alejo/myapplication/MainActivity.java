package com.carbontech.alejo.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void speak(View view) {

        int button_id = view.getId();

        String tapped_button =  view.getResources().getResourceEntryName(button_id);

        int resource_id = getResources().getIdentifier(tapped_button, "raw", "com.carbontech.alejo.myapplication");

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resource_id);

        mediaPlayer.start();
    }
}

