package com.alok;
import java.util.Scanner;
public class hcfandlcm {
    public static void main(String[] args) {
        //Q4. Take 2 numbers as inputs and find their HCF and LCM.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;

        // Find HCF using loop
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        // Calculate LCM using formula
        int lcm = (num1 * num2) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);

        sc.close();
    }
}
