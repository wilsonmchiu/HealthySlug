package com.example.wilso.healthyslug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiningHall extends AppCompatActivity {

    private static String dietdiet;
    private Button cowell;
    private Button crown;
    private Button porter;
    private Button rc;
    private Button c9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining_hall);

        cowell = (Button)findViewById(R.id.cowellBtn);
        cowell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hall = "cowell";
                sendHall(dietdiet, hall);
                openMealChooser();
            }
        });

        crown = (Button)findViewById(R.id.crownBtn);
        crown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hall = "crown";
                sendHall(dietdiet, hall);
                openMealChooser();
            }
        });

        porter = (Button)findViewById(R.id.porterBtn);
        porter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hall = "porter";
                sendHall(dietdiet, hall);
                openMealChooser();
            }
        });

        rc = (Button)findViewById(R.id.rcBtn);
        rc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hall = "rc";
                sendHall(dietdiet, hall);
                openMealChooser();
            }
        });

        c9 = (Button)findViewById(R.id.c9Btn);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hall = "c9";
                sendHall(dietdiet, hall);
                openMealChooser();
            }
        });


    }

    public void openMealChooser(){
        Intent intent = new Intent(this, MealChooser.class);
        startActivity(intent);
    }

    public static void retrieveDiet(String diet){
        dietdiet = diet;
    }

    public static void sendHall(String dietdiet, String hall){
        MealChooser.retrieveHall(dietdiet, hall);

    }
}
