package com.fdmgroup.Mockito.Stubbing.Exercises.Exercise3.BookStore;

public class Checkout {
    public double calculatePrice(Basket basket){
        double price=0.0;
        for (int i = 0; i < basket.getBooksInBasket().size(); i++) {
            price += basket.getBooksInBasket().get(i).getPrice();
        }
        if(basket.getBooksInBasket().size() <= 3){
            System.out.println("Three books in basket");
            //double percentageOfPrice = (1/100) * price;
            price = (price) * 0.99;
        }
        if(basket.getBooksInBasket().size() <= 7){
            System.out.println("Three books in basket");
            //double percentageOfPrice = (1/100) * price;
            price = (price) * 0.98;
        }

        if(basket.getBooksInBasket().size() >= 10){
            System.out.println("Ten books in basket");
            price = (price) * 0.87;
        }

        price = (double) Math.round(price * 100)/100;
        return price;
    }


}
