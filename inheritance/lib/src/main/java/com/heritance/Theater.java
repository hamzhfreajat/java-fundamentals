package com.heritance;

import java.util.ArrayList;
import java.util.List;

public class Theater extends Dapartment{
    static final String DEFAULT_Name = "";
    String movieName = "" ;
    ArrayList<String> movies = new ArrayList<>();


    public Theater(String name, int stars) {
        super(name, stars);
    }

    public Theater( int stars) {
        super(DEFAULT_Name, stars);
    }

    public void addReview(Review review , String movieName){
        List<Review> reviews = super.getReviews();
        if (!movieName.isEmpty()) review.setMovieName(movieName);
        int stars = super.getStars();
        reviews.add(review);
        int sum = stars;
        for (Review ele:
                reviews) {
            sum = sum + ele.getStars();
        }
        stars = sum / (reviews.size()+1);
        System.out.println("The star is : " + stars);
    }

    public void addMovie(String movieName){
        if(!movies.contains(movieName)){
            movies.add(movieName);
        }else {
            System.out.println("The movies already exist");
        }
    }

    public void removeMovie(String movieName){
        movies.remove(movieName);
    }

    @Override
    public String toString() {

        if (super.getName().isEmpty()){
            return "Theater{" +
                    "Review='" + super.getReviews() + '\'' + ','+
                    "movies List=" + movies +
                    '}';
        }else {
            return "Theater{" +
                    "name='" + super.getName() + '\'' + ','+
                    "Review='" + super.getReviews() + '\'' + ','+
                    "movies List=" + movies +
                    '}';
        }

    }
}
