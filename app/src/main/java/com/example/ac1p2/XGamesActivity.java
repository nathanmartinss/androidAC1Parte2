package com.example.ac1p2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class XGamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_x_games);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnXGamesMap = findViewById(R.id.btnXGamesMap);
        btnXGamesMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com.br/maps/place/X-Games+Sorocaba/@-23.500136,-47.45965,17z/data=!3m1!4b1!4m6!3m5!1s0x94c58be7537a0813:0xca7e23301e1c54ea!8m2!3d-23.5001409!4d-47.4570697!16s%2Fg%2F11ffw4h5nn?entry=ttu&g_ep=EgoyMDI0MDkyNS4wIKXMDSoASAFQAw%3D%3D");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        Button btnXGamesSite = findViewById(R.id.btnXGamesSite);
        btnXGamesSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.facebook.com/xgamessorocaba");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        Button btnXGamesCall = findViewById(R.id.btnXGamesCall);
        btnXGamesCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+551532110818"));
                startActivity(callIntent);
            }
        });
    }
}
