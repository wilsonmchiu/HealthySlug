package com.example.wilso.healthyslug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MealChooser extends AppCompatActivity {


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
                setMeal("Breakfast");
                openMealOutput();
            }
        });


        lunch = (Button)findViewById(R.id.lunchBtn);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMeal("Lunch");
                openMealOutput();
            }
        });

        dinner = (Button)findViewById(R.id.dinBtn);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMeal("Dinner");
                openMealOutput();
            }
        });

    }

    public static String getMeal(){
        return meal;
    }

    public void setMeal(String meal){
        this.meal = meal;
    }

    public void openMealOutput(){
        Intent intent = new Intent(this, MealOutput.class);
        startActivity(intent);
    }

}
