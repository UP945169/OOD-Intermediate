package com.fdmgroup.Generics.Exercises;

public class Runner{
    public static void main(String[] args) {
        //add items
        Catalog <Book> ct = new Catalog<Book>();
        Book <Integer> book = new Book<Integer>(1);
        Book book2 = new Book(2);

        ct.addItem(book);
        ct.addItem(book2);

        //Borrower
        Borrower borrower = new Borrower(1);
        Borrower borrower2 = new Borrower(2);


    }
}
