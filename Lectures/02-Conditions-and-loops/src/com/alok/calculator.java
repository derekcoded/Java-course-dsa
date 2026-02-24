package com.alok;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input until user press 'x' or 'X'
        int ans= 0;
        while(true){
            System.out.println("Enter operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op=='/' || op == '%'){
                System.out.println("Enter two  numbers:");
                int n1= in.nextInt();
                int n2=in.nextInt();
                if (op=='+'){
                    ans=n1+n2;
                }
                if (op=='-'){
                    ans=n1-n2;
                }
                if (op=='*'){
                    ans=n1*n2;
                }
                if (op=='/'){
                    if (n2!=0){
                        ans = n1/n2;
                    }
                }
                if (op == '%'){
                    ans = n1%n2;
                }
            }
            else if (op == 'X' || op=='x') {
                break;

            }
            else {
                System.out.println("invalid operation!");
            }

            System.out.println(ans);
        }
    }
}
