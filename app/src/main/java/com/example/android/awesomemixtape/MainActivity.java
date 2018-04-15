package com.example.android.awesomemixtape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView vol1 = (TextView) findViewById(R.id.vol1);

        // Set a click listener on that View
        vol1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent vol1Intent = new Intent(MainActivity.this, Vol1.class);

                // Start the new activity
                startActivity(vol1Intent);
            }
        });

        // Find the View that shows the family category
        TextView vol2 = (TextView) findViewById(R.id.vol2);

        // Set a click listener on that View
        vol2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent vol2Intent = new Intent(MainActivity.this, Vol2.class);

                // Start the new activity
                startActivity(vol2Intent);
            }
        });

        // Find the View that shows the colors category
        TextView vol3 = (TextView) findViewById(R.id.vol3);

        // Set a click listener on that View
        vol3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent vol3Intent = new Intent(MainActivity.this, Vol3.class);

                // Start the new activity
                startActivity(vol3Intent);
            }
        });

        // Find the View that shows the colors category
        TextView vol4 = (TextView) findViewById(R.id.vol4);

        // Set a click listener on that View
        vol4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent vol4Intent = new Intent(MainActivity.this, Vol4.class);

                // Start the new activity
                startActivity(vol4Intent);
            }
        });
    }
}
