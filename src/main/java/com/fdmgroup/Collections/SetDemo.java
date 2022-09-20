package com.fdmgroup.Collections;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,2,3,1,5,7,9,4));

        System.out.println("Hash set");
        for (Integer number:set) {
            System.out.println(number);
        }

        System.out.println(set.contains(1));

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(1,2,3,1,5,7,9,4));
        System.out.println("Tree set");
        //Numerical orders the elements but will be slower compared to the HashSet
        for (Integer number:treeSet) {
            System.out.println(number);
        }

        System.out.println(treeSet.contains(1));
    }
}
