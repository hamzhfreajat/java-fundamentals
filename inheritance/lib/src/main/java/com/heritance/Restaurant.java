package com.heritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Dapartment {
    private String priceCategory ;
    public Restaurant(String name, int stars, String priceCategory) {
        super(name, stars);
        this.priceCategory = priceCategory;
    }

}
