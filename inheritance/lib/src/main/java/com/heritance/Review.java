package com.heritance;

public class Review{
    private String body;
    private String author;
    private int stars;

    private String movieName = "";
    
    public Review(String body , String author, int stars) {

        this.body = body;
        this.author = author;
        setStars(stars);
    }


    public String getMovieName() {
        return movieName;
    }

    public void setStars(int stars) {
        if (stars>0 && stars <= 5){
            this.stars = stars;
        }else {
            System.out.println("the stars should be greater than zero");
        }
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    public int getStars() {
        return stars;
    }

    @Override
    public String toString() {
        if (movieName.isEmpty()) {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", stars=" + stars +
                    '}';
        }else {
            return "Review{ " +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", Movies Name='" + movieName + '\'' +
                    ", stars=" + stars +' '+
                    '}';
        }
    }
}
