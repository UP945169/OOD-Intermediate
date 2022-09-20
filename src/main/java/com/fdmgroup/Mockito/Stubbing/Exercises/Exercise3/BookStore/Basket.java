package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Book> books = new ArrayList<Book>();
    public List<Book> getBooksInBasket(){
        return books;
    }



    public void addBook(Book book){
        books.add(book);
    }

}
