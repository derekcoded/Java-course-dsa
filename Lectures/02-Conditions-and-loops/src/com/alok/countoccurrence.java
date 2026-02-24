package com.alok;

public class countoccurrence {
    public static void main(String[] args) {
        //Q:find the occurrence of any digit in a number
        //Note: n%10 will always give the last digit- this can be used to find the frequency of any digit
        int num = 952899219;
        int count=0;
        while(num>0){
            int rem = num%10;
            if (rem == 9){
                count++;
            }
                num = num/10;

        }
        System.out.println(count);
    }
}
