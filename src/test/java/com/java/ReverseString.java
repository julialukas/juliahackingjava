package com.java;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println(StrReverse("Danny"));
    }
        public static String StrReverse(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.toCharArray()[i];
            }
            return reverse;


        }

}