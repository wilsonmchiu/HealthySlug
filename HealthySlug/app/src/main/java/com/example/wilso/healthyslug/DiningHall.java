package com.example.wilso.healthyslug;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DiningHall extends AppCompatActivity {

    private Button cowell;
    private Button crown;
    private Button porter;
    private Button rc;
    private Button c9;

    private static String hall;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dining_hall);

        cowell = (Button)findViewById(R.id.cowellBtn);
        cowell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHall("Cowell");
                openMealChooser();
            }
        });

        crown = (Button)findViewById(R.id.crownBtn);
        crown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHall("Crown");
                openMealChooser();
            }
        });

        porter = (Button)findViewById(R.id.porterBtn);
        porter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHall("Porter");
                openMealChooser();
            }
        });

        rc = (Button)findViewById(R.id.rcBtn);
        rc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHall("Rachel");
                openMealChooser();
            }
        });

        c9 = (Button)findViewById(R.id.c9Btn);
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHall("Nine");
                openMealChooser();
            }
        });


    }

    public static String getHall(){
        return hall;
    }

    public void setHall(String hall){
        this.hall = hall;
    }

    public void openMealChooser(){
        Intent intent = new Intent(this, MealChooser.class);
        startActivity(intent);
    }

}
