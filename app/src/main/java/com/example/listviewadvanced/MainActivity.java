package com.example.listviewadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvItems = findViewById(R.id.lv_items);

//=========================================================
//              Default ArrayAdapter
//=========================================================

//        //=== Most simple ===========
//        List<String> items = DummyData.getArrayListData();
//        ArrayAdapter<String> itemsAdapter =
//                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
//        lvItems.setAdapter(itemsAdapter);
//        //===========================

//        //=== Most simple with object and no tostring method===========
//        // There is no tostring method in City class => it just show the class name in the list
//        List<City> itemsObjecNoToString = DummyData.geObjectListData();
//        ArrayAdapter<City> itemsAdapterObjects =
//                new ArrayAdapter<City>(this, android.R.layout.simple_list_item_1, itemsObjecNoToString);
//
//        lvItems.setAdapter(itemsAdapterObjects);
//        //===========================

//        //=== Most simple with object and tostring method===========
//        // The object we put in List override the toString() method, this method is called by
//        // the arrayadapter so we don't see the name of the class but the name of the city
//        List<CityWithToString> itemsObjecToString = DummyData.geObjectWithToStringListData();
//        ArrayAdapter<CityWithToString> itemsAdapterObjectsToString =
//                new ArrayAdapter<CityWithToString>(this, android.R.layout.simple_list_item_1, itemsObjecToString);
//
//        lvItems.setAdapter(itemsAdapterObjectsToString);


//==========================================================
//              Custom ArrayAdapter
// ==========================================================
//        When we want to display a series of items into a list using a custom representation of
//        the items, we need to use our own custom XML layout for each item. To do this, we need
//        to create our own custom ArrayAdapter class.
//==========================================================
        ArrayList<City> cities = DummyData.getObjectListData();
        CityAdapter adapter = new CityAdapter(this,cities);
        lvItems.setAdapter(adapter);

        //---------------
        //Add a single object to existing adapter / listview
        City newCity = new City("Paris", "idf");
        adapter.add(newCity);

        //--------------
        //Add JSON data to existing adapter / listview
        try {
            JSONArray jsonArray = new JSONArray("[{\"name\": \"El Paso\",\"state\": \"Texas\"},{\"name\": \"Denver\",\"state\": \"Colorado\"},{\"name\": \"Baltimore\",\"state\": \"Maryland\"}]");

            ArrayList<City> newCities = City.fromJson(jsonArray);
            adapter.addAll(newCities);
        } catch (JSONException e) {
            e.printStackTrace();
        }






    }
}
