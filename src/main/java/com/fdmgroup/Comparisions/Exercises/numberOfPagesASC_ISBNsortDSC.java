package com.fdmgroup.Comparisions.Exercises;

import java.util.Comparator;

public class numberOfPagesASC_ISBNsortDSC implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.equals(o2)){
            return ((Integer) o1.getIsbn()).compareTo(o2.getIsbn());
        }
        return ((Integer) o1.getNumberOfPages()).compareTo(o2.getNumberOfPages());
    }
}
