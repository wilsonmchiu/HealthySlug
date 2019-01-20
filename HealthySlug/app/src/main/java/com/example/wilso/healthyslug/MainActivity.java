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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ketoDiet = (Button)findViewById(R.id.ketoBtn);
        ketoDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKetoDiet();
            }
        });

        bulkDiet = (Button)findViewById(R.id.bulkBtn);
        ketoDiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBulkDiet();
            }
        });
    }

    public void openKetoDiet(){
        Intent intent = new Intent(this, KetoDiet.class);
        startActivity(intent);
    }

    public void openBulkDiet(){
        Intent intent = new Intent(this, BulkDiet.class);
        startActivity(intent);
    }
}



