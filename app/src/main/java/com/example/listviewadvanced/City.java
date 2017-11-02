package com.example.listviewadvanced;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class City {
    private String name;
    private String state;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    ///================= When using JSON
    // Constructor to convert JSON object into a Java class instance
    public City(JSONObject object){
        try {
            this.name = object.getString("name");
            this.state = object.getString("state");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    // Factory method to convert an array of JSON objects into a list of objects
    // User.fromJson(jsonArray);
    public static ArrayList<City> fromJson(JSONArray jsonObjects) {
        ArrayList<City> users = new ArrayList<City>();
        for (int i = 0; i < jsonObjects.length(); i++) {
            try {
                users.add(new City(jsonObjects.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

}
