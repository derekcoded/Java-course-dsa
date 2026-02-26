package com.alok;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("enter length:");
        float l = in.nextFloat();
        System.out.println("enter base:");
        float b = in.nextFloat();
        float area = (float) l*b;
        System.out.println(area);


    }
}
