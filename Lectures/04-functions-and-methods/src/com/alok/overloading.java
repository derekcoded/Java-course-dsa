package com.alok;

public class overloading {
    //two or more functions of same name can exist if the parameters are different
    public static void main(String[] args) {
        fn(54);
        fn("jhfdjbsj");
        fn(4,5);
    }
    static void fn(int a){
        System.out.println(a);
    }
    static void fn(String b){
        System.out.println(b);
    }
    static void fn(int a, int b){
        System.out.println(a+b);
    }//if do not pass any arguement while calling function the program will show error as compiler will be confused by which function to call
}
