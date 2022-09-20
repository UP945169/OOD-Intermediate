package com.fdmgroup.Generics.Exercises;

public class Book<T extends Number> implements CatalogItem <T>{
    private T id;

    public Book(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
