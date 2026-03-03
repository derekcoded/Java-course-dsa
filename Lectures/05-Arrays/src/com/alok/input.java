package com.alok;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives
//        int[] arr = new int [5];
//        arr [0] = 12;
//        arr [1] = 11;
//        arr [2] = 19;
//        arr [3] = 55;
//        arr [4] =63;
//        //System.out.println(arr[3]);
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = in.nextInt();
//        }

            // easiest way to print:
      //  System.out.println(Arrays.toString(arr));


        // can be converted into enhanced for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for(int num: arr){// for every element in the arr print element
//            System.out.println(num+" "); //here the num represets the elements of the array
//        }

        // array of objects

        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[i] = in.next();

            
        }
        System.out.println(Arrays.toString(str));
    }
}
