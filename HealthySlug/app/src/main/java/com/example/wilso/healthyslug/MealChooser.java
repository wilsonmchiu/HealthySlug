package com.example.wilso.healthyslug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MealChooser extends AppCompatActivity {

    private static String dietdiet;
    private static String hallhall;
    private static String meal;
    private Button breakfast;
    private Button lunch;
    private Button dinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_chooser);


        breakfast = (Button)findViewById(R.id.breakBtn);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "breakfast";
                /*
                if(dietdiet.equals("keto") && hallhall.equals("c9")){
                    sendInfo(dietdiet, hallhall, meal);
                    openKetoC9B();
                }
                else if(dietdiet.equals("pal") && hallhall.equals("c9")){
                    sendInfo(dietdiet, hallhall, meal);
                    openPalC9B();
                }
                else if(dietdiet.equals("bal") && hallhall.equals("c9")){
                    sendInfo(dietdiet, hallhall, meal);
                    openBalC9B();
                }
                else{

                }
                */
                openKetoC9B();
            }
        });

        /*
        lunch = (Button)findViewById(R.id.lunchBtn);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "breakfast";
                sendInfo(dietdiet, hallhall, meal);
                openKetoC9B();
            }
        });

        breakfast = (Button)findViewById(R.id.cowellBtn);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meal = "breakfast";
                sendInfo(dietdiet, hallhall, meal);
                openKetoCowellB();
            }
        });
        */
    }

    public void openKetoC9B(){
        Intent intent = new Intent(this, ProductsActivity.class);
        startActivity(intent);
    }

    public void openBalC9B(){
        Intent intent = new Intent(this, BalC9B.class);
        BalC9B.retrieveInfo(dietdiet, hallhall, meal);
        startActivity(intent);
    }
    public void openPalC9B(){
        Intent intent = new Intent(this, PalC9B.class);
        PalC9B.retrieveInfo(dietdiet, hallhall, meal);
        startActivity(intent);
    }

    public static void retrieveHall(String diet, String hall ) {
        dietdiet = diet;
        hallhall = hall;
    }

    public static void sendInfo(String dietdiet, String hallhall, String meal ){

    }


}
