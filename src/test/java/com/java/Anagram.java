package com.java;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        boolean match = false;
        if(a.length()==b.length()){
            char []arra= a.toCharArray();
            char []arrb= b.toCharArray();
            Arrays.sort(arra);
            Arrays.sort(arrb);
            match = Arrays.equals(arra,arrb);
            System.out.println(match);
        }
        if (match){
            return true;
        }else{
            System.out.println(match);
            return false;
        }
    }

    public static void main(String[] args) {
        isAnagram("maam", "amam");
    }
}



