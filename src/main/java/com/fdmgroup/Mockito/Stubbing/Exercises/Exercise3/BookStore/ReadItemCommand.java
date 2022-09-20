package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore;

import java.util.List;

public interface ReadItemCommand {
    List<Book> readAll();
    Book getItem(String id);
}
