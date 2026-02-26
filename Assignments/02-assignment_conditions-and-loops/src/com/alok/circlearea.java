package com.alok;

import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius in cm:");
        int r = in.nextInt();
        float area = (float) (3.1415*r*r);
        System.out.println("area of circle is:"+" "+area+" sq.cm");

    }
}
