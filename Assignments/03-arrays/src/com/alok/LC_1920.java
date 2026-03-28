package com.alok;


import java.util.Arrays;

class LC_1920 {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];


        for(int i = 0;i<nums.length; i++){
            result[i] = nums[nums[i]];

        }

        return result;
    }
    public static void main(String[] args) {
        LC_1920 obj = new LC_1920();

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = obj.buildArray(nums);

        System.out.println(Arrays.toString(result));
    }
}