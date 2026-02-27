package com.alok;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if (n<=1) return false;
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        while(a*a<=n){
            if(n%a==0){
                return false;
            }
            a++;
        }
        if(a*a>n){
            return true;
        }
        return false;
    }
}
