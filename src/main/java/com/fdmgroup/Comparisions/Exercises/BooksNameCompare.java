package com.fdmgroup.Comparisions.Exercises;

import java.util.Comparator;

public class BooksNameCompare implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        // asc
        //return o1.getTitle().compareTo(o2.getTitle());
        //desc
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
