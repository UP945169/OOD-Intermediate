package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore;

public interface WriteItemCommand {
    void insertItem(Book book);

    void deleteItem(Book book);
}
