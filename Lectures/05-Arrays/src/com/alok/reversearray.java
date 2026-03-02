package com.alok;

public class reversearray {

    // Method to reverse array
    static void reverseArray(int[] arr) {
        int n = arr.length;

        // Temporary array
        int[] temp = new int[n];

        // Copy in reverse order
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 6, 5};

        reverseArray(arr);

        // Print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}