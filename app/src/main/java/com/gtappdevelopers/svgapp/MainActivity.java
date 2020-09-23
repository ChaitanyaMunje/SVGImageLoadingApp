package com.gtappdevelopers.svgapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView userAvatarView = findViewById(R.id.avatar);
        String url4="https://portal.proteen.com/img/proteen-logo.svg";
        Utils.fetchSvg(this, url4, userAvatarView);

    }
}