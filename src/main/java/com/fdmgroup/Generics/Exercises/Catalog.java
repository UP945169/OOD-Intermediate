package com.fdmgroup.Generics.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Catalog <T>{
    List<T> items = new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }
    public T findItem(int number){
        return items.get(number);
    }
}
