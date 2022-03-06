package com.heritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name ;
    private int stars ;
    private String priceCategory ;
    private List<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = price;
    }

    public int getStars() {
        return stars;
    }

    public void addReview(Review review){
        reviews.add(review);
        int sum = 0;
        for (Review ele:
             reviews) {
            sum = sum + ele.getStars();
        }
        this.stars = sum / reviews.size();
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=" + priceCategory +
                '}';
    }
}
