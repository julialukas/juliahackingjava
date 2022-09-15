package com.java;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num){
        String j = ""+num;
        int sum = 0;
        for (int i=0; i<j.length();i++){
            int n = (Integer.parseInt(String.valueOf(j.charAt(i))));
            n=n*n*n;
            sum+=n;
            System.out.println(sum);
        }
        if(sum==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
