package com.fdmgroup.Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,1,5,7,9,4));
        System.out.println("===========ArrayList===========");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("===========LinkedList===========");
        List<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(1,2,3,1,5,7,9,4));
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("===========Vector===========");
        List<Integer> vectorList = new Vector<>(Arrays.asList(1,2,3,1,5,7,9,4));
        for (int i = 0; i < vectorList.size(); i++) {
            System.out.println(vectorList.get(i));
        }

    }
}
