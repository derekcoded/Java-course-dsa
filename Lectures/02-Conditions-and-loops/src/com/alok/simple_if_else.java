package com.alok;

import java.util.Scanner;

public class simple_if_else {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        if (a%2==0){
            System.out.println(a+" "+"is even");
        }
        else{
            System.out.println(a+" "+"is odd");
        }
    }
}
