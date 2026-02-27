package com.alok;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
       // fn(2,5,1,2,4,2,4,2,5);//we can input as many as want
        multiple(2,3,"alok","nirala","jvbdjvbjd");
    }
    static void multiple(int a, int b, String ...v){

    }
    /*static void fn(int ...v){//we can give any no. of inputs we want by using "... this is array"
        System.out.println(Arrays.toString(v));
        }
    */
}
