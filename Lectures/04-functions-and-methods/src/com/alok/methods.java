package com.alok;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {

        //sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,50);
        System.out.println(ans);

    }
    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }
    //return the value
    static int sum2(){

        Scanner in = new Scanner(System.in);
        System.out.print("enter number1:");
        int n1 = in.nextInt();
        System.out.print("enter number 2:");
        int n2 = in.nextInt();
        int sum = n1+n2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number1:");
        int n1 = in.nextInt();
        System.out.print("enter number 2:");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("sum is:"+sum);

    }
}
