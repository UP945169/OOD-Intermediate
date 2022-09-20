package com.fdmgroup.junit.TDDBookStoreExerciseTest;

import com.fdmgroup.junit.TTDBookStoreExercises.Basket;
import com.fdmgroup.junit.TTDBookStoreExercises.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestBasket {


    Basket basket; //Arrange
    Book bookObj;

    @BeforeEach
    void setUp(){
        basket = new Basket(); //Arrange
        bookObj = new Book();
    }

    @Test
    void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
        List<Book> book = basket.getBooksInBasket(); //Act
        assertEquals(0, book.size());
    }

    @Test
    void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
        basket.addBook(bookObj);
        List<Book> books = basket.getBooksInBasket();
        assertEquals(1, books.size());
    }

    @Test
    void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddingTwoBooksToAddBookMethod(){
        basket.addBook(bookObj);
        basket.addBook(bookObj);
        List<Book> books = basket.getBooksInBasket();
        assertEquals(2,books.size());
    }
}
