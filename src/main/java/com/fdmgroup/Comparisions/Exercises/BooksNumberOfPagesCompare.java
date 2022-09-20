package com.fdmgroup.Comparisions.Exercises;

import java.util.Comparator;

public class BooksNumberOfPagesCompare implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return ( (Integer) o1.getNumberOfPages()).compareTo(o2.getNumberOfPages());
    }
}
