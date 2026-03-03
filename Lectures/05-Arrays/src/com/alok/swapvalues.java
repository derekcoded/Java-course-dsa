package com.alok;

import java.util.Arrays;

public class swapvalues {
    public static void main(String[] args) {
        int[] arr = {1,2,34,24,13,22};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int arr[], int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
