package com.fdmgroup.Generics.Exercises;

public class Borrower<T extends Number> implements CatalogItem <T>{
    private T id;

    public Borrower(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
