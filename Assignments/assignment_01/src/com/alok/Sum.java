package com.alok;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //Q2. Take two numbers and print the sum of both.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum:"+sum);
    }
}
