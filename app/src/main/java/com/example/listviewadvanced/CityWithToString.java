package com.example.listviewadvanced;


public class CityWithToString {
    String name;
    String state;

    public CityWithToString(String name, String state) {
        this.name = name;
        this.state = state;
    }

    @Override
    public String toString() {
        return this.name;
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
}
