package com.alok;

import java.util.Scanner;

public class powers {
 //   calculate powers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base value:");
        int base = sc.nextInt();
        System.out.println("enter exponent value:");
        int exponent = sc.nextInt();

        int result=1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println(result);
    }
}
