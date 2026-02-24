package com.alok;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        //Q1. Input a year and find whether it is a leap year or not.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = in.nextInt();
        if (year%4==0){
            System.out.println("leap year");

        }
        else{
            System.out.println("not a leap year");
        }
    }
}
