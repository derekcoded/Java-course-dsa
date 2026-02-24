package com.alok;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        //Q3. Take a number as input and print the multiplication table for it.
        Scanner in = new Scanner(System.in);
        System.out.println("enter number:");
        int a= in.nextInt();
        int i=1;
        while(i<=10){
            int b = a*i;
            System.out.println(a+"*"+i+"="+b);
            i++;

        }
    }
}
