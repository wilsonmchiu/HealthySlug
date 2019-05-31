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

    private static String diet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ketoDiet = (Button)findViewById(R.id.ketoBtn);
        ketoDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDiet("Keto");
                openDiningHall();
            }
        });

        bulkDiet = (Button)findViewById(R.id.bulkBtn);
        bulkDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDiet("Bulk");
                openDiningHall();
            }
        });

        balDiet = (Button)findViewById(R.id.balancedBtn);
        balDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDiet("Balanced");
                openDiningHall();
            }
        });

        palDiet = (Button)findViewById(R.id.palBtn);
        palDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDiet("Paleo");
                openDiningHall();
            }
        });
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    public static String getDiet(){
        return diet;
    }

    public void openDiningHall(){
        Intent intent = new Intent(this, DiningHall.class);
        startActivity(intent);

    }

}



