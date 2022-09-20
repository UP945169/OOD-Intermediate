package com.fdmgroup.Mockito.Stubbing;

import java.util.List;

public class Checkout {
    public double calculateprice(Basket basket){
        List<Book> books = basket.getBooksInBasket();

        double total = 0;

        for(Book book : books) {
            total += book.getPrice();
        }

        return total;
    }

    public void emptyBasket(Basket basket){
        for (Book books:basket.getBooksInBasket()) {
            basket.removeBook(books);
        }
    }
}
