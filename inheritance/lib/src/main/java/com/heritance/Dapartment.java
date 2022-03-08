package com.heritance;

import java.util.ArrayList;
import java.util.List;

public class Dapartment {
    private String name ;
    private int stars ;
    private List<Review> reviews = new ArrayList<>();


    public Dapartment(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    public void addReview(Review review){
        reviews.add(review);
        int sum = this.stars;
        for (Review ele:
                reviews) {
            sum = sum + ele.getStars();
        }

        this.stars = sum / (reviews.size()+1);
        System.out.println("The star is : " + this.stars);
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }



    public List<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Dapartment{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}
