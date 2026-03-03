package com.alok;

import java.util.Arrays;

public class maxitem {
    public static void main(String[] args) {
        int[] arr = {1,2,34,24,13,22};
        //System.out.println(max(arr));
        //System.out.println(maxRange(arr,3, 5));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    //to find maximum iten in an array
//    static int max(int[] arr){
    // if(arr.length==0){
    // return -1;
    // }
//        int maxV = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//           if (arr[i]>maxV){
//               maxV=arr[i];
//             }
//
//
//        }
//        return maxV;
    //to find max in an range
//    static int maxRange(int[] arr, int start, int end){
//        if (end>start){
//            return -1;
//
//        }
//        if (arr==null){
//            return -1;
//        }
//
//        int maxV = arr[start];
//        for (int i = start; i <=end; i++) {
//            if (arr[i]>maxV){
//                maxV=arr[i];
//            }
//
//
//        }
//        return maxV;
//
//    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }


    }
    static void swap(int arr[], int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    //reverse an array

}
