package com.fdmgroup.Generics;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List list = new ArrayList();


        Basket<Book> basketOfBooks= new Basket<>();
        Basket<Toy> basketOfToys = new Basket<Toy>();
        Basket<String> basketOfStrings = new Basket<>();

        Book book = new Book();
        Toy toy = new Toy();

        basketOfToys.addItem(toy);
        basketOfBooks.addItem(book);


        GenericClass<Integer> genericClassInteger = new GenericClass<>();
        GenericClass<Double> genericClassDouble = new GenericClass<>();
        //GenericClass<String> genericClassString = new GenericClass<>();
    }
}
