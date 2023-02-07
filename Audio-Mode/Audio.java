package com.example.audiomodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.media.AudioManager;


public class MainActivity extends AppCompatActivity {

    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        RadioGroup audioModeGroup = findViewById(R.id.audio_mode_group);
        audioModeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.normal_radio_button:
                        audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                        break;
                    case R.id.silent_radio_button:
                        audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                        break;
                    case R.id.vibrate_radio_button:
                        audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                        break;
                }
            }
        });
    }
}