package com.alok;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Q.why not if statements over switch:
        // Ans:-if statements just checks the value of object,mean int a = "KUNAL"  and int b="kunal" are same in if statements.
        // a==b  checks the value as well as reference of object therefore we are going to use .eqals() here. it will show "KUNAL" and "kunal"  same.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name of fruit:");
        String fruit = in.next();
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("red sweet fruit");
//                break;
//            case "banana":
//                System.out.println("related to sprituality");
//                break;
//            case "guava":
//                System.out.println("best with salt");
//                break;
//            case "grapes":
//                System.out.println("smaller in size but great for health");
//            default:
//                System.out.println("enter a valid fruit");
//        }
//Lets make this more clean code
        switch (fruit){
            case "mango"-> System.out.println("king of fruit");//break is not required in this
            case "apple"-> System.out.println("red sweet fruit");
            case "banana"-> System.out.println("longer one");
            case "orange"-> System.out.println("good for summers");
            default -> System.out.println("enter valid fruit");
        }

    }

}
