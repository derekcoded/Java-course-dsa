package com.alok;

import java.util.Scanner;

public class leetcodeproblem1 {
    public static void main(String[] args) {
        //Q:Subtract the Product and Sum of Digits of an Integer
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers:");
        int a = in.nextInt();
        int b= in.nextInt();
        int c= (a*b) - (a+b);
        System.out.println(c);
    }
}
