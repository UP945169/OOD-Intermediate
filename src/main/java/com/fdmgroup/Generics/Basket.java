package com.fdmgroup.Generics;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    List<T> books = new ArrayList<>();

    public List<T> getAllItems(){
        return books;
    }

    public void addItem(T item){
        books.add(item);
    }
}
