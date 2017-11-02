package com.example.listviewadvanced;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(@NonNull Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        City city = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_city, parent, false);
        }

        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvState = convertView.findViewById(R.id.tvState);

        tvName.setText(city.getName());
        tvState.setText(city.getState());

        // Here we are storing an object in the tag of the list item
        // and retrive it on click
        tvName.setTag(position);
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer)view.getTag();
                City city = getItem(position);
            }
        });

        return convertView;
    }
}
