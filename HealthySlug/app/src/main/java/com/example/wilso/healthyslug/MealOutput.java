package com.example.wilso.healthyslug;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentChange;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firestore.v1.WriteResult;
import java.io.File;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

public class MealOutput extends AppCompatActivity{

    private String diet = MainActivity.getDiet();
    private String meal = MealChooser.getMeal();
    private String hall = DiningHall.getHall();
    private static final String TAG = "FireLog";

    private ListView lvFood;
    private MealItemAdapter adapter;
    private List<Food> mMealList;

    private FirebaseFirestore db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_output);


        lvFood = (ListView) findViewById(R.id.main_list);

        db = FirebaseFirestore.getInstance();

        mMealList = new ArrayList<>();

        adapter = new MealItemAdapter(getApplicationContext(), mMealList);

        lvFood.setAdapter(adapter);


        CollectionReference collection = db.collection(hall);
        Query query = collection.whereEqualTo("meal", meal)
                .whereEqualTo("diet", diet);

        query.addSnapshotListener(new EventListener<QuerySnapshot>() {
                    @Override
                    public void onEvent(QuerySnapshot queryDocumentSnapshots, FirebaseFirestoreException e) {
                        if(e != null){
                            Log.d(TAG, "Error: " + e.getMessage());
                            return;
                        }
                        for(DocumentSnapshot doc : queryDocumentSnapshots){

                            String foodName = doc.getString("name");

                            mMealList.add(new Food(foodName));

                            adapter.notifyDataSetChanged();
                        }
                    }
        });


        /*
        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked product id=" + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });
        */

    }



}
