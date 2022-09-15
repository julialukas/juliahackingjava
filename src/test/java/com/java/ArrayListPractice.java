package com.java;

import java.util.Collections;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
       n.add(1);
        n.add(1);
        n.add(3);
        n.add(1);
        n.add(5);
        n.add(1);
        findUnique(n);
    }
    public static void findUnique(List<Integer> nums) {
        for (Integer i : nums) {
            if (Collections.frequency(nums, i) == 1) {
                System.out.println(i + " ");
            }
        }
    }

    public static boolean isOnlyOdd(List<Integer>list) {
        if (list.size() < 1) {
            return false;
        }
        for (Integer i : list) {
            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
