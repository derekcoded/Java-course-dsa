package com.alok;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println(" enter some numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}

