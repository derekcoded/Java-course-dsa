package com.alok;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid= in.nextInt();
        String dept = in.next();
//        switch (empid){
//            case 1:
//                System.out.println("alok");
//                break;
//            case 2:
//                System.out.println("amresh");
//                break;
//            case 3:
//                System.out.println("emp 3:");
//                switch (dept) {
//                    case "IT":
//                        System.out.println("IT");
//                        break;
//                    case "mgmt":
//                        System.out.println("mgmg");
//                        break;
//                    default:
//                        System.out.println("no dept found");
//                }
//                break;
//            default:
//                System.out.println("not valid empid");
//        }
        // cleaner and better way to write
        switch (empid) {
            case 1 -> System.out.println("alok");
            case 2 -> System.out.println("amresh");
            case 3 -> {
                System.out.println("emp 3:");
                switch (dept) {
                    case "IT" -> System.out.println("IT");
                    case "mgmt" -> System.out.println("mgmg");
                    default -> System.out.println("no dept found");
                }
            }
            default -> System.out.println("not valid empid");
        }


    }
}
