package com.alok;

import java.util.Scanner;

public class fibonacci {
    //Q1: find the nth fibonacci number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0; //previous number
        int i = 1;//current index num
        int count = 2;
        while (count<=n){
            int temp = i;
            i = i+p;
            p = temp;
            count++;

        }
        System.out.println(i);
    }
}
