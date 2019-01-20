package com.example.wilso.healthyslug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ketoDiet;
    private Button bulkDiet;
    private Button balDiet;
    private Button palDiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ketoDiet = (Button)findViewById(R.id.ketoBtn);
        ketoDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diet = "keto";
                sendDiet(diet);
                openDiningHall();
            }
        });

        bulkDiet = (Button)findViewById(R.id.bulkBtn);
        bulkDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diet = "bulk";
                sendDiet(diet);
                openDiningHall();
            }
        });

        balDiet = (Button)findViewById(R.id.balancedBtn);
        balDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diet = "bal";
                sendDiet(diet);
                openDiningHall();
            }
        });

        palDiet = (Button)findViewById(R.id.palBtn);
        palDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String diet = "pal";
                sendDiet(diet);
                openDiningHall();
            }
        });
    }

    public void sendDiet(String a){
        DiningHall.retrieveDiet(a);
    }
    public void openDiningHall(){
        Intent intent = new Intent(this, DiningHall.class);
        startActivity(intent);

    }

}



