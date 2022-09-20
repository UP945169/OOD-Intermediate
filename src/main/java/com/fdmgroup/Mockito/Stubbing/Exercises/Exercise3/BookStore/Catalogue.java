package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private List<Book> books = new ArrayList<>();
    private ReadItemCommand readItemCommand;

    private WriteItemCommand writeItemCommand;

    public Catalogue(ReadItemCommand readItemCommand, WriteItemCommand writeItemCommand) {
        this.readItemCommand = readItemCommand;
        this.writeItemCommand = writeItemCommand;
    }



    public List<Book> getAllBooks(){
        return readItemCommand.readAll();
    }

    public void addBooks(List<Book> books){
        for (Book book:books) {
            writeItemCommand.insertItem(book);
        }
    }

    public void addBook(Book book){

    }

    public Book getBook(String ISBN){
        return null;
    }

    public void deleteBook(Book book){

    }

    public void deleteAllBooks(){

    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
