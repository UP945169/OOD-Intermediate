package com.fdmgroup.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Product,Integer> productsInStock = new HashMap<Product, Integer>();

        Product product1 = new Product(1, "Product1");
        Product product2 = new Product(2, "Product2");
        Product product3 = new Product(3, "Product3");

        productsInStock.put(product1,50);
        productsInStock.put(product2,200);
        productsInStock.put(product3,300);

        for (Product products: productsInStock.keySet()) {
            System.out.println(products.getName() + ": " + productsInStock.get(products));
        }
    //Exercises start at 1:21:47 seconds on the recorded lecture

    }


}
