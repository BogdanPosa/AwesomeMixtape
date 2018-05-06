package com.example.android.awesomemixtape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the volume1
        ImageButton vol1 = findViewById(R.id.vol1);

        // Set a click listener on that View
        vol1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Vol1 Playlist}
                Intent vol1Intent = new Intent(MainActivity.this, Vol1.class);

                // Start the new activity
                startActivity(vol1Intent);
            }
        });

        // Find the View that shows the volume2
        ImageButton vol2 = findViewById(R.id.vol2);

        // Set a click listener on that View
        vol2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Vol2 Playlist}
                Intent vol2Intent = new Intent(MainActivity.this, Vol2.class);

                // Start the new activity
                startActivity(vol2Intent);
            }
        });

        // Find the View that shows the volume3
        ImageButton vol3 = findViewById(R.id.vol3);

        // Set a click listener on that View
        vol3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Vol3 Playlist}
                Intent vol3Intent = new Intent(MainActivity.this, Vol3.class);

                // Start the new activity
                startActivity(vol3Intent);
            }
        });

        // Find the View that shows the volume4
        ImageButton vol4 = findViewById(R.id.vol4);

        // Set a click listener on that View
        vol4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Vol4 Playlist}
                Intent vol4Intent = new Intent(MainActivity.this, Vol4.class);

                // Start the new activity
                startActivity(vol4Intent);
            }
        });
    }
}
