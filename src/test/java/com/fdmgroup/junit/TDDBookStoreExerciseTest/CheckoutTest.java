package com.fdmgroup.junit.TDDBookStoreExerciseTest;

import com.fdmgroup.junit.TTDBookStoreExercises.Basket;
import com.fdmgroup.junit.TTDBookStoreExercises.Book;
import com.fdmgroup.junit.TTDBookStoreExercises.Checkout;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {

    Basket basket;
    Book bookObj;
    Book bookObj2;
    Book bookObj3;
    Book BookObj4;
    Book BookObj5;
    Book BookObj6;
    Book BookObj7;
    Book BookObj8;
    Book BookObj9;
    Book BookObj10;

    Checkout checkout;

    @BeforeEach
    void SetUp(){
        basket = new Basket();//Arrange
        bookObj = new Book();//Arrange
        bookObj2 = new Book();//Arrange
        bookObj3 = new Book();//Arrange
        BookObj4 = new Book();
        BookObj5 = new Book();
        BookObj6 = new Book();
        BookObj7 = new Book();
        BookObj8 = new Book();
        BookObj9 = new Book();
        BookObj10 = new Book();
        checkout = new Checkout();//Arrange
    }

    @Test
    void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
        double price  = checkout.calculatePrice(basket); //Act
        List<Book> books = basket.getBooksInBasket();
        assertEquals(0.0,price,0.0001); //Assert
    }

    @Test
    void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook(){
        bookObj.setPrice(1.50);
        basket.addBook(bookObj);
        //int totalItemsInBasket = basket.getBooksInBasket().size();
        double totalPrice  = checkout.calculatePrice(basket);
        //assertEquals(1, totalItemsInBasket);
        assertEquals(1.50,totalPrice,0.0001);
    }

    @Test
    void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBooks(){
        bookObj.setPrice(1.50);
        bookObj2.setPrice(1.50);
        basket.addBook(bookObj);
        basket.addBook(bookObj2);
        double totalprice = checkout.calculatePrice(basket);
        assertEquals(3.00,totalprice,0.0001);
    }

    @Test
    void test_CalculatePrice_ReturnPriceOfBooksInBasketWith1PercentDiscount_WhenPassedBasketWithThreeBooks(){
        bookObj.setPrice(25.99);
        bookObj2.setPrice(25.99);
        bookObj3.setPrice(25.99);
        basket.addBook(bookObj);
        basket.addBook(bookObj2);
        basket.addBook(bookObj3);
        double discount = checkout.calculatePrice(basket);
        assertEquals(77.19,discount, 0.000001);
    }

    @Test
    void test_CalculatePrice_ReturnPriceOfBooksInBasketWith7PercentDiscount_WhenPassedBasketWIthThreeBooks(){
        bookObj.setPrice(25.99);
        bookObj2.setPrice(25.99);
        bookObj3.setPrice(25.99);
        BookObj4.setPrice(25.99);
        BookObj5.setPrice(25.99);
        BookObj6.setPrice(25.99);
        BookObj7.setPrice(25.99);
        basket.addBook(bookObj);
        basket.addBook(bookObj2);
        basket.addBook(bookObj3);
        basket.addBook(BookObj4);
        basket.addBook(BookObj5);
        basket.addBook(BookObj6);
        basket.addBook(BookObj7);

        double discount = checkout.calculatePrice(basket);
        assertEquals(178.29,discount, 0.0001);
    }

    @Test
    void test_CalculatePrice_ReturnsPricesOfBookisInBasketWIth13PercentDiscount_WhenPassedWith10Books(){
        bookObj.setPrice(25.99);
        bookObj2.setPrice(25.99);
        bookObj3.setPrice(25.99);
        BookObj4.setPrice(25.99);
        BookObj5.setPrice(25.99);
        BookObj6.setPrice(25.99);
        BookObj7.setPrice(25.99);
        BookObj8.setPrice(25.99);
        BookObj9.setPrice(25.99);
        BookObj10.setPrice(25.99);
        basket.addBook(bookObj);
        basket.addBook(bookObj2);
        basket.addBook(bookObj3);
        basket.addBook(BookObj4);
        basket.addBook(BookObj5);
        basket.addBook(BookObj6);
        basket.addBook(BookObj7);
        basket.addBook(BookObj8);
        basket.addBook(BookObj9);
        basket.addBook(BookObj10);

        double discount = checkout.calculatePrice(basket);
        assertEquals(226.11,discount, 0.0001);
    }
}
