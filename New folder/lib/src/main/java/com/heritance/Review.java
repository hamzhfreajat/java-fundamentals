package com.heritance;

public class Review{
    private String body;
    private String author;
    private int stars;

    public Review(String body , String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}
