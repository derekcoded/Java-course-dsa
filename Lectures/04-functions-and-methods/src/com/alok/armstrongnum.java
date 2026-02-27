package com.alok;

public class armstrongnum {
    public static void main(String[] args) {
        //System.out.println(isArmstrong(153));
        for (int i = 100; i <1000 ; i++) {

         if (isArmstrong(i)==true){
           System.out.print(i+" ");
           }
        }

    }
    static boolean isArmstrong(int n){
        int num = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum+rem*rem*rem;

        }
//        if (sum==num){ //this can simplified to line no.21
//            return true;
//        }
//        return false;
        return sum==num;
    }
}
