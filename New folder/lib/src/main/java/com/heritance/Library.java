/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.heritance;

public class Library {
    public static void main(String[] args) {
    Restaurant numberOne = new Restaurant("numberOne" , 5 , "$$");
        Review review1 = new Review("This is good resturant" , "hamzh" , 5);
        Review review2 = new Review("This is bad resturant" , "ahmad" , 1);
        Review review3 = new Review("This is good resturant" , "mohammed" , 1);
        numberOne.addReview(review1);
        System.out.println(numberOne);
        numberOne.addReview(review2);
        System.out.println(numberOne);
        numberOne.addReview(review3);
        System.out.println(numberOne);
    }
}
