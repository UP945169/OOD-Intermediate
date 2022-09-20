package com.fdmgroup.Mockito.Stubbing;

import java.util.ArrayList;
import java.util.List;

public interface Basket {

    List<Book> getBooksInBasket();

    void addBook(Book book);
    void removeBook(Book book);

}
