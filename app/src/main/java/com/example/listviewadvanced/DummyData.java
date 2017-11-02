package com.example.listviewadvanced;


import java.util.ArrayList;

public class DummyData {
    public static ArrayList<String> getArrayListData() {
        ArrayList<String> data = new ArrayList<String>() {{
            add("New York");
            add("Los Angeles");
            add("Chicago");
            add("Houston");
            add("Philadelphia");
            add("Phoenix");
            add("San Antonio");
            add("San Diego");
            add("Detroit");
            add("San Jose");
            add("Austin");
            add("Jacksonville");
            add("San Francisco");
            add("Indianapolis");
            add("Columbus");
            add("Fort Worth");
            add("Charlotte");
            add("Seattle");
            add("El Paso");
            add("Dallas");
            add("Denver");
        }};

        return data;
    }

    public static ArrayList<City> getObjectListData() {
        ArrayList<City> data = new ArrayList<City>() {{
            add(new City("New York","New York"));
            add(new City("Los Angeles","California"));
            add(new City("Chicago","Illinois"));
            add(new City("Houston","Texas"));
            add(new City("Philadelphia","Philadelphia"));
            add(new City("Phoenix","Arizona"));
            add(new City("San Antonio","Texas"));
            add(new City("San Diego","California"));
            add(new City("Detroit","Michigan"));
            add(new City("San Jose","Californa"));
            add(new City("Austin","Texas"));
            add(new City("Jacksonville","Florida"));
            add(new City("San Francisco","California"));
            add(new City("Indianapolis","Indiana"));
            add(new City("Columbus","Ohio"));
            add(new City("Fort Worth","Texas"));
            add(new City("Charlotte","North Carolina"));
            add(new City("Seattle","Washington"));
        }};

        return data;
    }

    public static ArrayList<CityWithToString> geObjectWithToStringListData() {
        ArrayList<CityWithToString> data = new ArrayList<CityWithToString>() {{
            add(new CityWithToString("New York","New York"));
            add(new CityWithToString("Los Angeles","California"));
            add(new CityWithToString("Chicago","Illinois"));
            add(new CityWithToString("Houston","Texas"));
            add(new CityWithToString("Philadelphia","Philadelphia"));
            add(new CityWithToString("Phoenix","Arizona"));
            add(new CityWithToString("San Antonio","Texas"));
            add(new CityWithToString("San Diego","California"));
            add(new CityWithToString("Detroit","Michigan"));
            add(new CityWithToString("San Jose","Californa"));
            add(new CityWithToString("Austin","Texas"));
            add(new CityWithToString("Jacksonville","Florida"));
            add(new CityWithToString("San Francisco","California"));
            add(new CityWithToString("Indianapolis","Indiana"));
            add(new CityWithToString("Columbus","Ohio"));
            add(new CityWithToString("Fort Worth","Texas"));
            add(new CityWithToString("Charlotte","North Carolina"));
            add(new CityWithToString("Seattle","Washington"));
            add(new CityWithToString("El Paso","Texas"));
            add(new CityWithToString("Dallas","Texas"));
            add(new CityWithToString("Denver","Colorado"));
        }};

        return data;
    }
}
