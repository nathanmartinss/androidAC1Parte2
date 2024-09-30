package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WorldGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_games);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnWorldGamesMap = findViewById(R.id.btnWorldGamesMap);
        btnWorldGamesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com.br/maps/place/World+Games/@-23.5153668,-47.4685676,17z/data=!3m1!4b1!4m6!3m5!1s0x94c58a927ec5c6cb:0xc7f9258a415d0afe!8m2!3d-23.5153717!4d-47.4659873!16s%2Fg%2F11b6p0gjtg?entry=ttu&g_ep=EgoyMDI0MDkyNS4wIKXMDSoASAFQAw%3D%3D");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        Button btnWorldGamesSite = findViewById(R.id.btnWorldGamesSite);
        btnWorldGamesSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.instagram.com/worldgamessorocaba/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        Button btnWorldGamesCall = findViewById(R.id.btnWorldGamesCall);
        btnWorldGamesCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+551532341584"));
                startActivity(callIntent);
            }
        });
    }
}

