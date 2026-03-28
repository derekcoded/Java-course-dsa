package com.alok;


class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int [2*n];
        for(int i=0; i<n;i++){
            ans[i] = nums[i];
            ans[i+n]= nums[i];

        }
        return ans;
    }
}
public class lc_1929 {
    public static void main(String[] args) {
        Solution sol = new Solution();  // create object

        int[] nums = {1, 2, 3};         // sample input
        int[] result = sol.getConcatenation(nums);

        // print output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
