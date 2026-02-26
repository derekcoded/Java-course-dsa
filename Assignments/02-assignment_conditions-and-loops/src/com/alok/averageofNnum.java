package com.alok;

import java.util.Scanner;

public class averageofNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//enter N e.g =3
        int sum = 0;

        for (int i = 1; i <= n; i++) { //take N inputs  e.g.take 3 inputs
            int num = sc.nextInt();
            sum = sum + num;
        }

        double average = (double) sum / n;
        System.out.println(average);

    }
}
