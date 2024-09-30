package com.example.ac1p2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnVotoGames = findViewById(R.id.btnVotoGames);
        btnVotoGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VotoGamesActivity.class));
            }
        });

        Button btnXGames = findViewById(R.id.btnXGames);
        btnXGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, XGamesActivity.class));
            }
        });

        Button btnWorldGames = findViewById(R.id.btnWorldGames);
        btnWorldGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WorldGamesActivity.class));
            }
        });
    }
}

