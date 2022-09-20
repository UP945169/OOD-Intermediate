package com.fdmgroup.Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(1,2,3,1,5,7,9,4));

        System.out.println("Queue contains: " + queue.size() + " elements");
        System.out.println("Next item " + queue.poll());
        System.out.println("Queue contains: " + queue.size() + " elements");

        //use a while look because there are no indexes with a queue only a
        //head and tail so for loop wouldn't work
        while (queue.size() > 0){
            System.out.println("Queue contains: " + queue.size() + " elements");
            System.out.println("Next item " + queue.poll());
            System.out.println("Queue contains: " + queue.size() + " elements");
        }

        System.out.println("=======Priority Queue==============");

        Queue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(1,2,3,1,5,7,9,4));

        while (priorityQueue.size() > 0){
            System.out.println("Queue contains: " + priorityQueue.size() + " elements");
            System.out.println("Next item " + priorityQueue.poll());
            System.out.println("Queue contains: " + priorityQueue.size() + " elements");
        }

        Queue<Product> priorityQueueProduct = new PriorityQueue<>();
        Product product1= new Product(1,"product1");
        Product product2 = new Product(2,"Product2");
        priorityQueueProduct.add(product1);
        priorityQueueProduct.add(product2);


    }
}
