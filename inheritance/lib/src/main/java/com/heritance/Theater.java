package com.heritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Dapartment{
    ArrayList<String> movies = new ArrayList<>();

    public Theater(String name, int stars) {
        super(name, stars);
    }

    public void addMovie(String movieName){
        movies.add(movieName);
    }

    public void removeMovie(String movieName){
        movies.remove(movieName);
    }

    @Override
    public String toString() {

        return "Theater{" +
                "name='" + super.getName() + '\'' + ','+
                "Review='" + super.getReviews() + '\'' + ','+
                "movies List=" + movies +
                '}';
    }
}
