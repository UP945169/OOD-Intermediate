package com.fdmgroup.Mockito;

import com.fdmgroup.Mockito.Stubbing.Basket;
import com.fdmgroup.Mockito.Stubbing.Book;
import com.fdmgroup.Mockito.Stubbing.Checkout;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestCaseCheckout {

    Checkout checkout;


    //The class we are testing is the ONLY real object
    @BeforeEach
    void setUp() throws Exception{
        checkout = new Checkout();
    }

    @Mock
    Basket mockBasket;
    @Mock
    Book mockBook1, mockBook2, mockBook3;



    //ALL the OTHER objects are going to be mocked
    @Test
    void test_CalculatePrice_callsMockBasketGetBooksInBasketMethod(){
        checkout.calculateprice(mockBasket); //Act
        verify(mockBasket).getBooksInBasket();
    }

    @Test
    void test_calculatePrice_returns20point5_whenBooksCosting9point25And11point25InBasket() {
        //mockBook2.setPrice(3.00);
        //mockBook1.setPrice(2.50);

        when(mockBook1.getPrice()).thenReturn(10.50);
        when(mockBook2.getPrice()).thenReturn(13.55);

        List<Book> mockBooks = new ArrayList<Book>(Arrays.asList(mockBook1,mockBook2));
        when(mockBasket.getBooksInBasket()).thenReturn(mockBooks);

        double total = checkout.calculateprice(mockBasket);
        assertEquals(20.5,total);
//        System.out.println("Book1: " + mockBook1.getPrice());
//        System.out.println("Book2: " + mockBook2.getPrice());
    }

    @Test
    void test_calculatePrice_returns25_whenBooksCosting9point25And11point25And4point5InBasket() {
        //mockBook2.setPrice(3.00);
        //mockBook1.setPrice(2.50);

        when(mockBook1.getPrice()).thenReturn(10.50);
        when(mockBook2.getPrice()).thenReturn(13.55);

        List<Book> mockBooks = new ArrayList<Book>(Arrays.asList(mockBook1,mockBook2));
        when(mockBasket.getBooksInBasket()).thenReturn(mockBooks);

        double total = checkout.calculateprice(mockBasket);
        assertEquals(20.5,total);
//        System.out.println("Book1: " + mockBook1.getPrice());
//        System.out.println("Book2: " + mockBook2.getPrice());
    }


    @Test
    void test_emptyBasket_callsRemoveBookTwice_whenTwoBooksInBasket(){
        List<Book> mockBooks = new ArrayList<Book>(Arrays.asList(mockBook1,mockBook2));
        when(mockBasket.getBooksInBasket()).thenReturn(mockBooks);
        checkout.emptyBasket(mockBasket);


        verify(mockBasket,times(2)).removeBook(any(Book.class));
    }

    @Test
    void test_emptyBasket_callsRemoveBookThreeTimes_whenThreeBooksInBasket(){
        List<Book> mockBooks = new ArrayList<Book>(Arrays.asList(mockBook1,mockBook2,mockBook3));
        when(mockBasket.getBooksInBasket()).thenReturn(mockBooks);

        checkout.emptyBasket(mockBasket);

        verify(mockBasket,times(3)).removeBook(any(Book.class));
    }
}
