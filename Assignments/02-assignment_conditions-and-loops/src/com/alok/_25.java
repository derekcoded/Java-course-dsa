package com.alok;

import java.util.Scanner;

public class _25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int largest=n;
        while (n!=0){
            if(n>largest){
                largest=n;
            }
            n = in.nextInt();

        }
        System.out.println(largest);
    }
}
