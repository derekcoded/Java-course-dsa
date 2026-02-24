package com.alok;

import java.util.Scanner;

public class simple_for_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //for loop
//        int b = input.nextInt();
//        for (int i = 0;  i <= 10; i++) {
//            System.out.println(b);
//        }
        //Q2: print numbers from 1 to 10
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//        }
        //Q3: print numbers from 1 to N
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print(i+" ");
        }
    }
}
