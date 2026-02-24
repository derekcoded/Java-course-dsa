package com.alok;

import java.util.Scanner;

public class nestedif_else {
    public static void main(String[] args) {
        // result grade system: to get grade by entering percentage
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your percentage in numbers:");
        int a = input.nextInt();

        if (a>=90 && a <=100){
            System.out.println("your grade is: A+");
        }
        else if (a>=80) {
            System.out.println("your grade is: A");
        } else if (a>=30) {
            System.out.println("your grade is :B");
        }
        else if(a>100){
            System.out.println("enter valid percentage");
    }
        else {
            System.out.println("your'e fail");
        }
    }
}
