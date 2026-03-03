package com.alok;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(674);
//        list.add(85);
//        list.add(65);
//        list.add(24);
//        list.add(30);
//        list.add(52);
//        list.add(49);
//        list.add(65);
//        list.add(24);
//        list.add(30);
//        list.add(65);
//        list.add(24);
        //functions
//        System.out.println(list.contains(52)); //true or false
//        list.set(0,99); // update value at 0th index by 99
//        list.remove(2); //remove value at index 2
//
//        System.out.print(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());

        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
