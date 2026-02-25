package com.alok;

import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String message = greet();
//        System.out.println(message);
        String custom = mygreet(in.next());
        System.out.println(custom);

    }

     static String mygreet(String name) {
        String mssg = "hello"+" "+name;
        return mssg;

    }

    static String greet(){
        Scanner in = new Scanner(System.in);
        String mssg = in.next();
        return mssg;
    }
}
