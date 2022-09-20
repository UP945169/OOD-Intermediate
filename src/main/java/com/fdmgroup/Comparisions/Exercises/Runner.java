package com.fdmgroup.Comparisions.Exercises;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Book book1 = new Book("Learn Java", 45678, 19.99, 500, 4.3);
        Book book2 = new Book("Learn UNIX", 65432, 17.5, 650, 3.9);
        Book book3 = new Book("Learn SQL", 87956, 9.75, 220, 4.4);
        Book book4 = new Book("Learn Agile", 35367, 25.5, 500, 4.4);
        Book book5 = new Book("Learn React", 55676, 28.75, 490, 4.8);
        Book book6 = new Book("Learn Javascript", 34343, 14.99, 300, 4.4);
        Book book7 = new Book("Learn Python", 65767, 27.25, 500, 4.1);

        List<Book> books = new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7));

        Collections.sort(books, new BooksNumberOfPagesCompare());

        System.out.println("========Question 1===========");
        for (Book book:books) {
            System.out.println(book.getTitle() + ": " + "Book ISBN: " + book.getIsbn() + "Book price:" +
                    book.getPrice() + "Book numbers: " + book.getNumberOfPages());
        }

        System.out.println("=========Question 2===========");

        Collections.sort(books, new BooksNameCompare());
        for (Book book:books) {
            System.out.println(book.getTitle() + ": " + "Book ISBN: " + book.getIsbn() + "Book price: " + book.getPrice());
        }

        System.out.println("=========Question 3===========");
        Collections.sort(books, new BookPriceDSC());
        for (Book book:books) {
            System.out.println(book.getTitle() + ": " + "Book ISBN: " + book.getIsbn() + "Book price: " + book.getPrice());
        }

        System.out.println("=========Question 4===========");
        Collections.sort(books, new numberOfPagesASC_ISBNsortDSC());
        for(Book book:books){
            System.out.println(book.getTitle() + ": " + "Book ISBN: " + book.getIsbn() + " Book price: " +
                    book.getPrice() + " Number of pages: " + book.getNumberOfPages());
        }

        System.out.println("=========Question 5===========");
        Collections.sort(books, new numberOfPagesASC_ISBNsortDSC());
        for (Book book:books) {
            System.out.println(book.getTitle() + ": " + "Book ISBN: " + book.getIsbn() + " Book price: " +
                    book.getPrice() + " Number of pages: " + book.getNumberOfPages() + "Rating: " + book.getRating());
        }

        System.out.println("========Question 1.4===========");
        //TreeSet and comparators
        TreeSet<Book> BookInTree = new TreeSet<>();
        
        System.out.println("========Unsorted TreeSet========");

    }
}
