package com.alok;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter base in cm:");
        float b = in.nextFloat();
        System.out.println("enter height in cm:");
        float h = in.nextFloat();
//        float area = (float) (0.5*b*h);
//        System.out.println("area is:"+area);

        while(true){
           float area = (float)(0.5*b*h);
            System.out.println(area);
            break;
        }

    }
}
