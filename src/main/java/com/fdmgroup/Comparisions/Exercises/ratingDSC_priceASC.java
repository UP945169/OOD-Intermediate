package com.fdmgroup.Comparisions.Exercises;

import java.util.Comparator;

public class ratingDSC_priceASC implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o2.equals(o1)){
            return o1.getPrice().compareTo(o2.getPrice());
        }
        return ((Double) o1.getRating()).compareTo(o2.getRating());
    }
}
