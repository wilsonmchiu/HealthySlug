package com.example.wilso.healthyslug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MealItemAdapter extends BaseAdapter {

    private Context mContext;
    private List<Food> mMealList;

    //Constructor
    public MealItemAdapter(Context mContext, List<Food> mMealList) {
        this.mContext = mContext;
        this.mMealList = mMealList;
    }

    @Override
    public int getCount() {
        return mMealList.size();
    }

    @Override
    public Object getItem(int position) {
        return mMealList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_main_list, null);
        TextView foodName = (TextView)v.findViewById(R.id.food_name);
        foodName.setText(mMealList.get(position).getFood());

        v.setTag(mMealList.get(position).getId());
        return v;
    }
}
