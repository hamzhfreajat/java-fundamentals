package com.heritance;

public class Shop extends Dapartment{

    private String description;
    private String priceCategory ;
    public Shop(String name, int stars, String priceCategory ,String description) {
        super(name, stars);
        this.description = description;
        this.priceCategory = priceCategory;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + super.getName() + '\'' +
                "stars='" + super.getStars() + '\'' +
                ", description='" + description + '\'' +
                ", price='" + this.priceCategory + '\'' +
                '}';
    }
}
