package com.alok;

import java.util.Scanner;

public class largestnum {
    public static void main(String[] args) {
        //Q1:find largest number among 3 numbers using if-else
        Scanner input = new Scanner(System.in);
        System.out.println("print three numbers:");
        int a = input.nextInt();
        int b= input.nextInt();
        int c = input.nextInt();
//        if (a>b && a>c){
//            System.out.println(a+" "+"is largest number");
//
//        } else if (b>a && b>c) {
//            System.out.println(b+" "+"is largest number");
//
//        }
//        else{
//            System.out.println(c+" "+"is largest number");
//        }
       // same question using kunal kushwaha video
//
        // for good time complexity it can be done in java as

        int max =Math.max(c, Math.max(a,b));

        System.out.println(max);
    }

}
