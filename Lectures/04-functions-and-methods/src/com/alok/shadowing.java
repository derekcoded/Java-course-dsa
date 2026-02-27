package com.alok;

public class shadowing {
    static int x=80;//this will be shadowed at  line 8
    //shadowing in java is the practice using two variables with the same name within the scope that overlaps
    public static void main(String[] args) {
        System.out.println(x);//90
      //  int x = 60; //this will shadow var with higher level scope that is "static int x"
        int x;
        //System.out.println(x);// this will give error as
        x=50;//scope will begin when the value is intialized

        System.out.println(x);//60
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
