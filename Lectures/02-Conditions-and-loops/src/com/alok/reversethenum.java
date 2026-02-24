package com.alok;

import java.util.Scanner;

public class reversethenum {
    public static void main(String[] args) {
        //Q:revrse the input number
        Scanner in = new Scanner(System.in);
        int num= 452987;
        int ans =0;
        while (num>0){
            int rem= num%10;
            num /=10;
            ans = ans*10+rem;

        }
        System.out.println(ans);
    }
}
