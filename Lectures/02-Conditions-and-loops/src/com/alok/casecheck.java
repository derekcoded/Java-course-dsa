package com.alok;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        //Q1:check whether the first word of any string is capital or not
        Scanner input = new Scanner(System.in);
        // trim basically trims the extra space before the word
        char ch = input.next().trim().charAt(0);
//        String word = "hello";
//        System.out.println(word.charAt(0));
        if(ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else {
            System.out.println("uppercase");
        }

    }
}
