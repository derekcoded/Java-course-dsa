package com.alok;

public class scope {
    public static void main(String[] args) {
        //scope:where we can access our var
        int a=10; //initialization
        int b = 20;

        {
            int c =40;//value initialized in this block can be accessed in the same block only
            a=30; // we cannot initialize the var again though we can modify the value
        }
       // System.out.println(c);//thus, this will give error
        //*anything initialized outside can be accessed inside another block but can can not be initialized again in oanother block also anything initialized inside the block can not be accessed outside the block
    }
}
