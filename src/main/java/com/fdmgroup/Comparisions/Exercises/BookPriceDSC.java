package com.fdmgroup.Comparisions.Exercises;

import java.util.Comparator;

public class BookPriceDSC implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPrice().compareTo(o1.getPrice());
    }
}
