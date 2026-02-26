package com.alok;

import java.util.Scanner;

public class printfactors {
    public static void main(String[] args) {
        //Q:Input a number and print all the factors of that number (use loops)
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int a = in.nextInt();
        for (int i = 1; i <=a; i++) {
            if (a%i==0) {
                System.out.println(i + " ");
            }

        }


    }

}
