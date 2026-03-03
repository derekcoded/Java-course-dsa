package com.alok;

import java.util.Arrays;
import java.util.Scanner;

public class multidimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*concept:
        1 2 3
        4 5 6
        7 8 9
         */
        //number of rows are always mandatory
        //no. of coloumns are not mandatory if rows is already specified
//        int[][] arr = new int[3][];
        // simply can be done as
//        int[][] arr= {
//                {1,2,3,4},//0th index
//                {5,6},//1st index
//                {7,8,9}//2nd index
//        };// imagine this as array of multiple arrays
      //  arr[2] = {7,8,9} as output
        // arr[2][2] = 6 as output
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no. of rows = 3
        //input:
        for (int row = 0; row <arr.length ; row++) {
            // for each coloumn in every row
            for (int col = 0; col < arr[row].length; col++) { //since col lengthis not fixed
                arr[row][col] = in.nextInt();
            }


        }
        //output
//        for (int row = 0; row <arr.length ; row++) {
//            // for each coloumn in every row
//            for (int col = 0; col < arr[row].length; col++) { //since col length is not fixed
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println(); // for new line
//
//        }
        //another way to print output
//        for (int row = 0; row <arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //enhanced for loop
//        for(int [] a: arr){
//            System.out.println(Arrays.toString(a));
//        }





    }
}
