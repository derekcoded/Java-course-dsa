package com.alok;

import java.util.Scanner;

public class takeinput {
    public static void main(String[] args) {

        // Q5. Keep taking numbers as inputs till the user enters 'x'
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (type 'x' to stop):");

        while (true) {
            String input = in.next();   // Take input as String

            if (input.equalsIgnoreCase("x")) {
                break;   // Stop loop
            }

            int a = Integer.parseInt(input); // Convert to int
            sum = sum + a;   // Add to sum
        }

        System.out.println("Total sum: " + sum);

        in.close();
    }
}