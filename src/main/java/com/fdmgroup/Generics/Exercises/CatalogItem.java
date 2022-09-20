package com.fdmgroup.Generics.Exercises;

public interface CatalogItem <T extends Number> {
    T getId();

    void setId(T id);
}
