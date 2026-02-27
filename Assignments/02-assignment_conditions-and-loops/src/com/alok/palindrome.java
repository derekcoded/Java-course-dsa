package com.alok;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int original = num;
        int r=0;
        while (num>0) {
            int rem = num%10;
            num =num/10;
            r = r*10+rem;
        }
        if (r==original) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
