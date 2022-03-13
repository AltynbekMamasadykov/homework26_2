package com.company;

import com.company.classes.City;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        List<City> citiesList = new ArrayList<>(List.of(

        new City(1,"Bishkek"),
        new City(2,"Osh"),
        new City(3,"Batken"),
        new City(4,"Jalal-Abad"),
        new City(5,"Naryn"),
        new City(6,"Kochkor-Ata"),
        new City(7,"Talas"),
        new City(8,"Tokmok"),
        new City(9,"Karakol")
        ));

        TreeSet<City> cityTreeSet = new TreeSet<>();

        for(City city: citiesList) {
            if(city.getCode() % 2 == 1) {
                cityTreeSet.add(city);
            }
        }
        System.out.println(cityTreeSet);
    }
}
