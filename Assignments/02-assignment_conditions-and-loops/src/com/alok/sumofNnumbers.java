package com.alok;

import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers :");
        int n = in.nextInt();
       int sum=0;
        for (int i = 1; i <=n; i++) {
            System.out.println("enter number"+i);
            int nums=in.nextInt();
            System.out.print("sum:");
            sum =sum+nums;



        }
        System.out.println(sum);
    }
}
